package com.ThaAftrPartie.EvilTriumph.util.handlers;

import com.ThaAftrPartie.EvilTriumph.Main;
import com.ThaAftrPartie.EvilTriumph.init.ModBlocks;
import com.ThaAftrPartie.EvilTriumph.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
@EventBusSubscriber

public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	
		@SubscribeEvent
		public static void onModelRegister(ModelRegistryEvent event)
		{
			
			
			for(Item item : ModItems.ITEMS)
	        {
	            Main.proxy.registerItemRednerer(item, 0, "inventory");
	        }
	        
	        for(Block block : ModBlocks.BLOCKS)
	        {
	            Main.proxy.registerItemRednerer(Item.getItemFromBlock(block), 0, "inventory");
	        }
			
	
}
}
