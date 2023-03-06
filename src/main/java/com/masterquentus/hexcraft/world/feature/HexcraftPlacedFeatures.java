package com.masterquentus.hexcraft.world.feature;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.config.HexcraftCommonConfigs;
import com.masterquentus.hexcraft.world.feature.HexcraftConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class HexcraftPlacedFeatures {
    public static final ResourceKey<PlacedFeature> EBONY_CHECKED_KEY = createKey("ebony_checked");
    public static final ResourceKey<PlacedFeature> EBONY_PLACED_KEY = createKey("ebony_placed");
    public static final ResourceKey<PlacedFeature> BLOOD_OAK_CHECKED_KEY = createKey("blood_oak_checked");
    public static final ResourceKey<PlacedFeature> BLOOD_OAK_PLACED_KEY = createKey("blood_oak_placed");
    public static final ResourceKey<PlacedFeature> HELL_BARK_CHECKED_KEY = createKey("hell_bark_checked");
    public static final ResourceKey<PlacedFeature> HELL_BARK_PLACED_KEY = createKey("hell_bark_placed");
    public static final ResourceKey<PlacedFeature> WHITE_OAK_CHECKED_KEY = createKey("white_oak_checked");
    public static final ResourceKey<PlacedFeature> WHITE_OAK_PLACED_KEY = createKey("white_oak_placed");
    public static final ResourceKey<PlacedFeature> ALDER_CHECKED_KEY = createKey("alder_checked");
    public static final ResourceKey<PlacedFeature> ALDER_PLACED_KEY = createKey("alder_placed");
    public static final ResourceKey<PlacedFeature> WITCH_HAZEL_CHECKED_KEY = createKey("witch_hazel_checked");
    public static final ResourceKey<PlacedFeature> WITCH_HAZEL_PLACED_KEY = createKey("witch_hazel_placed");
    public static final ResourceKey<PlacedFeature> WILLOW_CHECKED_KEY = createKey("willow_checked");
    public static final ResourceKey<PlacedFeature> WILLOW_PLACED_KEY = createKey("willow_placed");
    public static final ResourceKey<PlacedFeature> HAWTHORN_CHECKED_KEY = createKey("hawthorn_checked");
    public static final ResourceKey<PlacedFeature> HAWTHORN_PLACED_KEY = createKey("hawthorn_placed");
    public static final ResourceKey<PlacedFeature> CEDAR_CHECKED_KEY = createKey("cedar_checked");
    public static final ResourceKey<PlacedFeature> CEDAR_PLACED_KEY = createKey("cedar_placed");
    public static final ResourceKey<PlacedFeature> DISTORTED_CHECKED_KEY = createKey("distorted_checked");
    public static final ResourceKey<PlacedFeature> DISTORTED_PLACED_KEY = createKey("distorted_placed");
    public static final ResourceKey<PlacedFeature> ELDER_CHECKED_KEY = createKey("elder_checked");
    public static final ResourceKey<PlacedFeature> ELDER_PLACED_KEY = createKey("elder_placed");
    public static final ResourceKey<PlacedFeature> JUNIPER_CHECKED_KEY = createKey("juniper_checked");
    public static final ResourceKey<PlacedFeature> JUNIPER_PLACED_KEY = createKey("juniper_placed");
    public static final ResourceKey<PlacedFeature> ROWAN_CHECKED_KEY = createKey("rowan_checked");
    public static final ResourceKey<PlacedFeature> ROWAN_PLACED_KEY = createKey("rowan_placed");
    public static final ResourceKey<PlacedFeature> TWISTED_CHECKED_KEY = createKey("twisted_checked");
    public static final ResourceKey<PlacedFeature> TWISTED_PLACED_KEY = createKey("twisted_placed");
    public static final ResourceKey<PlacedFeature> WITCH_WOOD_CHECKED_KEY = createKey("witch_wood_checked");
    public static final ResourceKey<PlacedFeature> WITCH_WOOD_PLACED_KEY = createKey("witch_wood_placed");
    public static final ResourceKey<PlacedFeature> ECHO_WOOD_CHECKED_KEY = createKey("echo_wood_checked");
    public static final ResourceKey<PlacedFeature> ECHO_WOOD_PLACED_KEY = createKey("echo_wood_placed");
    public static final ResourceKey<PlacedFeature> BLOOD_MUSHROOM_CHECKED_KEY = createKey("blood_mushroom_checked");
    public static final ResourceKey<PlacedFeature> BLOOD_MUSHROOM_PLACED_KEY = createKey("blood_mushroom_placed");
    public static final ResourceKey<PlacedFeature> PEARL_STONE_PLACED_KEY = createKey("pearl_stone_placed");
    public static final ResourceKey<PlacedFeature> CRIMSON_STONE_PLACED_KEY = createKey("crimson_stone_placed");
    public static final ResourceKey<PlacedFeature> BLACK_OBSIDIAN_PLACED_KEY = createKey("black_obsidian_placed");
    public static final ResourceKey<PlacedFeature> MOONSTONE_PLACED_KEY = createKey("moonstone_placed");
    public static final ResourceKey<PlacedFeature> END_MOONSTONE_PLACED_KEY = createKey("end_moonstone_placed");
    public static final ResourceKey<PlacedFeature> NETHER_MOONSTONE_PLACED_KEY = createKey("nether_moonstone_placed");
    public static final ResourceKey<PlacedFeature> SILVER_PLACED_KEY = createKey("silver_placed");
    public static final ResourceKey<PlacedFeature> END_SILVER_PLACED_KEY = createKey("end_silver_placed");
    public static final ResourceKey<PlacedFeature> NETHER_SILVER_PLACED_KEY = createKey("nether_silver_placed");
    public static final ResourceKey<PlacedFeature> VAMPIRIC_PLACED_KEY = createKey("vampiric_placed");
    public static final ResourceKey<PlacedFeature> END_VAMPIRIC_PLACED_KEY = createKey("end_vampiric_placed");
    public static final ResourceKey<PlacedFeature> NETHER_VAMPIRIC_PLACED_KEY = createKey("nether_vampiric_placed");
    public static final ResourceKey<PlacedFeature> MAGIC_CRYSTAL_GEODE_PLACED_KEY = createKey("magic_crystal_geode_placed");
    public static final ResourceKey<PlacedFeature> VAMPIRE_ORCHID_PLACED_KEY = createKey("vampire_orchid_placed");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, EBONY_CHECKED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.EBONY_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.EBONY_SAPLING.get())));
        register(context, EBONY_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.EBONY_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(70)));

        register(context, BLOOD_OAK_CHECKED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.BLOOD_OAK_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.BLOOD_OAK_SAPLING.get())));
        register(context, BLOOD_OAK_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.BLOOD_OAK_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(70)));

        register(context, HELL_BARK_CHECKED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.HELL_BARK_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.BLOOD_OAK_SAPLING.get())));
        register(context, HELL_BARK_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.HELL_BARK_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(70)));

        register(context, WHITE_OAK_CHECKED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.WHITE_OAK_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.WHITE_OAK_SAPLING.get())));
        register(context, WHITE_OAK_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.WHITE_OAK_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(70)));

        register(context, ALDER_CHECKED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.ALDER_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.ALDER_SAPLING.get())));
        register(context, ALDER_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.ALDER_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(70)));

        register(context, WITCH_HAZEL_CHECKED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.WITCH_HAZEL_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.WITCH_HAZEL_SAPLING.get())));
        register(context, WITCH_HAZEL_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.WITCH_HAZEL_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(70)));

        register(context, WILLOW_CHECKED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.WILLOW_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.WILLOW_SAPLING.get())));
        register(context, WILLOW_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.WILLOW_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(70)));

        register(context, HAWTHORN_CHECKED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.HAWTHORN_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.HAWTHORN_SAPLING.get())));
        register(context, HAWTHORN_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.HAWTHORN_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(70)));

        register(context, CEDAR_CHECKED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.CEDAR_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.CEDAR_SAPLING.get())));
        register(context, CEDAR_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.CEDAR_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(70)));

        register(context, DISTORTED_CHECKED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.DISTORTED_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.DISTORTED_SAPLING.get())));
        register(context, DISTORTED_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.DISTORTED_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(70)));

        register(context, ELDER_CHECKED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.ELDER_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.ELDER_SAPLING.get())));
        register(context, ELDER_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.ELDER_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(70)));

        register(context, JUNIPER_CHECKED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.JUNIPER_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.JUNIPER_SAPLING.get())));
        register(context, JUNIPER_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.JUNIPER_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(70)));

        register(context, ROWAN_CHECKED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.ROWAN_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.ROWAN_SAPLING.get())));
        register(context, ROWAN_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.ROWAN_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(70)));

        register(context, TWISTED_CHECKED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.TWISTED_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.TWISTED_SAPLING.get())));
        register(context, TWISTED_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.TWISTED_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(70)));

        register(context, WITCH_WOOD_CHECKED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.WITCH_WOOD_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.WITCH_WOOD_SAPLING.get())));
        register(context, WITCH_WOOD_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.WITCH_WOOD_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(70)));

        register(context, ECHO_WOOD_CHECKED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.ECHO_WOOD_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.ECHO_WOOD_SAPLING.get())));
        register(context, ECHO_WOOD_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.ECHO_WOOD_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(70)));

        register(context, BLOOD_MUSHROOM_CHECKED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.BLOOD_MUSHROOM_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.BLOOD_MUSHROOM.get())));
        register(context, BLOOD_MUSHROOM_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.BLOOD_MUSHROOM_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(70)));

        register(context, PEARL_STONE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.OVERWORLD_PEARLSTONE_KEY),
                commonOrePlacement(12, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        register(context, CRIMSON_STONE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.OVERWORLD_CRIMSON_KEY),
                commonOrePlacement(12, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        register(context, BLACK_OBSIDIAN_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.END_BLACK_OBSIDIAN_KEY),
                commonOrePlacement(12, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        register(context, MOONSTONE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.OVERWORLD_MOONSTONE_ORE_KEY),
                commonOrePlacement(12, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        register(context, NETHER_MOONSTONE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.NETHER_MOONSTONE_ORE_KEY),
                commonOrePlacement(12, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        register(context, END_MOONSTONE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.END_MOONSTONE_ORE_KEY),
                commonOrePlacement(12, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        register(context, SILVER_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.OVERWORLD_SILVER_ORE_KEY),
                commonOrePlacement(12, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        register(context, NETHER_SILVER_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.NETHER_SILVER_ORE_KEY),
                commonOrePlacement(12, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        register(context, END_SILVER_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.END_SILVER_ORE_KEY),
                commonOrePlacement(12, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        register(context, VAMPIRIC_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.OVERWORLD_VAMPIRIC_ORE_KEY),
                commonOrePlacement(12, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        register(context, NETHER_VAMPIRIC_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.NETHER_VAMPIRIC_ORE_KEY),
                commonOrePlacement(12, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        register(context, END_VAMPIRIC_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.END_VAMPIRIC_ORE_KEY),
                commonOrePlacement(12, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        register(context, MAGIC_CRYSTAL_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.MAGIC_CRYSTAL_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));

        register(context, VAMPIRE_ORCHID_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.VAMPIRE_ORCHID_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));


    }


    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Hexcraft.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}