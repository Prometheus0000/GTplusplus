package gtPlusPlus.core.material;

import gregtech.api.enums.Materials;
import gregtech.api.enums.TextureSet;
import gtPlusPlus.api.objects.Logger;
import gtPlusPlus.core.client.CustomTextureSet.TextureSets;
import gtPlusPlus.core.lib.CORE;
import gtPlusPlus.core.material.state.MaterialState;
import gtPlusPlus.core.util.data.StringUtils;
import gtPlusPlus.core.util.minecraft.MaterialUtils;

public final class ELEMENT {

	public static final String[] NAMES = new String[]{"Hydrogen", "Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen", "Oxygen", "Fluorine", "Neon", "Sodium", "Magnesium", "Aluminium", "Silicon", "Phosphorus", "Sulfur", "Chlorine", "Argon", "Potassium", "Calcium", "Scandium", "Titanium", "Vanadium", "Chromium", "Manganese", "Iron", "Cobalt", "Nickel", "Copper", "Zinc", "Gallium", "Germanium", "Arsenic", "Selenium", "Bromine", "Krypton", "Rubidium", "Strontium", "Yttrium", "Zirconium", "Niobium", "Molybdenum", "Technetium", "Ruthenium", "Rhodium", "Palladium", "Silver", "Cadmium", "Indium", "Tin", "Antimony", "Tellurium", "Iodine", "Xenon", "Caesium", "Barium", "Lanthanum", "Cerium", "Praseodymium", "Neodymium", "Promethium", "Samarium", "Europium", "Gadolinium", "Terbium", "Dysprosium", "Holmium", "Erbium", "Thulium", "Ytterbium", "Lutetium", "Hafnium", "Tantalum", "Tungsten", "Rhenium", "Osmium", "Iridium", "Platinum", "Gold", "Mercury", "Thallium", "Lead", "Bismuth", "Polonium", "Astatine", "Radon", "Francium", "Radium", "Actinium", "Thorium", "Protactinium", "Uranium", "Neptunium", "Plutonium", "Americium", "Curium", "Berkelium", "Californium", "Einsteinium", "Fermium", "Mendelevium", "Nobelium", "Lawrencium", "Rutherfordium", "Dubnium", "Seaborgium", "Bohrium", "Hassium", "Meitnerium", "Darmstadtium", "Roentgenium", "Copernicium", "Nihonium", "Flerovium", "Moscovium", "Livermorium", "Tennessine", "Oganesson"};	
	
