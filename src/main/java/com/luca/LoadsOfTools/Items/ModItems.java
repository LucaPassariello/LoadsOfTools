package com.luca.LoadsOfTools.Items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{
    public static Item woodChunk;

    public static void createItems()
    {
        GameRegistry.registerItem(woodChunk = new BasicItem("Wood_Chunk"), "tutorial_item");
    }
}
