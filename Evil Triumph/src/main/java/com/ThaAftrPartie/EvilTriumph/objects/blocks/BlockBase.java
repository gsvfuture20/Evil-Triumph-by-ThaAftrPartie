package com.ThaAftrPartie.EvilTriumph.objects.blocks;

import com.ThaAftrPartie.EvilTriumph.init.ModBlocks;
import com.ThaAftrPartie.EvilTriumph.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block
{



	public BlockBase(String name, Material material)
	{

	super(material);
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	
	
	ModBlocks.BLOCKS.add(this);
	ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	
	
}
}
