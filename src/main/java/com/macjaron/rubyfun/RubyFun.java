package com.macjaron.rubyfun;

import com.macjaron.rubyfun.init.ModItems;
import com.macjaron.rubyfun.init.ModRecipes;
import com.macjaron.rubyfun.proxy.CommonProxy;
import com.macjaron.rubyfun.util.Reference;
import com.macjaron.rubyfun.world.ModWorldGen;
import com.macjaron.rubyfun.util.handlers.RFEventHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class RubyFun {
     @Instance(Reference.MOD_ID)
     public static RubyFun instance;
     public static RFEventHandler eventHandler = new RFEventHandler(); 

     @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
     public static CommonProxy proxy;

     @EventHandler
     public static void PreInit(FMLPreInitializationEvent event)
     {
          GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
     }

     @EventHandler
     public static void init(FMLInitializationEvent event)
     {
          ModRecipes.init();
          ModItems.init();
     }

     @EventHandler
     public static void Postinit(FMLPostInitializationEvent event)
     {
          MinecraftForge.EVENT_BUS.register(RubyFun.eventHandler);
     }
}