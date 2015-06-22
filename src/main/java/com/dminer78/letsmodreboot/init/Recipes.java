package com.dminer78.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
    public static void init() { //TODO Add custom sounds to blocks
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.flintBlock), "sss", "sss", "sss", 's', Items.flint));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.fleshBlock), "sss", "sss", "sss", 's', Items.rotten_flesh));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.enderBlock), "sss", "sss", "sss", 's', Items.ender_pearl));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.boneBlock), "sss", "sss", "sss", 's', Items.bone));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.spiderBlock), "sss", "sss", "sss", 's', Items.spider_eye));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.tearBlock), "sss", "sss", "sss", 's', Items.ghast_tear));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blazerodBlock), "sss", "sss", "sss", 's', Items.blaze_rod));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.magmacreamBlock), "sss", "sss", "sss", 's', Items.magma_cream));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.leatherBlock), "sss", "sss", "sss", 's', Items.leather));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.leatherBlock), "sss", "sss", "sss", 's', Items.leather));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherstarBlock), "sss", "sss", "sss", 's', Items.nether_star));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.porkchopBlock), "sss", "sss", "sss", 's', Items.porkchop));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.cooked_porkchopBlock), "sss", "sss", "sss", 's', Items.cooked_porkchop));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.beefBlock), "sss", "sss", "sss", 's', Items.beef));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.cooked_beefBlock), "sss", "sss", "sss", 's', Items.cooked_beef));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.chickenBlock), "sss", "sss", "sss", 's', Items.chicken));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.cooked_chickenBlock), "sss", "sss", "sss", 's', Items.cooked_chicken));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.potatoBlock), "sss", "sss", "sss", 's', Items.potato));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.poison_potatoBlock), "sss", "sss", "sss", 's', Items.poisonous_potato));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.cooked_potatoBlock), "sss", "sss", "sss", 's', Items.baked_potato));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.flint, 9), ModBlocks.flintBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.rotten_flesh, 9), ModBlocks.fleshBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.ender_pearl, 9), ModBlocks.enderBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.bone, 9), ModBlocks.boneBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.spider_eye, 9), ModBlocks.spiderBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.ghast_tear, 9), ModBlocks.tearBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.blaze_rod, 9), ModBlocks.blazerodBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.magma_cream, 9), ModBlocks.magmacreamBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.leather, 9), ModBlocks.leatherBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.nether_star, 9), ModBlocks.netherstarBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.porkchop, 9), ModBlocks.porkchopBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.cooked_porkchop, 9), ModBlocks.cooked_porkchopBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.beef, 9), ModBlocks.beefBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.cooked_beef, 9), ModBlocks.cooked_beefBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.chicken, 9), ModBlocks.chickenBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.cooked_chicken, 9), ModBlocks.cooked_chickenBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.potato, 9), ModBlocks.potatoBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.poisonous_potato, 9), ModBlocks.poison_potatoBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.baked_potato, 9), ModBlocks.cooked_potatoBlock));

        //TODO Make smelting blocks take one coal each
        GameRegistry.addSmelting(ModBlocks.porkchopBlock, new ItemStack((ModBlocks.cooked_porkchopBlock), 1), 1F);
        GameRegistry.addSmelting(ModBlocks.beefBlock, new ItemStack((ModBlocks.cooked_beefBlock), 1), 1F);
        GameRegistry.addSmelting(ModBlocks.chickenBlock, new ItemStack((ModBlocks.cooked_chickenBlock), 1), 1F);
        GameRegistry.addSmelting(ModBlocks.potatoBlock, new ItemStack((ModBlocks.cooked_potatoBlock), 1), 1F);
    }
}
