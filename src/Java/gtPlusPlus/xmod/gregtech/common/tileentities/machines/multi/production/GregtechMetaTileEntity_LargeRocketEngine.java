package gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.production;

import java.util.ArrayList;
import java.util.Collection;

import gregtech.api.GregTech_API;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.TAE;
import gregtech.api.enums.Textures;
import gregtech.api.gui.GT_GUIContainer_MultiMachine;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.implementations.GT_MetaTileEntity_Hatch;
import gregtech.api.metatileentity.implementations.GT_MetaTileEntity_Hatch_Dynamo;
import gregtech.api.metatileentity.implementations.GT_MetaTileEntity_Hatch_Input;
import gregtech.api.metatileentity.implementations.GT_MetaTileEntity_Hatch_Muffler;
import gregtech.api.objects.GT_RenderedTexture;
import gregtech.api.util.GT_Recipe;
import gregtech.api.util.GT_Utility;
import gregtech.api.util.GTPP_Recipe;
import gtPlusPlus.api.objects.Logger;
import gtPlusPlus.core.block.ModBlocks;
import gtPlusPlus.core.item.chemistry.RocketFuels;
import gtPlusPlus.core.lib.LoadedMods;
import gtPlusPlus.core.material.MISC_MATERIALS;
import gtPlusPlus.core.util.minecraft.FluidUtils;
import gtPlusPlus.core.util.minecraft.ItemUtils;
import gtPlusPlus.xmod.gregtech.api.metatileentity.implementations.GT_MetaTileEntity_Hatch_AirIntake;
import gtPlusPlus.xmod.gregtech.api.metatileentity.implementations.GT_MetaTileEntity_Hatch_Muffler_Adv;
import gtPlusPlus.xmod.gregtech.api.metatileentity.implementations.base.GregtechMeta_MultiBlockBase;
import gtPlusPlus.xmod.gregtech.common.blocks.textures.TexturesGtBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidStack;

public class GregtechMetaTileEntity_LargeRocketEngine extends GregtechMeta_MultiBlockBase
{
	protected int fuelConsumption;
	protected int fuelValue;
	protected int fuelRemaining;
	protected int freeFuelTicks = 0;
	protected int euProduction = 0;
	protected boolean boostEu;

	public static String mLubricantName = "Carbon Dioxide";
	public static String mCoolantName = "Liquid Hydrogen";

	public static String mCasingName = "Turbodyne Casing";
	public static String mIntakeHatchName = "Tungstensteel Turbine Casing";
	public static String mGearboxName = "Inconel Reinforced Casing";


	private final static int CASING_ID = TAE.getIndexFromPage(3, 11);
	
	public ArrayList<GT_MetaTileEntity_Hatch> mAllDynamoHatches = new ArrayList<GT_MetaTileEntity_Hatch>();

	public GregtechMetaTileEntity_LargeRocketEngine(final int aID, final String aName, final String aNameRegional) {
		super(aID, aName, aNameRegional);
		this.fuelConsumption = 0;
		this.fuelValue = 0;
		this.fuelRemaining = 0;
		this.boostEu = false;
	}

	public GregtechMetaTileEntity_LargeRocketEngine(final String aName) {
		super(aName);
		this.fuelConsumption = 0;
		this.fuelValue = 0;
		this.fuelRemaining = 0;
		this.boostEu = false;
	}

