package com.dminer78.letsmodreboot.init;

import com.dminer78.letsmodreboot.block.BlockFlag;
import com.dminer78.letsmodreboot.block.BlockLMRB;
import com.dminer78.letsmodreboot.reference.Names;
import com.dminer78.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();

    public static void init() {
        GameRegistry.registerBlock(flag, Names.Blocks.FLAG);
    }
}
