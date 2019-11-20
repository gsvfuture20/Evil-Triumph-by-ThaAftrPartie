package com.ThaAftrPartie.EvilTriumph.objects.items;

import com.ThaAftrPartie.EvilTriumph.init.ModItems;
import com.ThaAftrPartie.EvilTriumph.tabs.evilTriumph;

import net.minecraft.item.Item;


public class ItemBase extends Item{


	

	

	public ItemBase(String name)
	{
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(evilTriumph.EvilTriumphTab);
		ModItems.ITEMS.add(this);
		
		
	}
}

