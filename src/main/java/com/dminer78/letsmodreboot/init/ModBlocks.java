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
    public static final BlockLMRB magmacreamBlock = new BlockMagmaCream();
    public static final BlockLMRB leatherBlock = new BlockLeather();
    public static final BlockLMRB netherstarBlock = new BlockNetherStar();
    public static final BlockLMRB porkchopBlock = new BlockRawPork();
    public static final BlockLMRB cooked_porkchopBlock = new BlockCookedPork();
    public static final BlockLMRB beefBlock = new BlockRawBeef();
    public static final BlockLMRB cooked_beefBlock = new BlockCookedBeef();
    public static final BlockLMRB chickenBlock = new BlockRawChicken();
    public static final BlockLMRB cooked_chickenBlock = new BlockCookedChicken();
    public static final BlockLMRB potatoBlock = new BlockRawPotato();
    public static final BlockLMRB poison_potatoBlock = new BlockPoisonPotato();
    public static final BlockLMRB cooked_potatoBlock = new BlockCookedPotato();
    public static final BlockLMRB inkBlock = new BlockInk();

    public static void init() {
        GameRegistry.registerBlock(flintBlock, Names.Blocks.FLINT_BLOCK);
        GameRegistry.registerBlock(fleshBlock, Names.Blocks.FLESH_BLOCK);
        GameRegistry.registerBlock(enderBlock, Names.Blocks.ENDER_BLOCK);
        GameRegistry.registerBlock(boneBlock, Names.Blocks.BONE_BLOCK);
        GameRegistry.registerBlock(spiderBlock, Names.Blocks.SPIDER_BLOCK);
        GameRegistry.registerBlock(tearBlock, Names.Blocks.TEAR_BLOCK);
        GameRegistry.registerBlock(blazerodBlock, Names.Blocks.BLAZEROD_BLOCK);
        GameRegistry.registerBlock(magmacreamBlock, Names.Blocks.MAGMACREAM_BLOCK);
        GameRegistry.registerBlock(leatherBlock, Names.Blocks.LEATHER_BLOCK);
        GameRegistry.registerBlock(netherstarBlock, Names.Blocks.NETHERSTAR_BLOCK);
        GameRegistry.registerBlock(porkchopBlock, Names.Blocks.PORKCHOP_BLOCK);
        GameRegistry.registerBlock(cooked_porkchopBlock, Names.Blocks.COOKED_PORKCHOP_BLOCK);
        GameRegistry.registerBlock(beefBlock, Names.Blocks.BEEF_BLOCK);
        GameRegistry.registerBlock(cooked_beefBlock, Names.Blocks.COOKED_BEEF_BLOCK);
        GameRegistry.registerBlock(chickenBlock, Names.Blocks.CHICKEN_BLOCK);
        GameRegistry.registerBlock(cooked_chickenBlock, Names.Blocks.COOKED_CHICKEN_BLOCK);
        GameRegistry.registerBlock(potatoBlock, Names.Blocks.POTATO_BLOCK);
        GameRegistry.registerBlock(poison_potatoBlock, Names.Blocks.POISON_POTATO_BLOCK);
        GameRegistry.registerBlock(cooked_potatoBlock, Names.Blocks.COOKED_POTATO_BLOCK);
        GameRegistry.registerBlock(inkBlock, Names.Blocks.INK_BLOCK);
    }
}
