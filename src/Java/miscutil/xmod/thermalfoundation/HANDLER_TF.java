package miscutil.xmod.thermalfoundation;

import miscutil.core.lib.LoadedMods;
import miscutil.xmod.thermalfoundation.block.TF_Blocks;
import miscutil.xmod.thermalfoundation.fluid.TF_Fluids;
import miscutil.xmod.thermalfoundation.item.TF_Items;
import miscutil.xmod.thermalfoundation.recipe.TF_Gregtech_Recipes;

public class HANDLER_TF{

	public static void preInit(){		
		if (LoadedMods.CoFHCore){
			TF_Fluids.preInit();
			TF_Items.preInit();
			TF_Blocks.preInit();
		}		
	}

	public static void init(){
		if (LoadedMods.CoFHCore){
			TF_Fluids.init();
			TF_Blocks.init();	
			TF_Items.init();
		}		
	}

	public static void postInit(){
		if (LoadedMods.CoFHCore){
			TF_Fluids.postInit();
			TF_Items.postInit();
			TF_Blocks.postInit();
			if(LoadedMods.Gregtech){
				TF_Gregtech_Recipes.run();
			}	
		}		
	}	
}