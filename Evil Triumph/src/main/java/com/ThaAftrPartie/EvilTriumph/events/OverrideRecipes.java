package com.ThaAftrPartie.EvilTriumph.events;

import com.ThaAftrPartie.EvilTriumph.recipes.TestRecipe;
import com.ThaAftrPartie.EvilTriumph.util.Reference;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;

public class OverrideRecipes
{
		private IForgeRegistryModifiable<IRecipe> modRegistry;

		@SubscribeEvent
		public  void registerRecipes(RegistryEvent.Register<IRecipe> event)
		{
			modRegistry = (IForgeRegistryModifiable<IRecipe>)event.getRegistry();
			removeRecipe(modRegistry, new ResourceLocation(""), Reference.MOD_ID);
		}
		
		public static void removeRecipe(IForgeRegistryModifiable<IRecipe> modRegistry, ResourceLocation recipe, String modID)
		{
			IRecipe p = (IRecipe)modRegistry.getValue(recipe);
			modRegistry.remove(recipe);
			
			modRegistry.register(TestRecipe.from(p));
		}
	}
	
	
	