	//First 50 Elements
	public final Material HYDROGEN = MaterialUtils.generateMaterialFromGtENUM(Materials.Hydrogen);
	public final Material HELIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Helium);
	public final Material LITHIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Lithium);
	public final Material BERYLLIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Beryllium);
	public final Material BORON = MaterialUtils.generateMaterialFromGtENUM(Materials.Boron);
	public final Material CARBON = MaterialUtils.generateMaterialFromGtENUM(Materials.Carbon);
	public final Material NITROGEN = MaterialUtils.generateMaterialFromGtENUM(Materials.Nitrogen);
	public final Material OXYGEN = MaterialUtils.generateMaterialFromGtENUM(Materials.Oxygen);
	public final Material FLUORINE = MaterialUtils.generateMaterialFromGtENUM(Materials.Fluorine);
	public final Material NEON = new Material("Neon", MaterialState.GAS, new short[]{255, 255, 255}, -248, -246, 10, 10, false, "Ne", 0);//Not a GT Inherited Material
	public final Material SODIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Sodium);
	public final Material MAGNESIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Magnesium);
	public final Material ALUMINIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Aluminiumoxide);
	public final Material SILICON = MaterialUtils.generateMaterialFromGtENUM(Materials.SiliconDioxide);
	public final Material PHOSPHORUS = MaterialUtils.generateMaterialFromGtENUM(Materials.Phosphor);
	public final Material SULFUR = MaterialUtils.generateMaterialFromGtENUM(Materials.Sulfur);
	public final Material CHLORINE = MaterialUtils.generateMaterialFromGtENUM(Materials.Chlorine);
	public final Material ARGON = MaterialUtils.generateMaterialFromGtENUM(Materials.Argon);
	public final Material POTASSIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Potassium);
	public final Material CALCIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Calcium);
	public final Material SCANDIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Scandium);
	public final Material TITANIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Titanium);
	public final Material VANADIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Vanadium);
	public final Material CHROMIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Chrome);
	public final Material MANGANESE = MaterialUtils.generateMaterialFromGtENUM(Materials.Manganese);
	public final Material IRON = MaterialUtils.generateMaterialFromGtENUM(Materials.Iron);
	public final Material COBALT = MaterialUtils.generateMaterialFromGtENUM(Materials.Cobalt);
	public final Material NICKEL = MaterialUtils.generateMaterialFromGtENUM(Materials.Nickel);
	public final Material COPPER = MaterialUtils.generateMaterialFromGtENUM(Materials.Copper);
	public final Material ZINC = MaterialUtils.generateMaterialFromGtENUM(Materials.Zinc);
	public final Material GALLIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Gallium);
	public final Material GERMANIUM = new Material("Germanium", MaterialState.SOLID, new short[]{200, 200, 200}, 937, 2830, 32, 41, false, "Ge", 0);//Not a GT Inherited Material
	public final Material ARSENIC = MaterialUtils.generateMaterialFromGtENUM(Materials.Arsenic);
	public final Material SELENIUM = new Material("Selenium", MaterialState.SOLID, new short[]{190, 190, 190}, 217, 685, 34, 45, false, "Se", 0);//Not a GT Inherited Material
	public final Material BROMINE = new Material("Bromine", MaterialState.PURE_LIQUID, new short[]{200, 25, 25}, -7, 58, 35, 45, false, "Br", 0);//Not a GT Inherited Material
	public final Material KRYPTON = new Material("Krypton", MaterialState.PURE_LIQUID, new short[]{255, 255, 255}, -157, -153, 36, 48, false, "Kr", 0);//Not a GT Inherited Material
	public final Material RUBIDIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Rubidium);
	public final Material STRONTIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Strontium, new short[] {230, 210, 110}, TextureSet.SET_FLINT);
	public final Material YTTRIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Yttrium);
	public final Material ZIRCONIUM = new Material("Zirconium", MaterialState.SOLID, new short[]{255, 250, 205}, 1855, 4377, 40, 51, false, "Zr", 0);//Not a GT Inherited Material
	public final Material NIOBIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Niobium);
	public final Material MOLYBDENUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Molybdenum);
	public final Material TECHNETIUM = new Material("Technetium", MaterialState.SOLID, TextureSets.NUCLEAR.get(), new short[]{220, 220, 220}, 2200, 4877, 43, 55, false, "Tc", 2);//Not a GT Inherited Material
	public final Material RUTHENIUM  = new Material("Ruthenium", MaterialState.SOLID, new short[]{220, 220, 220}, 2250, 3900, 44, 57, false, "Ru", 0);//Not a GT Inherited Material
	public final Material RHODIUM = new Material("Rhodium", MaterialState.SOLID, new short[]{220, 220, 220}, 1966, 3727, 45, 58, false, "Rh", 0);//Not a GT Inherited Material
	public final Material PALLADIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Palladium);
	public final Material SILVER = MaterialUtils.generateMaterialFromGtENUM(Materials.Silver);
	public final Material CADMIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Cadmium);
	public final Material INDIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Indium);
	public final Material TIN = MaterialUtils.generateMaterialFromGtENUM(Materials.Tin);
	public final Material ANTIMONY = MaterialUtils.generateMaterialFromGtENUM(Materials.Antimony);
	public final Material TELLURIUM = new Material("Tellurium", MaterialState.SOLID, new short[]{210, 210, 210}, 449, 989, 52, 76, false, "Te", 0);//Not a GT Inherited Material
	public final Material IODINE = new Material("Iodine", MaterialState.SOLID, TextureSet.SET_SHINY, new short[]{96, 96, 96}, 114, 184, 53, 74, false, "I", 0);//Not a GT Inherited Material
	public final Material XENON = new Material("Xenon", MaterialState.GAS, new short[]{255, 255, 255}, -111, -108, 54, 77, false, "Xe", 0);//Not a GT Inherited Material
	public final Material CAESIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Caesium);
	public final Material BARIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Barium);
	public final Material LANTHANUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Lanthanum);
	public final Material CERIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Cerium);
	public final Material PRASEODYMIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Praseodymium);
	public final Material NEODYMIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Neodymium);
	public final Material PROMETHIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Promethium);
	public final Material SAMARIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Samarium);
	public final Material EUROPIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Europium);
	public final Material GADOLINIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Gadolinium);
	public final Material TERBIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Terbium);
	public final Material DYSPROSIUM = new Material("Dysprosium", MaterialState.SOLID, new short[]{180, 180, 180}, 1412, 2562, 66, 97, false, "Dy", 0);//Not a GT Inherited Material
	public final Material HOLMIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Holmium);
	public final Material ERBIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Erbium);
	public final Material THULIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Thulium);
	public final Material YTTERBIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Ytterbium);
	public final Material LUTETIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Lutetium);
	public final Material HAFNIUM = new Material("Hafnium", MaterialState.SOLID, new short[]{128, 128, 128}, 2150, 5400, 72, 106, false, "Hf", 0);//Not a GT Inherited Material

	//Second 50 elements
	public final Material TANTALUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Tantalum);
	public final Material TUNGSTEN = MaterialUtils.generateMaterialFromGtENUM(Materials.Tungsten);
	public final Material RHENIUM = new Material("Rhenium", MaterialState.SOLID, new short[]{150, 150, 150}, 3180, 3627, 75, 111, false, "Re", 0);//Not a GT Inherited Material
	public final Material OSMIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Osmium);
	public final Material IRIDIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Iridium);
	public final Material PLATINUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Platinum);
	public final Material GOLD = MaterialUtils.generateMaterialFromGtENUM(Materials.Gold);
	public final Material MERCURY = MaterialUtils.generateMaterialFromGtENUM(Materials.Mercury); //Mercury
	public final Material THALLIUM = new Material("Thallium", MaterialState.SOLID, new short[]{175, 175, 175}, 304, 1457, 81, 123, false, "Tl", 0);//Not a GT Inherited Material
	public final Material LEAD = MaterialUtils.generateMaterialFromGtENUM(Materials.Lead);
	public final Material BISMUTH = MaterialUtils.generateMaterialFromGtENUM(Materials.Bismuth);
	public final Material POLONIUM = new Material("Polonium", MaterialState.SOLID, TextureSets.NUCLEAR.get(), new short[]{180, 170, 180}, 254, 962, 84, 125, false, "Po", 1);//Not a GT Inherited Material
	public final Material ASTATINE = new Material("Astatine", MaterialState.SOLID, TextureSets.NUCLEAR.get(), new short[]{170, 180, 170}, 302, 337, 85, 125, false, "At", 1);//Not a GT Inherited Material
	public final Material RADON = MaterialUtils.generateMaterialFromGtENUM(Materials.Radon);
	public final Material FRANCIUM = new Material("Francium", MaterialState.SOLID,  TextureSets.NUCLEAR.get(), new short[]{170, 160, 170}, 27, 677, 87, 136, false, "Fr", 1);//Not a GT Inherited Material
	public final Material RADIUM = new Material("Radium", MaterialState.SOLID, TextureSets.NUCLEAR.get(), new short[]{165, 165, 165}, 700, 1737, 88, 138, false, "Ra", 1);//Not a GT Inherited Material
	public final Material ACTINIUM = new Material("Actinium", MaterialState.SOLID, TextureSets.NUCLEAR.get(), new short[]{150, 165, 165}, 1050, 3200, 89, 138, false, "Ac", 1);//Not a GT Inherited Material
	public final Material THORIUM = new Material("Thorium", MaterialState.SOLID, Materials.Thorium.mRGBa, Materials.Thorium.mMeltingPoint, Materials.Thorium.mBlastFurnaceTemp, 90, 142, false, StringUtils.superscript("Th"), 1);
	public final Material PROTACTINIUM = new Material("Protactinium", MaterialState.SOLID,  TextureSets.NUCLEAR.get(), new short[]{190, 150, 170}, 1568, 4027, 91, 140, false, "Pa", 1);//Not a GT Inherited Material
	public final Material URANIUM238 = MaterialUtils.generateMaterialFromGtENUM(Materials.Uranium);
	public final Material URANIUM235 = MaterialUtils.generateMaterialFromGtENUM(Materials.Uranium235);
	public final Material NEPTUNIUM = new Material("Neptunium", MaterialState.SOLID, TextureSets.NUCLEAR.get(), new short[]{200, 220, 205}, 640, 3902, 93, 144, false, "Np", 2);//Not a GT Inherited Material
	public final Material PLUTONIUM244 = MaterialUtils.generateMaterialFromGtENUM(Materials.Plutonium);
	public final Material PLUTONIUM241 = MaterialUtils.generateMaterialFromGtENUM(Materials.Plutonium241);
	public final Material AMERICIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Americium); //Americium
	public final Material CURIUM = new Material("Curium", MaterialState.SOLID,  TextureSets.NUCLEAR.get(), new short[]{175, 85, 110}, 1340, 3110, 96, 151, false, "Cm", 3);//Not a GT Inherited Material
	public final Material BERKELIUM = new Material("Berkelium", MaterialState.SOLID, TextureSets.NUCLEAR.get(), new short[]{110, 250, 85}, 985, 710, 97, 150, false, "Bk", 4);//Not a GT Inherited Material
	public final Material CALIFORNIUM = new Material("Californium", MaterialState.SOLID, TextureSets.NUCLEAR.get(), new short[]{85, 110, 205}, 899, 1472, 98, 153, false, "Cf", 4);//Not a GT Inherited Material
	public final Material EINSTEINIUM = new Material("Einsteinium", MaterialState.SOLID, TextureSets.NUCLEAR.get(), new short[]{255, 85, 110}, 860, 3500, 99, 153, false, "Es", 5);//Not a GT Inherited Material //Boiling Point is made up
	public final Material FERMIUM = new Material("Fermium", MaterialState.LIQUID, TextureSets.NUCLEAR.get(), new short[]{75, 90, 25}, 1527, 3850, 100, 157, false, "Fm", 5);//Not a GT Inherited Material //Boiling Point is made up

	//Misc
	public final Material AER = MaterialUtils.generateMaterialFromGtENUM(Materials.InfusedAir, TextureSets.GEM_A.get());
	public final Material IGNIS = MaterialUtils.generateMaterialFromGtENUM(Materials.InfusedFire, TextureSets.GEM_A.get());
	public final Material TERRA = MaterialUtils.generateMaterialFromGtENUM(Materials.InfusedEarth, TextureSets.GEM_A.get());
	public final Material AQUA = MaterialUtils.generateMaterialFromGtENUM(Materials.InfusedWater, TextureSets.GEM_A.get());
	public final Material PERDITIO = MaterialUtils.generateMaterialFromGtENUM(Materials.InfusedEntropy, TextureSets.GEM_A.get());
	public final Material ORDO = MaterialUtils.generateMaterialFromGtENUM(Materials.InfusedOrder, TextureSets.GEM_A.get());
	
	//Fictional	
	public final Material YELLORIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Yellorium, new short[] {255, 242, 10}, TextureSets.NUCLEAR.get());
	public final Material NAQUADAH = MaterialUtils.generateMaterialFromGtENUM(Materials.Naquadah);
	public final Material NAQUADAH_ENRICHED = MaterialUtils.generateMaterialFromGtENUM(Materials.NaquadahEnriched);
	public final Material NAQUADRIA = MaterialUtils.generateMaterialFromGtENUM(Materials.Naquadria);
	public final Material TRINIUM;
	public final Material TRINIUM_REFINED;
	//https://github.com/Blood-Asp/GT5-Unofficial/issues/609
	
	
	//Custom Isotopes
	public final Material LITHIUM7 = new Material("Lithium 7", MaterialState.SOLID, TextureSet.SET_SHINY, Materials.Lithium.mRGBa, Materials.Lithium.mMeltingPoint, Materials.Lithium.mBlastFurnaceTemp, Materials.Lithium.getProtons(), Materials.Lithium.getNeutrons(), Materials.Lithium.mBlastFurnaceRequired, StringUtils.superscript("7Li"), 0, false);//Not a GT Inherited Material
	public final Material URANIUM232 = new Material("Uranium 232", MaterialState.SOLID, TextureSets.NUCLEAR.get(), new short[]{88, 220, 103, 0}, 1132, 4131, 92, 140, false, StringUtils.superscript("232U"), 4);//Not a GT Inherited Material
	public final Material URANIUM233 = new Material("Uranium 233", MaterialState.SOLID, TextureSets.NUCLEAR.get(), new short[]{73, 220, 83, 0}, 1132, 4131, 92, 141, false, StringUtils.superscript("233U"), 2);//Not a GT Inherited Material
	public final Material THORIUM232 = new Material("Thorium 232", MaterialState.SOLID, TextureSets.NUCLEAR.get(), new short[]{15, 60, 15, 0}, Materials.Thorium.mMeltingPoint, Materials.Thorium.mBlastFurnaceTemp, 90, 142, false, StringUtils.superscript("232Th"), 1, false);//Not a GT Inherited Material
	public final Material PLUTONIUM239 = new Material("Plutonium-239", MaterialState.SOLID, TextureSets.NUCLEAR.get(), Materials.Plutonium.mDurability, Materials.Plutonium.mRGBa, Materials.Plutonium.mMeltingPoint, Materials.Plutonium.mBlastFurnaceTemp, 94, 145, false, StringUtils.superscript("239Pu"), 4, true);//Not a GT Inherited Material
	//RTG Fuels
	public final Material PLUTONIUM238 = new Material("Plutonium-238", MaterialState.SOLID, TextureSets.NUCLEAR.get(), Materials.Plutonium241.mDurability, Materials.Plutonium241.mRGBa, Materials.Plutonium241.mMeltingPoint, Materials.Plutonium241.mBlastFurnaceTemp, 94, 144, false, StringUtils.superscript("238Pu"), 2, false);//Not a GT Inherited Material
	public final Material STRONTIUM90 = new Material("Strontium-90", MaterialState.SOLID, TextureSets.NUCLEAR.get(), Materials.Strontium.mDurability, Materials.Strontium.mRGBa, Materials.Strontium.mMeltingPoint, Materials.Strontium.mBlastFurnaceTemp, 38, 52, false, StringUtils.superscript("90Sr"), 2, false);//Not a GT Inherited Material
	public final Material POLONIUM210 = new Material("Polonium-210", MaterialState.SOLID, TextureSets.NUCLEAR.get(), POLONIUM.vDurability, POLONIUM.getRGBA(), POLONIUM.getMeltingPointK(), POLONIUM.getBoilingPointK(), 84, 126, false, StringUtils.superscript("210Po"), 2, false);//Not a GT Inherited Material
	public final Material AMERICIUM241 = new Material("Americium-241", MaterialState.SOLID, TextureSets.NUCLEAR.get(), Materials.Americium.mDurability, Materials.Americium.mRGBa, Materials.Americium.mMeltingPoint, Materials.Americium.mBlastFurnaceTemp, 95, 146, false, StringUtils.superscript("241Am"), 2, false);//Not a GT Inherited Material

	public final Material MAGIC = MaterialUtils.generateMaterialFromGtENUM(Materials.Magic, new short[] {10, 185, 140});
	public final Material THAUMIUM = MaterialUtils.generateMaterialFromGtENUM(Materials.Thaumium);
	
	static {
		Logger.MATERIALS("Initialising Base Elements.");
	}
	
	private static final ELEMENT INSTANCE = new ELEMENT();

	public ELEMENT(){		
		//GTNH Trinium Handling		
		if (CORE.GTNH){			
			//yay
			Materials a1 = MaterialUtils.getMaterial("Trinium");
			Materials a2 = Materials.valueOf("Trinium");
			Materials a3 = Materials.get("Trinium");
			Materials a4;
			if (a1 == null) {
				Logger.INFO("[Material] First attempt to find Trinium failed, using backup method.");
				if (a2 == null) {
					Logger.INFO("[Material] Fallback attempt to find Trinium failed, using second fallback.");
					if (a3 == null) {
						Logger.INFO("[Material] Fallback attempt to find Trinium failed, dumping materials.");
						for (Materials m : Materials.values()) {
							Logger.INFO("[Material] Found "+MaterialUtils.getMaterialName(m));
						}
						a4 = null;
					}
					else {
						Logger.INFO("[Material] a3 Found "+MaterialUtils.getMaterialName(a3));
						a4 = a3;						
					}
				}
				else {
					Logger.INFO("[Material] a2 Found "+MaterialUtils.getMaterialName(a2));
					a4 = a2;
				}
				TRINIUM  = MaterialUtils.generateMaterialFromGtENUM(a4);
			}
			else {
				Logger.INFO("[Material] a1 Found "+MaterialUtils.getMaterialName(a1));
				TRINIUM  = MaterialUtils.generateMaterialFromGtENUM(a1);				
			}		
			
			TRINIUM_REFINED = TRINIUM;
					
		}
		else {			
			TRINIUM = new Material("Trinium", MaterialState.SOLID, TextureSet.SET_FINE, new short[]{70, 110, 30}, 604, 4057, 181, 133, false, "Ke", 0, false);//Not a GT Inherited Material	
			TRINIUM_REFINED = new Material("Refined Trinium", MaterialState.SOLID, TextureSets.REFINED.get(), new short[]{210, 255, 170}, 4304, 14057, 181, 133, false, "Ke", 0, new MaterialStack[]{new MaterialStack(TRINIUM, 1)});//Not a GT Inherited Material	
			}	
	}

	public static ELEMENT getInstance(){
		return INSTANCE;
	}
	
	public static class STANDALONE {
		
		public static final Material CELESTIAL_TUNGSTEN = new Material("Celestial Tungsten", MaterialState.SOLID, TextureSets.REFINED.get(), new short[] {50, 50, 50, 2}, INSTANCE.TUNGSTEN.getMeltingPointC()+6500, INSTANCE.TUNGSTEN.getBoilingPointC()+7500, 160, 101, true, "✦◆✦", 0);//Not a GT Inherited Material
		public static final Material ASTRAL_TITANIUM = new Material("Astral Titanium", MaterialState.SOLID, TextureSets.REFINED.get(), new short[] {220, 160, 240, 2}, INSTANCE.TITANIUM.getMeltingPointC()+7500, INSTANCE.TITANIUM.getBoilingPointC()+7500, 145, 133, true, "✧◇✧", 0);//Not a GT Inherited Material
		public static final Material CHRONOMATIC_GLASS = new Material("Chromatic Glass", MaterialState.SOLID, new short[]{255, 255, 255, 3}, 9200, 17550, 40, 51, false, "⌘☯𓍰 𓍱 𓍲 𓍳 𓍴 𓍵 𓍶 𓍷 𓍸 ☯⌘ ", 0);//Not a GT Inherited Material
		public static final Material ADVANCED_NITINOL = new Material("Advanced Nitinol", MaterialState.SOLID, TextureSets.ENRICHED.get(), ALLOY.NITINOL_60.getRGB(), 8400, 14377, 40, 51, true, "⚷⚙⚷ Ni4Ti6", 0);//Not a GT Inherited Material
		public static final Material HYPOGEN = new Material("Hypogen", MaterialState.SOLID, TextureSets.NUCLEAR.get(), new short[]{220, 120, 75, 2}, 12255, 19377, 240, 251, true, "Hy⚶", 0);//Not a GT Inherited Material
		public static final Material RHUGNOR = new Material("Rhugnor", MaterialState.SOLID, TextureSets.ENRICHED.get(), new short[]{190, 0, 255, 0}, 8750, 14757, 184, 142, true, "Fs⚶", 0);//Not a GT Inherited Material //funeris
		
		
		//Runescape materials
		public static final Material BLACK_METAL = new Material("Black Metal", MaterialState.SOLID, TextureSet.SET_METALLIC, new short[] {5, 5, 5}, 2350, 4650, 24, 17, false, "҈", 0, new MaterialStack[]{new MaterialStack(getInstance().LEAD, 15), new MaterialStack(getInstance().MANGANESE, 25), new MaterialStack(getInstance().CARBON, 60)});//Not a GT Inherited Material
		public static final Material WHITE_METAL = new Material("White Metal", MaterialState.SOLID, TextureSet.SET_METALLIC, new short[] {255, 255, 255}, 4560, 7580, 35, 41, false, "҉", 0, new MaterialStack[]{new MaterialStack(getInstance().COPPER, 5), new MaterialStack(getInstance().ANTIMONY, 10), new MaterialStack(getInstance().PLATINUM, 10), new MaterialStack(getInstance().TIN, 75)});//Not a GT Inherited Material
		
		public static final Material GRANITE = new Material(
				"Ancient Granite", 
				MaterialState.SOLID, 
				TextureSet.SET_SAND, 
				new short[] {107, 107, 107}, 
				500, 
				2000,
				16,
				12,
				false,
				"«»",
				0,
				false,
				new MaterialStack[]{
						new MaterialStack(getInstance().OXYGEN, 30),
						new MaterialStack(getInstance().IRON, 20),
						new MaterialStack(getInstance().SILICON, 20),
						new MaterialStack(getInstance().ALUMINIUM, 10),
						new MaterialStack(getInstance().POTASSIUM, 10),
						new MaterialStack(getInstance().CALCIUM, 5),
						new MaterialStack(getInstance().SODIUM, 5)
						});//Not a GT Inherited Material
		
		public static final Material RUNITE = new Material("Runite", MaterialState.SOLID, TextureSet.SET_FINE, new short[] {60, 200, 190}, 6750, 11550, 73, 87, true, "§", 0);//Not a GT Inherited Material
		public static final Material DRAGON_METAL = new Material("Dragonblood", MaterialState.SOLID, TextureSet.SET_SHINY, new short[] {220, 40, 20, 2}, 10160, 17850, 96, 105, true, "۞", 0);//Not a GT Inherited Material
		
	}


}
