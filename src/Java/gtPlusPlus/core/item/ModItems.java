package gtPlusPlus.core.item;
import static gtPlusPlus.core.creative.AddToCreativeTab.tabMachines;
import static gtPlusPlus.core.creative.AddToCreativeTab.tabMisc;
import static gtPlusPlus.core.lib.CORE.LOAD_ALL_CONTENT;
import gregtech.api.enums.Materials;
import gregtech.api.util.GT_OreDictUnificator;
import gtPlusPlus.core.creative.AddToCreativeTab;
import gtPlusPlus.core.item.base.BaseItemBackpack;
import gtPlusPlus.core.item.base.CoreItem;
import gtPlusPlus.core.item.base.foods.BaseItemFood;
import gtPlusPlus.core.item.base.foods.BaseItemHotFood;
import gtPlusPlus.core.item.base.ingots.BaseItemIngot;
import gtPlusPlus.core.item.base.plates.BaseItemPlate;
import gtPlusPlus.core.item.effects.RarityUncommon;
import gtPlusPlus.core.item.general.BufferCore;
import gtPlusPlus.core.item.general.ItemCloakingDevice;
import gtPlusPlus.core.item.general.ItemHealingDevice;
import gtPlusPlus.core.item.general.RF2EU_Battery;
import gtPlusPlus.core.item.general.fuelrods.FuelRod_Base;
import gtPlusPlus.core.item.init.ItemsFoods;
import gtPlusPlus.core.item.tool.misc.SandstoneHammer;
import gtPlusPlus.core.item.tool.staballoy.MultiPickaxeBase;
import gtPlusPlus.core.item.tool.staballoy.StaballoyAxe;
import gtPlusPlus.core.item.tool.staballoy.StaballoyPickaxe;
import gtPlusPlus.core.lib.CORE;
import gtPlusPlus.core.lib.CORE.configSwitches;
import gtPlusPlus.core.lib.LoadedMods;
import gtPlusPlus.core.material.ALLOY;
import gtPlusPlus.core.material.ELEMENT;
import gtPlusPlus.core.util.Utils;
import gtPlusPlus.core.util.debug.DEBUG_INIT;
import gtPlusPlus.core.util.item.UtilsItems;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;
public final class ModItems {

	public static ToolMaterial STABALLOY = EnumHelper.addToolMaterial("Staballoy", 3, 2500, 7, 1.0F, 18);

	public static Item AAA_Broken;

	public static Item itemDebugShapeSpawner;

	public static Item itemBaseSpawnEgg;
	
	
	//Tantaloy60(789, TextureSet.SET_DULL, 8.0F, 5120, 3, 1 | 2 | 16 | 32 | 64 | 128, 213, 231, 237, 0, "Tantaloy 60", 0, 0, 3035, 2200, true, false, 1, 2, 1, Dyes.dyeLightGray, 2, Arrays.asList(new MaterialStack(Tungsten, 1), new MaterialStack(Tantalum, 9)), Arrays.asList(new TC_AspectStack(TC_Aspects.METALLUM, 8), new TC_AspectStack(TC_Aspects.STRONTIO, 3))),
	//Tantaloy61(790, TextureSet.SET_DULL, 7.0F, 5120, 2, 1 | 2 | 16 | 32 | 64 | 128, 193, 211, 217, 0, "Tantaloy 61", 0, 0, 3015, 2150, true, false, 1, 2, 1, Dyes.dyeLightGray, 2, Arrays.asList(new MaterialStack(Tungsten, 1), new MaterialStack(Tantalum, 9), new MaterialStack(Titanium, 1)), Arrays.asList(new TC_AspectStack(TC_Aspects.METALLUM, 8), new TC_AspectStack(TC_Aspects.STRONTIO, 3))),


	//EnderIO
	public static Item itemPlateSoularium;
	public static Item itemPlateRedstoneAlloy;
	public static Item itemPlateElectricalSteel;
	public static Item itemPlatePulsatingIron;
	public static Item itemPlateEnergeticAlloy;
	public static Item itemPlateVibrantAlloy;
	public static Item itemPlateConductiveIron;
	public static Item itemPlateDarkSteel;
	//Big Reactors
	public static Item itemPlateBlutonium;
	public static Item itemPlateCyanite;
	public static Item itemPlateLudicrite;
	//Thaumcraft
	public static Item itemPlateVoidMetal;
	//Pneumaticraft
	public static Item itemPlateCompressedIron;
	//SimplyJetpacks
	public static Item itemPlateEnrichedSoularium;
	//rfTools
	public static Item itemPlateDimensionShard;
	//Staballoy
	public static Item itemStaballoyPickaxe;
	public static Item itemStaballoyAxe;
	//Tools
	public static Item itemSandstoneHammer;
	//Machine Related
	public static Item itemBufferCore0;
	//Material related
	public static Item itemStickyRubber;
	public static Item itemIngotBatteryAlloy;
	public static Item itemPlateBatteryAlloy;
	public static Item itemHeliumBlob;
	public static Item itemPLACEHOLDER_Circuit;