	@Override
	public String[] getTooltip() {
		if (mCasingName.toLowerCase().contains(".name")) {
			mCasingName = ItemUtils.getLocalizedNameOfBlock(ModBlocks.blockCasings4Misc, 11);
		}
		if (mIntakeHatchName.toLowerCase().contains(".name")) {
			mIntakeHatchName = ItemUtils.getLocalizedNameOfBlock(ModBlocks.blockCasings4Misc, 11);
		}
		if (mGearboxName.toLowerCase().contains(".name")) {
			mGearboxName = ItemUtils.getLocalizedNameOfBlock(ModBlocks.blockCasings3Misc, 1);
		}
		if (mLubricantName.toLowerCase().contains(".")) {
			mLubricantName = FluidUtils.getFluidStack("carbondioxide", 1).getLocalizedName();
		}
		if (mCoolantName.toLowerCase().contains(".")) {
			mCoolantName = FluidUtils.getFluidStack("liquidhydrogen", 1).getLocalizedName();
		}
		return new String[] { 
				"Controller Block for the Large Rocket Engine",
				"Supply Rocket Fuels and 1000L(3000L boosted) of "+mLubricantName+" per hour to run",
				"Supply 4L of "+mCoolantName+" per second per 2100 eu/t to boost output (optional)", 
				"Consumes 2000L/s of air per 16384 eu/t produced",
				"Produces as much energy as you put fuel in",
				"produses 1500 posution/S per 16384 eu/t produced",
				"When producing more then 32K eu/t fuel wil be consume less efficiently (3x - 1.5x eff@57Keu/t input energy)",
				"formula: x = input of energy (10K^(1/3)/ x^(1/3)) * (40K^(1/3)/ x^(1/3))",
				"Boosting will produce 3x the amount of power but will consume 3x fuel",
				"Size(WxHxD): 3x3x10, Controller (front centered)",
				"3x3x10 of "+mCasingName+" (hollow, Min 64!)",
				"8x "+mGearboxName+" inside the Hollow Casing",
				"1x Dynamo Hatch (Top Middle, Max 8) suports tectech dynamos",
				"8x Air Intake Hatch (one of the Casings next to a "+mGearboxName+", top row allowed)",
				"3x Input Hatch (Rocket Fuel/Booster/co2) (one of the Casings next to a "+mGearboxName+", top row not allowed)",
				"1x Input Bus to supply filters for advanced muffler (one of the Casings next to a \"+mGearboxName+\", top row not allowed)",
				"1x Maintenance Hatch (one of the Casings next to a "+mGearboxName+")", 
				"1x Muffler Hatch (Back Centre)",
		};
	}

	@Override
	public ITexture[] getTexture(final IGregTechTileEntity aBaseMetaTileEntity, final byte aSide, final byte aFacing, final byte aColorIndex, final boolean aActive, final boolean aRedstone) {
		if (aSide == aFacing) {
			return new ITexture[] { Textures.BlockIcons.getCasingTextureForId(CASING_ID), new GT_RenderedTexture(aActive ? TexturesGtBlock.Overlay_Machine_Controller_Advanced_Active : TexturesGtBlock.Overlay_Machine_Controller_Advanced) };
		}
		return new ITexture[] { Textures.BlockIcons.getCasingTextureForId(CASING_ID) };
	}

	@Override
	public boolean isCorrectMachinePart(final ItemStack aStack) {
		return this.getMaxEfficiency(aStack) > 0;
	}

	@Override
	public Object getClientGUI(final int aID, final InventoryPlayer aPlayerInventory, final IGregTechTileEntity aBaseMetaTileEntity) {
		return super.getClientGUI(aID, aPlayerInventory, aBaseMetaTileEntity);
	}

	public int getAir() {
		if (this.mAirIntakes.isEmpty() || this.mAirIntakes.size() <= 0) {
			return 0;
		}
		else {
			int totalAir = 0;
			FluidStack airstack = FluidUtils.getFluidStack("air", 1);
			for (GT_MetaTileEntity_Hatch_AirIntake u : this.mAirIntakes) {
				if (u != null && u.mFluid != null) {
					// had this trow errors cousing the machine to stop probebly fixed
					FluidStack f = u.mFluid;
					if (f.isFluidEqual(airstack)) {
						totalAir += f.amount;
					}
				}
			}
			return totalAir;
		}		
	}

