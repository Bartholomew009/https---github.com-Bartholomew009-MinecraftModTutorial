package net.bartholome009.tutorial;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Tutorial.MOD_ID, name = Tutorial.MOD_TITLE, version = Tutorial.VERSION, dependencies = Tutorial.DEPENDENCIES)
public class Tutorial {
	public static final String MOD_ID = "tutorial";
	public static final String MOD_TITLE = "Silent Tutorial Mod";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after:forge@[13.20.0.2226,)";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";
	
	
	public static Random random = new Random();
	
	
	@Instance(MOD_ID)
	public static Tutorial instance;
	
	@SidedProxy(clientSide = "net.bartholome009.tutorial.ClientProxy", serverSide = "net.bartholome009.tutorial.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.Init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