	public static Item FuelRod_Empty;
	public static Item FuelRod_Thorium;
	public static Item FuelRod_Uranium;
	public static Item FuelRod_Plutonium;

	public static Item itemBedLocator_Base;
	public static Item itemBaseItemWithCharge;

	public static Item itemIngotRaisinBread;
	public static Item itemHotIngotRaisinBread;

	public static ItemFood itemFoodRaisinToast;
	public static BaseItemHotFood itemHotFoodRaisinToast;
	public static BaseItemFood itemFoodCurriedSausages;
	public static BaseItemHotFood itemHotFoodCurriedSausages;
	
	public static Item RfEuBattery;
	public static Item itemPersonalCloakingDevice;
	public static Item itemPersonalCloakingDeviceCharged;
	public static Item itemPersonalHealingDevice;

	public static MultiPickaxeBase MP_GTMATERIAL;	
	
	public static BaseItemBackpack backpack_Red;
	public static BaseItemBackpack backpack_Green;
	public static BaseItemBackpack backpack_Blue;
	public static BaseItemBackpack backpack_Yellow;
	public static BaseItemBackpack backpack_Purple;
	public static BaseItemBackpack backpack_Cyan;
	public static BaseItemBackpack backpack_Maroon;
	public static BaseItemBackpack backpack_Olive;
	public static BaseItemBackpack backpack_DarkGreen;
	public static BaseItemBackpack backpack_DarkPurple;
	public static BaseItemBackpack backpack_Teal;
	public static BaseItemBackpack backpack_Navy;
	public static BaseItemBackpack backpack_Silver;
	public static BaseItemBackpack backpack_Gray;
	public static BaseItemBackpack backpack_Black;
	public static BaseItemBackpack backpack_White;
	
	public static Item dustLithiumCarbonate;


