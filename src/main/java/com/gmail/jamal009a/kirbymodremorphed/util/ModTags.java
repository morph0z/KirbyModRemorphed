package com.gmail.jamal009a.kirbymodremorphed.util;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_KIRBY_TOOLS = tag("needs_kirby_tools");
        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(KirbyModRemorphed.MODID, name));
        }
    }
    public static class Items{
        public static final TagKey<Item> KIRBY_FOOD = tag("kirby_food");
        public static final TagKey<Item> KIRBY_ABILITIES = tag("kirby_abilities");
        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(KirbyModRemorphed.MODID, name));
        }
    }
}
