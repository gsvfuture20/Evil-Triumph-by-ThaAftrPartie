package com.ThaAftrPartie.EvilTriumph.util.handlers;

import java.io.File;

import com.ThaAftrPartie.EvilTriumph.tabs.evilTriumph;
import com.ThaAftrPartie.EvilTriumph.util.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler 
{
	public static Configuration config;
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		evilTriumph.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
		evilTriumph.config.mkdirs();
		init(new File(evilTriumph.config.getPath(), Reference.MOD_ID + ".cfg"));
	}

	private static void init(File file) {
		// TODO Auto-generated method stub
		
	}
}
