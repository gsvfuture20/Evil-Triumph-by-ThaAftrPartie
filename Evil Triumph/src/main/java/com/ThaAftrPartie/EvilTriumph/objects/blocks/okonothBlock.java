package com.ThaAftrPartie.EvilTriumph.objects.blocks;

import com.ThaAftrPartie.EvilTriumph.init.ModBlocks;
import com.ThaAftrPartie.EvilTriumph.init.ModItems;
import com.ThaAftrPartie.EvilTriumph.tabs.EvilTriumphTab;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class OkonothBlock extends Block {

		
	
		public OkonothBlock(String name, Material material) 
		{
			super(material);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(EvilTriumphTab.EVILTRIUMPHTAB);
			setHardness(5.0f);
			setResistance(45.0f);
			setLightLevel(25.0f);
			setLightOpacity(7);
			setDefaultSlipperiness(6.0f);
			setHarvestLevel("pickaxe", 3);
			setSoundType(SoundType.METAL);
			//setBlockUnbreakable();
			
			ModBlocks.BLOCKS.add(this);
			ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		}
}
	

