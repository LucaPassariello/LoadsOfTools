package com.luca.LoadsOfTools.Items;


import com.luca.LoadsOfTools.Reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WoodChunk extends Item
{
    private final String name = "woodChunk";

    public WoodChunk()
    {
        GameRegistry.registerItem(this, name);
        setUnlocalizedName(Reference.MOD_ID + "_" + name);
        setCreativeTab(CreativeTabs.tabMisc);
    }

    public String getName()
    {
        return name;
    }
}
