package com.ThaAftrPartie.EvilTriumph.tabs;


	import com.ThaAftrPartie.EvilTriumph.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
	import net.minecraft.item.ItemStack;

	
	public class EvilTriumphTab extends CreativeTabs
	{
		public static final CreativeTabs EVILTRIUMPHTAB = null;

		public EvilTriumphTab(String label) 
		{
			super("EvilTriumphTab");
			this.setBackgroundImageName("");
		}
		
		@Override
		public ItemStack getTabIconItem() 
		{
			return new ItemStack(ItemInit.OKONOTH_INGOT);
		}
	}



