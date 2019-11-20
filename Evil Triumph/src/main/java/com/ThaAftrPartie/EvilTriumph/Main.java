package com.ThaAftrPartie.EvilTriumph;


import com.ThaAftrPartie.EvilTriumph.proxy.CommonProxy;
import com.ThaAftrPartie.EvilTriumph.tabs.EvilTriumphTab;
import com.ThaAftrPartie.EvilTriumph.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class Main 

{

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs EVILTRIUMPHTAB = new EvilTriumphTab("Evil_Triumph");
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
		
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		
		
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
		
		
	}

	
	@EventHandler
	public static void serverInit(FMLServerStartedEvent event)
	
	{
		
		
		
	}
	
	

}
