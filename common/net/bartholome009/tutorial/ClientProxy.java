package net.bartholome009.tutorial;

import net.bartholome009.tutorial.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}
	@Override
	public void Init(FMLInitializationEvent event) {
		super.Init(event);
		
		ModItems.InitClient(Minecraft.getMinecraft().getRenderItem().getItemModelMesher());
	}
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}