	//@SuppressWarnings("unused")
	public static final void init(){

		AAA_Broken = new BaseItemIngot("AAA_Broken", "Errors - Tell Alkalus", Utils.rgbtoHexValue(128, 128, 128), 0);

		//Debug Loading
		if (CORE.DEBUG){
			DEBUG_INIT.registerItems();
		}		
		
		//Make some backpacks
		//Primary colours
		backpack_Red = new BaseItemBackpack("backpackRed", Utils.rgbtoHexValue(200, 0, 0));
		backpack_Green = new BaseItemBackpack("backpackGreen", Utils.rgbtoHexValue(0, 200, 0));
		backpack_Blue = new BaseItemBackpack("backpackBlue", Utils.rgbtoHexValue(0, 0, 200));
		//Secondary Colours
		backpack_Yellow = new BaseItemBackpack("backpackYellow", Utils.rgbtoHexValue(200, 200, 0));
		backpack_Purple = new BaseItemBackpack("backpackPurple", Utils.rgbtoHexValue(200, 0, 200));
		backpack_Cyan = new BaseItemBackpack("backpackCyan", Utils.rgbtoHexValue(0, 200, 200));
		//Tertiary Colours
		backpack_Maroon = new BaseItemBackpack("backpackMaroon", Utils.rgbtoHexValue(128, 0, 0));
		backpack_Olive = new BaseItemBackpack("backpackOlive", Utils.rgbtoHexValue(128, 128, 0));
		backpack_DarkGreen = new BaseItemBackpack("backpackDarkGreen", Utils.rgbtoHexValue(0, 128, 0));
		backpack_DarkPurple = new BaseItemBackpack("backpackDarkPurple", Utils.rgbtoHexValue(128, 0, 128));
		backpack_Teal = new BaseItemBackpack("backpackTeal", Utils.rgbtoHexValue(0, 128, 128));
		backpack_Navy = new BaseItemBackpack("backpackNavy", Utils.rgbtoHexValue(0, 0, 128));
		//Shades
		backpack_Silver = new BaseItemBackpack("backpackSilver", Utils.rgbtoHexValue(192, 192, 192));
		backpack_Gray = new BaseItemBackpack("backpackGray", Utils.rgbtoHexValue(128, 128, 128));
		backpack_Black = new BaseItemBackpack("backpackBlack", Utils.rgbtoHexValue(20, 20, 20));
		backpack_White = new BaseItemBackpack("backpackWhite", Utils.rgbtoHexValue(240, 240, 240));
		
		//Start meta Item Generation
		ItemsFoods.load();

		UtilsItems.generateItemsFromMaterial(ALLOY.ENERGYCRYSTAL);
		UtilsItems.generateItemsFromMaterial(ALLOY.BLOODSTEEL);
		UtilsItems.generateItemsFromMaterial(ALLOY.STABALLOY);
		UtilsItems.generateItemsFromMaterial(ALLOY.TANTALLOY_60);
		UtilsItems.generateItemsFromMaterial(ALLOY.TANTALLOY_61);
		UtilsItems.generateItemsFromMaterial(ALLOY.BEDROCKIUM);
		UtilsItems.generateItemsFromMaterial(ALLOY.QUANTUM);
		

		UtilsItems.generateItemsFromMaterial(ALLOY.INCONEL_625);
		UtilsItems.generateItemsFromMaterial(ALLOY.INCONEL_690);
		UtilsItems.generateItemsFromMaterial(ALLOY.INCONEL_792);

		if (!CORE.MAIN_GREGTECH_5U_EXPERIMENTAL_FORK){
			UtilsItems.generateItemsFromMaterial(ALLOY.TUNGSTEN_CARBIDE);
		}
		UtilsItems.generateItemsFromMaterial(ALLOY.SILICON_CARBIDE);
		UtilsItems.generateItemsFromMaterial(ALLOY.ZERON_100);
		UtilsItems.generateItemsFromMaterial(ALLOY.MARAGING250);
		UtilsItems.generateItemsFromMaterial(ALLOY.MARAGING300);
		UtilsItems.generateItemsFromMaterial(ALLOY.MARAGING350);
		UtilsItems.generateItemsFromMaterial(ALLOY.STELLITE);
		UtilsItems.generateItemsFromMaterial(ALLOY.TALONITE);
		
		//Tumbaga was the name given by Spaniards to a non-specific alloy of gold and copper 
		UtilsItems.generateItemsFromMaterial(ALLOY.TUMBAGA);
		//Potin is traditionally an alloy of bronze, tin and lead, with varying quantities of each possible
		UtilsItems.generateItemsFromMaterial(ALLOY.POTIN);
		

		UtilsItems.generateItemsFromMaterial(ALLOY.HASTELLOY_W);
		UtilsItems.generateItemsFromMaterial(ALLOY.HASTELLOY_X);
		UtilsItems.generateItemsFromMaterial(ALLOY.HASTELLOY_C276);
		UtilsItems.generateItemsFromMaterial(ALLOY.HASTELLOY_N);
		
		UtilsItems.generateItemsFromMaterial(ALLOY.INCOLOY_020);
		UtilsItems.generateItemsFromMaterial(ALLOY.INCOLOY_DS);
		UtilsItems.generateItemsFromMaterial(ALLOY.INCOLOY_MA956);
		
		
		UtilsItems.generateItemsFromMaterial(ELEMENT.ZIRCONIUM);
		UtilsItems.generateItemsFromMaterial(ALLOY.ZIRCONIUM_CARBIDE);
		UtilsItems.generateItemsFromMaterial(ALLOY.TANTALUM_CARBIDE);
		UtilsItems.generateItemsFromMaterial(ALLOY.NIOBIUM_CARBIDE);
		
		
		
		//Uranium-233 is a fissile isotope of uranium that is bred from thorium-232 as part of the thorium fuel cycle.
		UtilsItems.generateItemsFromMaterial(ELEMENT.URANIUM233);
		
		
		
		dustLithiumCarbonate = UtilsItems.generateSpecialUseDusts("LithiumCarbonate", "Lithium Carbonate", Utils.rgbtoHexValue(137, 139, 142))[0];

		
		
		boolean gtStyleTools = true;

		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Wood);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Cobblestone);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Iron);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.WroughtIron);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.DarkIron);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Gold);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Silver);
		
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Diamond);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Emerald);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Ruby);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Sapphire);

		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Cupronickel);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Brass);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Bronze);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Steel);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Lead);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Titanium);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Tungsten);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Platinum);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Chrome);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.TungstenSteel);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Aluminium);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Thaumium);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Cobalt);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Iridium);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Ultimet);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Osmiridium);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.NetherStar);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Naquadah);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.NaquadahAlloy);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.NaquadahEnriched);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Neutronium);
		
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Thorium);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.DamascusSteel);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Magnalium);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.BlackSteel);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Invar);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.MeteoricSteel);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.StainlessSteel);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.BlueSteel);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Neodymium);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.Desh);
		MP_GTMATERIAL = UtilsItems.generateMultiPick(gtStyleTools, Materials.ElectrumFlux);
		
		//EnderIO Resources
		if (LoadedMods.EnderIO || LOAD_ALL_CONTENT){
			Utils.LOG_INFO("EnderIO Found - Loading Resources.");
			//Item Init
			itemPlateSoularium = new Item().setUnlocalizedName("itemPlateSoularium").setCreativeTab(AddToCreativeTab.tabMisc).setTextureName(CORE.MODID + ":itemPlateSoularium");
			itemPlateRedstoneAlloy = new Item().setUnlocalizedName("itemPlateRedstoneAlloy").setCreativeTab(AddToCreativeTab.tabMisc).setTextureName(CORE.MODID + ":itemPlateRedstoneAlloy");
			itemPlateElectricalSteel = new Item().setUnlocalizedName("itemPlateElectricalSteel").setCreativeTab(AddToCreativeTab.tabMisc).setTextureName(CORE.MODID + ":itemPlateElectricalSteel");
			itemPlatePulsatingIron = new Item().setUnlocalizedName("itemPlatePulsatingIron").setCreativeTab(AddToCreativeTab.tabMisc).setTextureName(CORE.MODID + ":itemPlatePulsatingIron");
			itemPlateEnergeticAlloy = new Item().setUnlocalizedName("itemPlateEnergeticAlloy").setCreativeTab(AddToCreativeTab.tabMisc).setTextureName(CORE.MODID + ":itemPlateEnergeticAlloy");
			itemPlateVibrantAlloy = new Item().setUnlocalizedName("itemPlateVibrantAlloy").setCreativeTab(AddToCreativeTab.tabMisc).setTextureName(CORE.MODID + ":itemPlateVibrantAlloy");
			itemPlateConductiveIron = new Item().setUnlocalizedName("itemPlateConductiveIron").setCreativeTab(AddToCreativeTab.tabMisc).setTextureName(CORE.MODID + ":itemPlateConductiveIron");
			itemPlateDarkSteel = new Item().setUnlocalizedName("itemPlateDarkSteel").setCreativeTab(AddToCreativeTab.tabMisc).setTextureName(CORE.MODID + ":itemPlateDarkSteel");
			//Registry
			GameRegistry.registerItem(itemPlateSoularium, "itemPlateSoularium");
			GameRegistry.registerItem(itemPlateRedstoneAlloy, "itemPlateRedstoneAlloy");
			GameRegistry.registerItem(itemPlateElectricalSteel, "itemPlateElectricalSteel");
			GameRegistry.registerItem(itemPlatePulsatingIron, "itemPlatePulsatingIron");
			GameRegistry.registerItem(itemPlateEnergeticAlloy, "itemPlateEnergeticAlloy");
			GameRegistry.registerItem(itemPlateVibrantAlloy, "itemPlateVibrantAlloy");
			GameRegistry.registerItem(itemPlateConductiveIron, "itemPlateConductiveIron");
			GameRegistry.registerItem(itemPlateDarkSteel, "itemPlateDarkSteel");
		}
		else {
			Utils.LOG_WARNING("EnderIO not Found - Skipping Resources.");
		}
		//Big Reactors
		if (LoadedMods.Big_Reactors|| LOAD_ALL_CONTENT){
			Utils.LOG_INFO("BigReactors Found - Loading Resources.");
			//Item Init
			itemPlateBlutonium = new Item().setUnlocalizedName("itemPlateBlutonium").setCreativeTab(AddToCreativeTab.tabMisc).setTextureName(CORE.MODID + ":itemPlateBlutonium");
			itemPlateCyanite = new Item().setUnlocalizedName("itemPlateCyanite").setCreativeTab(AddToCreativeTab.tabMisc).setTextureName(CORE.MODID + ":itemPlateCyanite");
			itemPlateLudicrite = new Item().setUnlocalizedName("itemPlateLudicrite").setCreativeTab(AddToCreativeTab.tabMisc).setTextureName(CORE.MODID + ":itemPlateLudicrite");
			//Registry
			GameRegistry.registerItem(itemPlateBlutonium, "itemPlateBlutonium");
			GameRegistry.registerItem(itemPlateCyanite, "itemPlateCyanite");
			GameRegistry.registerItem(itemPlateLudicrite, "itemPlateLudicrite");
		}
		else {
			Utils.LOG_WARNING("BigReactors not Found - Skipping Resources.");
		}
		//Thaumcraft
		if (LoadedMods.Thaumcraft|| LOAD_ALL_CONTENT){
			Utils.LOG_INFO("Thaumcraft Found - Loading Resources.");
			//Item Init
			try {
				itemPlateVoidMetal = new Item().setUnlocalizedName("itemPlateVoidMetal").setCreativeTab(AddToCreativeTab.tabMisc).setTextureName(CORE.MODID + ":itemPlateVoidMetal");
			} catch (NullPointerException e){
				e.getClass();
			}
			//Registry
			GameRegistry.registerItem(itemPlateVoidMetal, "itemPlateVoidMetal");
		}
		else {
			Utils.LOG_WARNING("Thaumcraft not Found - Skipping Resources.");
		}
		//ExtraUtils
		if (LoadedMods.Extra_Utils|| LOAD_ALL_CONTENT){
			Utils.LOG_INFO("ExtraUtilities Found - Loading Resources.");
			//Item Init
			try {
				//itemPlateBedrockium = new Item().setUnlocalizedName("itemPlateBedrockium").setCreativeTab(AddToCreativeTab.tabMisc).setTextureName(CORE.MODID + ":itemPlateBedrockium");
			} catch (NullPointerException e){
				e.getClass();
			}
			//Registry
			//GameRegistry.registerItem(itemPlateBedrockium, "itemPlateBedrockium");
		}
		else {
			Utils.LOG_WARNING("ExtraUtilities not Found - Skipping Resources.");
		}
		//Pneumaticraft
		if (LoadedMods.PneumaticCraft|| LOAD_ALL_CONTENT){
			Utils.LOG_INFO("PneumaticCraft Found - Loading Resources.");
			//Item Init
			itemPlateCompressedIron = new Item().setUnlocalizedName("itemPlateCompressedIron").setCreativeTab(AddToCreativeTab.tabMisc).setTextureName(CORE.MODID + ":itemPlateCompressedIron");
			//Registry
			GameRegistry.registerItem(itemPlateCompressedIron, "itemPlateCompressedIron");
		}
		else {
			Utils.LOG_WARNING("PneumaticCraft not Found - Skipping Resources.");
		}
		//Simply Jetpacks
		if (LoadedMods.Simply_Jetpacks|| LOAD_ALL_CONTENT){
			Utils.LOG_INFO("SimplyJetpacks Found - Loading Resources.");
			//Item Init
			itemPlateEnrichedSoularium = new RarityUncommon().setUnlocalizedName("itemPlateEnrichedSoularium").setCreativeTab(AddToCreativeTab.tabMisc).setTextureName(CORE.MODID + ":itemPlateSoularium");
			//Registry
			GameRegistry.registerItem(itemPlateEnrichedSoularium, "itemPlateEnrichedSoularium");
		}
		else {
			Utils.LOG_WARNING("SimplyJetpacks not Found - Skipping Resources.");
		}
		//rfTools
		if (LoadedMods.RFTools|| LOAD_ALL_CONTENT){
			Utils.LOG_INFO("rfTools Found - Loading Resources.");
			//Item Init
			itemPlateDimensionShard = new Item().setUnlocalizedName("itemPlateDimensionShard").setCreativeTab(AddToCreativeTab.tabMisc).setTextureName(CORE.MODID + ":itemPlateDimensionShard");
			//Registry
			GameRegistry.registerItem(itemPlateDimensionShard, "itemPlateDimensionShard");
		}
		else {
			Utils.LOG_WARNING("rfTools not Found - Skipping Resources.");
		}
		//IC2 Exp
		if (LoadedMods.IndustrialCraft2|| LOAD_ALL_CONTENT){
			Utils.LOG_INFO("IndustrialCraft2 Found - Loading Resources.");
			//Item Init
			FuelRod_Empty = new FuelRod_Base("itemFuelRod_Empty", "Empty", 0, 1000);
			FuelRod_Thorium = new FuelRod_Base("itemFuelRod_Thorium", "Thorium", 1000, 1000);
			FuelRod_Uranium = new FuelRod_Base("itemFuelRod_Uranium", "Uranium", 2500, 2500);
			FuelRod_Plutonium = new FuelRod_Base("itemFuelRod_Plutonium", "Plutonium", 5000, 5000);
			RfEuBattery = new RF2EU_Battery();
			itemPersonalCloakingDevice = new ItemCloakingDevice(0);
			//itemPersonalCloakingDeviceCharged = new ItemCloakingDevice(0).set;
			itemPersonalHealingDevice = new ItemHealingDevice();
			//Registry
			//GameRegistry.registerItem(FuelRod_Empty, "itemFuelRod_Empty");
			//GameRegistry.registerItem(FuelRod_Thorium, "itemFuelRod_Thorium");
			//GameRegistry.registerItem(FuelRod_Uranium, "itemFuelRod_Uranium");
			//GameRegistry.registerItem(FuelRod_Plutonium, "itemFuelRod_Plutonium");
		}
		else {
			Utils.LOG_WARNING("IndustrialCraft2 not Found - Skipping Resources.");
		}


		//Special Item Handling Case
		if (configSwitches.enableAlternativeBatteryAlloy) {
			ModItems.itemIngotBatteryAlloy = new BaseItemIngot("itemIngotBatteryAlloy", "Battery Alloy", Utils.rgbtoHexValue(35, 228, 141), 0);
			ModItems.itemPlateBatteryAlloy = new BaseItemPlate("itemPlateBatteryAlloy", "Battery Alloy", Utils.rgbtoHexValue(35, 228, 141), 2, 0);
		}


		//UtilsItems.generateSpawnEgg("ic2", "boatcarbon", Utils.generateSingularRandomHexValue(), Utils.generateSingularRandomHexValue());



		/*
		 * Misc Items
		 */

		//Staballoy Equipment
		itemStaballoyPickaxe = new StaballoyPickaxe("itemStaballoyPickaxe", STABALLOY).setCreativeTab(AddToCreativeTab.tabTools);
		GameRegistry.registerItem(itemStaballoyPickaxe, itemStaballoyPickaxe.getUnlocalizedName());
		itemStaballoyAxe = new StaballoyAxe("itemStaballoyAxe", STABALLOY).setCreativeTab(AddToCreativeTab.tabTools);
		GameRegistry.registerItem(itemStaballoyAxe, itemStaballoyAxe.getUnlocalizedName());

		//Sandstone Hammer
		itemSandstoneHammer = new SandstoneHammer("itemSandstoneHammer").setCreativeTab(AddToCreativeTab.tabTools);
		GameRegistry.registerItem(itemSandstoneHammer, itemSandstoneHammer.getUnlocalizedName());

		//Buffer Cores!
		Item itemBufferCore;
		for(int i=1; i<=10; i++){
			//Utils.LOG_INFO(""+i);
			itemBufferCore = new BufferCore("itemBufferCore", i).setCreativeTab(AddToCreativeTab.tabMachines);
			GameRegistry.registerItem(itemBufferCore, itemBufferCore.getUnlocalizedName()+i);
			//System.out.println("Buffer Core registration count is: "+i);
		}

		itemStickyRubber = new Item().setUnlocalizedName("itemStickyRubber").setCreativeTab(tabMachines).setTextureName(CORE.MODID + ":itemStickyRubber");
		GameRegistry.registerItem(itemStickyRubber, "itemStickyRubber");
		GT_OreDictUnificator.registerOre("ingotRubber", UtilsItems.getItemStack(CORE.MODID+":itemStickyRubber", 1));

		itemHeliumBlob = new CoreItem("itemHeliumBlob", tabMisc).setTextureName(CORE.MODID + ":itemHeliumBlob");
		//GameRegistry.registerItem(itemHeliumBlob, "itemHeliumBlob");

		itemPLACEHOLDER_Circuit = new Item().setUnlocalizedName("itemPLACEHOLDER_Circuit").setTextureName(CORE.MODID + ":itemPLACEHOLDER_Circuit");
		GameRegistry.registerItem(itemPLACEHOLDER_Circuit, "itemPLACEHOLDER_Circuit");

		//ItemBlockGtFrameBox = new ItemBlockGtFrameBox(ModBlocks.blockGtFrameSet1);
		//GameRegistry.registerItem(ItemBlockGtFrameBox, "itemGtFrameBoxSet1");		
	}
}