package com.ThaAftrPartie.EvilTriumph.util.handlers;

import com.ThaAftrPartie.EvilTriumph.events.EventExample;
import com.ThaAftrPartie.EvilTriumph.events.LootTableEvent;
import com.ThaAftrPartie.EvilTriumph.events.OverrideRecipes;

import net.minecraftforge.common.MinecraftForge;

public class EventHandler 
	{
		public static void registerEvents()
		{
			EventExample exampleEvent = new EventExample();
			LootTableEvent lootEvent = new LootTableEvent();
			OverrideRecipes recipeEvent = new OverrideRecipes();
			
			MinecraftForge.EVENT_BUS.register(recipeEvent);
			MinecraftForge.EVENT_BUS.register(lootEvent);
			MinecraftForge.EVENT_BUS.register(exampleEvent);
		}
	}


