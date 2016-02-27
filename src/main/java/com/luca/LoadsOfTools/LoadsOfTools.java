package com.luca.LoadsOfTools;

import com.luca.LoadsOfTools.Items.ModItems;
import com.luca.LoadsOfTools.Proxy.IProxy;
import com.luca.LoadsOfTools.Reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class LoadsOfTools
{
    @SidedProxy(clientSide = "com.luca.LoadsOFTools.Proxy.ClientProxy", serverSide = "com.luca.LoadsOfTools.Proxy.ServerProxy", modId = Reference.MOD_ID)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModItems.createItems();
    }

    @Mod.EventHandler
    public void init(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }



}
