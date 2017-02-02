package net.bartholome009.tutorial;

import net.bartholome009.tutorial.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.Init();
	}
	
	public void Init(FMLInitializationEvent event) {
		ModItems.InitClient(Minecraft.getMinecraft().getRenderItem().getItemModelMesher());
	}
	public void postInit(FMLPostInitializationEvent event) {
	
	}
}
