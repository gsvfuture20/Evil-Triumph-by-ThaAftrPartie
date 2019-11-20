package com.ThaAftrPartie.EvilTriumph.objects.items;

import com.ThaAftrPartie.EvilTriumph.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemBase extends Item{


	

	

	public ItemBase(String name)
	{
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		ModItems.ITEMS.add(this);
		
		
	}
}

