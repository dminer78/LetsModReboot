package com.dminer78.letsmodreboot;

import com.dminer78.letsmodreboot.configuration.ConfigurationHandler;
import com.dminer78.letsmodreboot.proxy.IProxy;
import com.dminer78.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class LetsModReboot {

    @Mod.Instance(Reference.MOD_ID) //Arg is modID
    public static LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    // When x phase is started, run this code

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //Initialize Items, Blocks, and Config

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        //Register GUI, Crafting Recipes, and Tile Entities
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //Anything you want to run after other mods have loaded
    }
}
