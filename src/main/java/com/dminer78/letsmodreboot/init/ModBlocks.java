package com.dminer78.letsmodreboot.init;

import com.dminer78.letsmodreboot.block.*;
import com.dminer78.letsmodreboot.reference.Names;
import com.dminer78.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockLMRB flintBlock = new BlockFlint();
    public static final BlockLMRB fleshBlock = new BlockFlesh();
    public static final BlockLMRB enderBlock = new BlockEnder();
    public static final BlockLMRB boneBlock = new BlockBone();
    public static final BlockLMRB spiderBlock = new BlockSpider();
    public static final BlockLMRB tearBlock = new BlockTear();
    public static final BlockLMRB blazerodBlock = new BlockBlazeRod();

    public static void init() {
        GameRegistry.registerBlock(flintBlock, Names.Blocks.FLINT_BLOCK);
        GameRegistry.registerBlock(fleshBlock, Names.Blocks.FLESH_BLOCK);
        GameRegistry.registerBlock(enderBlock, Names.Blocks.ENDER_BLOCK);
        GameRegistry.registerBlock(boneBlock, Names.Blocks.BONE_BLOCK);
        GameRegistry.registerBlock(spiderBlock, Names.Blocks.SPIDER_BLOCK);
        GameRegistry.registerBlock(tearBlock, Names.Blocks.TEAR_BLOCK);
        GameRegistry.registerBlock(blazerodBlock, Names.Blocks.BLAZEROD_BLOCK);
    }
}