	@Override
	public boolean checkRecipe(final ItemStack aStack) {
		final ArrayList<FluidStack> tFluids = this.getStoredFluids();
		FluidStack air = FluidUtils.getFluidStack("air", 1);

		int aircount = getAir() ;
		if (aircount <  euProduction/100) {
			//log("Not Enough Air to Run "+aircount);
			return false;
		}
		else {		
			boolean hasIntakeAir = this.depleteInput(FluidUtils.getFluidStack(air, euProduction/100));
			if (!hasIntakeAir) {
				//log("Could not consume Air to run "+aircount);
				freeFuelTicks = 0;
				return false;
			}			
		}
		// reste fuel ticks incase it does not reset when it stops
		if (freeFuelTicks != 0 && this.mProgresstime == 0 && this.mEfficiency == 0)
			freeFuelTicks = 0;
		
		//log("Running "+aircount);
		log("looking at hatch");
		final Collection<GT_Recipe> tRecipeList = GTPP_Recipe.GTPP_Recipe_Map.sRocketFuels.mRecipeList;
		
		
		if (tFluids.size() > 0 && tRecipeList != null) {
			
			if (tFluids.contains(MISC_MATERIALS.CARBON_DIOXIDE.getFluid(this.boostEu ? 3 : 1)) || tFluids.contains(FluidUtils.getFluidStack("carbondioxide", (this.boostEu ? 3 : 1)))) {
				if (this.mRuntime % 72 == 0 || this.mRuntime == 0) {
					if (!consumeCO2()) {
						freeFuelTicks = 0;
						return false;
					}
				}
			} else
			{
				freeFuelTicks = 0;
				return false;
			}
			
			if (freeFuelTicks == 0)
				this.boostEu = consumeLOH();
			
			for (final FluidStack hatchFluid1 : tFluids) {
				if (hatchFluid1.isFluidEqual(air)) {
					continue;
				}
				
				if (freeFuelTicks == 0) {
					for (final GT_Recipe aFuel : tRecipeList) {
						final FluidStack tLiquid;
						tLiquid = aFuel.mFluidInputs[0];
						if (hatchFluid1.isFluidEqual(tLiquid)) {
							if (!consumeFuel(aFuel,hatchFluid1.amount)) {
								continue;
							}	
							this.fuelValue = aFuel.mSpecialValue;
							this.fuelRemaining = hatchFluid1.amount;
							this.mEUt = (int) ((this.mEfficiency < 2000) ? 0 : GT_Values.V[5]<<1);
							this.mProgresstime = 1;
							this.mMaxProgresstime = 1;
							this.mEfficiencyIncrease =  euProduction/2000; 
							return true;
							//log("");
						}
					}
				
				} else
				{
					this.mEfficiencyIncrease =  euProduction/2000; 
					freeFuelTicks--;
					this.mEUt = (int) ((this.mEfficiency < 1000) ? 0 : GT_Values.V[5]<<1);
					this.mProgresstime = 1;
					this.mMaxProgresstime = 1;
					return true;
				}
				
			}
		}
		this.mEUt = 0;
		this.mEfficiency = 0;
		freeFuelTicks = 0;
		return false;
	}

	/**
	 * Consumes Fuel if required. Free Fuel Ticks are handled here.
	 * @param aFuel
	 * @return
	 */
	public boolean consumeFuel(GT_Recipe aFuel,int amount) {	
			amount *= this.boostEu ? 0.3 : 0.9;
			freeFuelTicks = 0;
			int value = aFuel.mSpecialValue * 3;
			int energy = value * amount;
			if (amount < 5)
				return false;
			FluidStack tLiquid = FluidUtils.getFluidStack(aFuel.mFluidInputs[0], (this.boostEu ? amount * 3 : amount));			
			if (!this.depleteInput(tLiquid)) {
				return false;
			}
			else {					
				this.fuelConsumption = this.boostEu ? amount * 3 : amount;						
				this.freeFuelTicks = 20;
				setEUProduction(energy);
				return true;
			}		
	}

	public void setEUProduction(int energy){
		energy /= 20;
		double energyEfficiency;
		double tDevideEnergy = Math.cbrt(energy);
		if (energy > 10000) {
			//cbrt(10 000) / 
			energyEfficiency =  ((double) 21.5443469/tDevideEnergy);
			if (energy >= 40000)
				//cbrt(40 000) /
				energyEfficiency *= ((double)34.19951893/tDevideEnergy);
			energyEfficiency *= energy;
		} 
		else {
			energyEfficiency = energy;
		}
		euProduction = (int) ((double) energyEfficiency * 1.84);
		if (this.boostEu)
			euProduction *= 3;
	}

