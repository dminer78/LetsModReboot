package com.dminer78.letsmodreboot.init;

import com.dminer78.letsmodreboot.item.ItemLMRB;
import com.dminer78.letsmodreboot.item.ItemMapleLeaf;
import com.dminer78.letsmodreboot.reference.Names;
import com.dminer78.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init() {
        GameRegistry.registerItem(mapleLeaf, Names.Items.MAPLE_LEAF);
    }
}
