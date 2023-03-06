package com.masterquentus.hexcraft.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class HexcraftCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> PEARL_STONE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> PEARL_STONE_VEINS_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> CRIMSON_STONE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> CRIMSON_STONE_VEINS_SIZE;
    //public static final ForgeConfigSpec.ConfigValue<Integer> BLACK_OBSIDIAN_VEINS_PER_CHUNK;
    //public static final ForgeConfigSpec.ConfigValue<Integer> BLACK_OBSIDIAN_VEINS_SIZE;

    static {
        BUILDER.push("Configs for Hexcraft");

        PEARL_STONE_VEINS_PER_CHUNK = BUILDER.comment("How many Pearlstone Veins spawn per chunk!")
                .define("Veins Per Chunk", 7);
        PEARL_STONE_VEINS_SIZE = BUILDER.comment("How many Pearlstone Blocks spawn in one Vein!")
                .defineInRange("Vein Size", 40, 4, 70);

        CRIMSON_STONE_VEINS_PER_CHUNK = BUILDER.comment("How many Crimsonstone Veins spawn per chunk!")
                .define("Veins Per Chunk", 7);
        CRIMSON_STONE_VEINS_SIZE = BUILDER.comment("How many Crimsonstone Blocks spawn in one Vein!")
                .defineInRange("Vein Size", 40, 4, 70);

        //BLACK_OBSIDIAN_VEINS_PER_CHUNK = BUILDER.comment("How many Black Obsidian Veins spawn per chunk!")
                //.define("Veins Per Chunk", 7);
        //BLACK_OBSIDIAN_VEINS_SIZE = BUILDER.comment("How many Black Obsidian Blocks spawn in one Vein!")
                //.defineInRange("Vein Size", 14, 4, 40);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}