	public boolean consumeCO2() {
		if (this.depleteInput(MISC_MATERIALS.CARBON_DIOXIDE.getFluid(this.boostEu ? 3 : 1)) || this.depleteInput(FluidUtils.getFluidStack("carbondioxide", (this.boostEu ? 3 : 1)))) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean consumeLOH() {
		int LOHamount = (3 * euProduction)/1000;
		return this.depleteInput(FluidUtils.getFluidStack(RocketFuels.Liquid_Hydrogen, LOHamount)); //(40 * ((long) euProduction / 10000))
	}

	@Override
	public boolean checkMultiblock(final IGregTechTileEntity aBaseMetaTileEntity, final ItemStack aStack) {
		byte tSide = getBaseMetaTileEntity().getBackFacing();
		int tX = getBaseMetaTileEntity().getXCoord();
		int tY = getBaseMetaTileEntity().getYCoord();
		int tZ = getBaseMetaTileEntity().getZCoord();
		
		this.mTecTechDynamoHatches.clear();
		this.mAllDynamoHatches.clear();
		
		final int MAX_LENGTH = 8;
		for (int length=0;length<MAX_LENGTH;length++) {
			if(getBaseMetaTileEntity().getBlockAtSideAndDistance(tSide, length+1) != getGearboxBlock()) {
				log("Bad Gearbox Block");
				return false;
			}
			if(getBaseMetaTileEntity().getMetaIDAtSideAndDistance(tSide, length+1) != getGearboxMeta()) {
				log("Bad Gearbox Meta");
				return false;
			}
		}
		log("Found "+MAX_LENGTH+" "+mGearboxName+"s.");		
		for (byte i = -1; i < 2; i = (byte) (i + 1)) {
			for (byte j = -1; j < 2; j = (byte) (j + 1)) {
				if ((i != 0) || (j != 0)) {
					for (byte aLength = 0; aLength < (MAX_LENGTH+2); aLength = (byte) (aLength + 1)) { // Length


						final int fX = tX - (tSide == 5 ? 1 : tSide == 4 ? -1 : i),
								fZ = tZ - (tSide == 2 ? -1 : tSide == 3 ? 1 : i),
								aY = tY + j,
								aX = tX + (tSide == 5 ? aLength : tSide == 4 ? -aLength : i),
								aZ = tZ + (tSide == 2 ? -aLength : tSide == 3 ? aLength : i);


						//Why check for air in world when each intake requires 1 air block?
						//final Block frontAir = getBaseMetaTileEntity().getBlock(fX, aY, fZ);
						//final String frontAirName = frontAir.getUnlocalizedName();						
						//if(!(getBaseMetaTileEntity().getAir(fX, aY, fZ) || frontAirName.equalsIgnoreCase("tile.air") || frontAirName.equalsIgnoreCase("tile.railcraft.residual.heat"))) {
						//log("Bad Air Check");
						//return false; //Fail if vent blocks are obstructed
						//}

						if (((i == 0) || (j == 0)) && ((aLength > 0) && (aLength <= MAX_LENGTH))) {
							log("Checking for Hatches. "+aLength);
							//Top Row
							if (j == 1) {
								if (addDynamoToMachineList(getBaseMetaTileEntity().getIGregTechTileEntity(aX, aY, aZ), getCasingTextureIndex())) {
									// Do Nothing
								}
								else if (addAirIntakeToMachineList(getBaseMetaTileEntity().getIGregTechTileEntity(aX, aY, aZ), getCasingTextureIndex())) {
									// Do Nothing
								}	
								else if (getBaseMetaTileEntity().getBlock(aX, aY, aZ) == getCasingBlock() && getBaseMetaTileEntity().getMetaID(aX, aY, aZ) == getCasingMeta()) {
									// Do nothing
								}
								else {
									log("Top Row - "+aLength+" | Did not find casing or Dynamo");
									return false;
								}
							}
							else {
								IGregTechTileEntity aCheck = getBaseMetaTileEntity().getIGregTechTileEntity(aX, aY, aZ);
								if (aCheck != null) {
									final IMetaTileEntity bCheck = aCheck.getMetaTileEntity();							        
									// Only allow Dynamos on Top
									if (bCheck instanceof GT_MetaTileEntity_Hatch_Dynamo) {
										log("Found dynamo in disallowed location | "+aX+", "+aY+", "+aZ+" | "+i+", "+j+", "+aLength);
										return false;
									}
								}	
								if (addAirIntakeToMachineList(getBaseMetaTileEntity().getIGregTechTileEntity(aX, aY, aZ), getCasingTextureIndex())) {
									// Do Nothing
								}	
								else if (addInputToMachineList(getBaseMetaTileEntity().getIGregTechTileEntity(aX, aY, aZ), getCasingTextureIndex())) {
									// Do Nothing
								}
								else if (addOutputToMachineList(getBaseMetaTileEntity().getIGregTechTileEntity(aX, aY, aZ), getCasingTextureIndex())) {
									// Do Nothing
								}
								else if (getBaseMetaTileEntity().getBlock(aX, aY, aZ) == getCasingBlock() && getBaseMetaTileEntity().getMetaID(aX, aY, aZ) == getCasingMeta()) {
									// Do nothing
								}
								else {log("Bad block.");
								return false;
								}

							}
							log("Passed check. "+aLength);

						} else if (aLength == 0) {
							log("Searching for Gearbox");							
							if (addMaintenanceToMachineList(getBaseMetaTileEntity().getIGregTechTileEntity(aX, aY, aZ), getCasingTextureIndex())) {
								// Do Nothing
							}
							else if(!(getBaseMetaTileEntity().getBlock(aX, aY, aZ) == getCasingBlock() && getBaseMetaTileEntity().getMetaID(aX, aY, aZ) == getCasingMeta())) {
								log("Bad Missing Casing || Bad Meta");
								return false;
							}
							else {								
								log("Found "+mCasingName+".");								
							}
						} else if (getBaseMetaTileEntity().getBlock(aX, aY, aZ) == getCasingBlock() && getBaseMetaTileEntity().getMetaID(aX, aY, aZ) == getCasingMeta()) {
							log("Found Casing.");
							// Do nothing
						} else {
							log("Bad XXX");
							return false;
						}
					}
				}
			}
		}

		this.mMufflerHatches.clear();
		IGregTechTileEntity tTileEntity = getBaseMetaTileEntity().getIGregTechTileEntityAtSideAndDistance(getBaseMetaTileEntity().getBackFacing(), MAX_LENGTH+1);
		if ((tTileEntity != null) && (tTileEntity.getMetaTileEntity() != null)) {
			if ((tTileEntity.getMetaTileEntity() instanceof GT_MetaTileEntity_Hatch_Muffler)) {
				this.mMufflerHatches.add((GT_MetaTileEntity_Hatch_Muffler) tTileEntity.getMetaTileEntity());
				this.updateTexture(tTileEntity, getCasingTextureIndex());
			}
		}
		
		mAllDynamoHatches.addAll(this.mDynamoHatches);

		if (LoadedMods.TecTech) {
			mAllDynamoHatches.addAll(this.mTecTechDynamoHatches);
		}

		if (this.mAllDynamoHatches.size() <= 0 || this.mAllDynamoHatches.isEmpty()) {
			log("Wrong count for Dynamos");			
			return false;			
		}
		
		if (this.mMufflerHatches.size() != 1 || this.mMufflerHatches.isEmpty()) {
			log("Wrong count for Mufflers");			
			return false;			
		}
		
		if (this.mAirIntakes.size() < 8 || this.mAirIntakes.isEmpty()) {
			log("Wrong count for Air Intakes | "+this.mAirIntakes.size());			
			return false;			
		}
		if (this.mMaintenanceHatches.size() < 1 || this.mMaintenanceHatches.isEmpty()) {
			log("Wrong count for Maint. Hatches");			
			return false;			
		}


		log("Formed Rocket Engine.");
		return true;
	}
	
	@Override
	 public boolean addEnergyOutput(long aEU) {
        if (aEU <= 0) {
            return true;
        }
        if (mAllDynamoHatches.size() > 0) {
            return addEnergyOutputMultipleDynamos(aEU, true);
        }
        return false;
    }
	
	
	public boolean addEnergyOutputMultipleDynamos(long aEU, boolean aAllowMixedVoltageDynamos) {
        int injected = 0;
        long totalOutput = 0;
        long aFirstVoltageFound = -1;
        boolean aFoundMixedDynamos = false;
        for (GT_MetaTileEntity_Hatch aDynamo : mAllDynamoHatches) {
            if( aDynamo == null ) {
                return false;
            }
            if (isValidMetaTileEntity(aDynamo)) {
                long aVoltage = aDynamo.maxEUOutput();
                long aTotal = aDynamo.maxAmperesOut() * aVoltage;
                // Check against voltage to check when hatch mixing
                if (aFirstVoltageFound == -1) {
                    aFirstVoltageFound = aVoltage;
                }
                else {
                    /**
                      * Calcualtes overclocked ness using long integers
                      * @param aEUt          - recipe EUt
                      * @param aDuration     - recipe Duration
                      * @param mAmperage     - should be 1 ?
                      */
                    //Long time calculation
                    if (aFirstVoltageFound != aVoltage) {
                        aFoundMixedDynamos = true;
                    }
                }
                totalOutput += aTotal;
            }
        }

        if (totalOutput < aEU || (aFoundMixedDynamos && !aAllowMixedVoltageDynamos)) {
            explodeMultiblock();
            return false;
        }

        long leftToInject;
        //Long EUt calculation
        long aVoltage;
        //Isnt too low EUt check?
        int aAmpsToInject;
        int aRemainder;

        //xEUt *= 4;//this is effect of everclocking
        for (GT_MetaTileEntity_Hatch aDynamo : mAllDynamoHatches) {
            if (isValidMetaTileEntity(aDynamo)) {
                leftToInject = aEU - injected;
                aVoltage = aDynamo.maxEUOutput();
                aAmpsToInject = (int) (leftToInject / aVoltage);
                aRemainder = (int) (leftToInject - (aAmpsToInject * aVoltage));
                long powerGain;
                for (int i = 0; i < Math.min(aDynamo.maxAmperesOut(), aAmpsToInject + 1); i++) {
                    if (i == Math.min(aDynamo.maxAmperesOut(), aAmpsToInject)){
                        powerGain = aRemainder;
                    }else{
                        powerGain =  aVoltage;
                    }
                    aDynamo.getBaseMetaTileEntity().increaseStoredEnergyUnits(powerGain, false);
                    injected += powerGain;
                }
            }
        }
        return injected > 0;
    }
	
	@Override
	public boolean onRunningTick(ItemStack aStack) {
		if (this.mRuntime%20 == 0) {
			if (mMufflerHatches.size() == 1 && mMufflerHatches.get(0) instanceof GT_MetaTileEntity_Hatch_Muffler_Adv) {
				GT_MetaTileEntity_Hatch_Muffler_Adv tMuffler = (GT_MetaTileEntity_Hatch_Muffler_Adv) mMufflerHatches.get(0);
				if (!tMuffler.hasValidFilter()) {
					ArrayList<ItemStack> tInputs = getStoredInputs();
					for (ItemStack tItem : tInputs) {
						if (tMuffler.isAirFilter(tItem)) {
							tMuffler.mInventory[0] = tItem.copy();
							depleteInput(tItem);
							updateSlots();
							break;
						}
					}
				}
			}
		}
		super.onRunningTick(aStack);
		return true;
	}

	public Block getCasingBlock() {
		return ModBlocks.blockCasings4Misc;
	}

	public byte getCasingMeta() {
		return 11;
	}

	public Block getIntakeBlock() {
		return GregTech_API.sBlockCasings4;
	}

	public byte getIntakeMeta() {
		return 12;
	}

	public Block getGearboxBlock() {
		return ModBlocks.blockCasings3Misc;
	}

	public byte getGearboxMeta() {
		return 1;
	}

	public byte getCasingTextureIndex() {
		return (byte) CASING_ID;
	}

	@Override
	public IMetaTileEntity newMetaEntity(final IGregTechTileEntity aTileEntity) {
		return new GregtechMetaTileEntity_LargeRocketEngine(this.mName);
	}

	@Override
	public void saveNBTData(final NBTTagCompound aNBT) {
		aNBT.setInteger("freeFuelTicks", freeFuelTicks);
		aNBT.setInteger("euProduction", euProduction);
		super.saveNBTData(aNBT);
	}

	@Override
	public void loadNBTData(final NBTTagCompound aNBT) {
		super.loadNBTData(aNBT);
		freeFuelTicks = aNBT.getInteger("freeFuelTicks");
		euProduction = aNBT.getInteger("euProduction");
	}

	@Override
	public int getDamageToComponent(final ItemStack aStack) {
		return 1;
	}

	@Override
	public int getMaxEfficiency(final ItemStack aStack) {
			return euProduction;
	}

	@Override
	public int getPollutionPerTick(final ItemStack aStack) {
		return	75 * ( euProduction / 10000);
	}

	@Override
	public boolean explodesOnComponentBreak(final ItemStack aStack) {
		return true;
	}

	@Override
	public String[] getExtraInfoData() {
		return new String[] { 
				"Rocket Engine",
				"Current Air: "+getAir(),
				"Current Pollution: " + getPollutionPerTick(null),
				"Time until next fuel consumption: "+freeFuelTicks,
				"Current Output: " + this.mEUt * this.mEfficiency / 10000 + " EU/t",
				"Fuel Consumption: " + (this.fuelConsumption) + "L/s",
				"Fuel Value: " + this.fuelValue*3 + " EU/L",
				"Fuel Remaining: " + this.fuelRemaining + " Litres",
				"Current Efficiency: " + this.mEfficiency / 100 + "%", 
				(this.getIdealStatus() == this.getRepairStatus()) ? "No Maintainance issues" : "Needs Maintainance" };
	}

	@Override
	public boolean isGivingInformation() {
		return true;
	}

	@Override
	public boolean hasSlotInGUI() {
		return false;
	}

	@Override
	public String getCustomGUIResourceName() {
		return null;
	}

	@Override
	public String getMachineType() {
		return "Rocket Engine";
	}

	@Override
	public int getMaxParallelRecipes() {
		return 1;
	}

	@Override
	public int getEuDiscountForParallelism() {
		return 0;
	}
}
