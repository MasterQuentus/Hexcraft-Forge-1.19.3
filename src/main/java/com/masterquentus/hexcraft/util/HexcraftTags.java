package com.masterquentus.hexcraft.util;

import com.masterquentus.hexcraft.Hexcraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class HexcraftTags {
    public static class Blocks {
        public static final TagKey<Block> PORTAL_FRAME_BLOCKS
                = tag("portal_frame_blocks");

        public static final TagKey<Block> TAINTED_MAGIC_REPLACEABLE
                = tag("tainted_magic_replaceable");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Hexcraft.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}