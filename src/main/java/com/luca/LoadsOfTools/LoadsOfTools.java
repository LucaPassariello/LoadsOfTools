package com.luca.LoadsOfTools;

import com.luca.LoadsOfTools.Items.BasicItem;
import com.luca.LoadsOfTools.Items.ModItems;
import com.luca.LoadsOfTools.Items.WoodChunk;
import com.luca.LoadsOfTools.Proxy.IProxy;
import com.luca.LoadsOfTools.Reference.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class LoadsOfTools
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    public static Item WoodChunk;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Items
        WoodChunk = new BasicItem(toString());
        GameRegistry.registerItem(WoodChunk, "Wood Chunk");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }



}
