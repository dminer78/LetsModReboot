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


        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.flint, 9), ModBlocks.flintBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.rotten_flesh, 9), ModBlocks.fleshBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.ender_pearl, 9), ModBlocks.enderBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.bone, 9), ModBlocks.boneBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.spider_eye, 9), ModBlocks.spiderBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.ghast_tear, 9), ModBlocks.tearBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.blaze_rod, 9), ModBlocks.blazerodBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.magma_cream, 9), ModBlocks.magmacreamBlock));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.leather, 9), ModBlocks.leatherBlock));
    }
}
