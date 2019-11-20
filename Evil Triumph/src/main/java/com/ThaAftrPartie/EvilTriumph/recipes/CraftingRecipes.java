package com.ThaAftrPartie.EvilTriumph.recipes;

import com.ThaAftrPartie.EvilTriumph.init.ModBlocks;
import com.ThaAftrPartie.EvilTriumph.init.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRecipes 
{
	public static void init()
	{
		//Okonoth Block
		ItemStack okonoth_ingot = new ItemStack(ModItems.OKONOTH_INGOT, 9);
		ItemStack okonoth_block = new ItemStack(ModBlocks.OKONOTH_BLOCK);
		GameRegistry.addShapelessRecipe(new ResourceLocation("okonoth_ingot"), null, okonoth_ingot, Ingredient.fromStacks(okonoth_block));
	}
}
