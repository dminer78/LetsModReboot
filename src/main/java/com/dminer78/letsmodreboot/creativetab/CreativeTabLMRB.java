package com.dminer78.letsmodreboot.creativetab;

import com.dminer78.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabLMRB
{
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem()
        {
            return Items.diamond_pickaxe;
        }
    };
}
