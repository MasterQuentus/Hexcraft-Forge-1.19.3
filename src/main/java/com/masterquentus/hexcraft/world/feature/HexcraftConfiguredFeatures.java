package com.masterquentus.hexcraft.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.masterquentus.hexcraft.block.HexcraftBlocks;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HugeMushroomBlock;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.HugeFungusConfiguration;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.DarkOakFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.DarkOakTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class HexcraftConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> EBONY_KEY = registerKey("ebony");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EBONY_SPAWN_KEY = registerKey("ebony_spawn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLOOD_OAK_KEY = registerKey("blood_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLOOD_OAK_SPAWN_KEY = registerKey("blood_oak_spawn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HELL_BARK_KEY = registerKey("hell_bark");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HELL_BARK_SPAWN_KEY = registerKey("hell_bark_spawn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_OAK_KEY = registerKey("white_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_OAK_SPAWN_KEY = registerKey("white_oak_spawn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALDER_KEY = registerKey("alder");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALDER_SPAWN_KEY = registerKey("alder_spawn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WITCH_HAZEL_KEY = registerKey("witch_hazel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WITCH_HAZEL_SPAWN_KEY = registerKey("witch_hazel_spawn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_KEY = registerKey("willow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_SPAWN_KEY = registerKey("willow_spawn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HAWTHORN_KEY = registerKey("hawthorn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HAWTHORN_SPAWN_KEY = registerKey("hawthorn_spawn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CEDAR_KEY = registerKey("cedar");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CEDAR_SPAWN_KEY = registerKey("cedar_spawn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DISTORTED_KEY = registerKey("distorted");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DISTORTED_SPAWN_KEY = registerKey("distorted_spawn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ELDER_KEY = registerKey("elder");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ELDER_SPAWN_KEY = registerKey("elder_spawn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUNIPER_KEY = registerKey("juniper");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUNIPER_SPAWN_KEY = registerKey("juniper_spawn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ROWAN_KEY = registerKey("rowan");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ROWAN_SPAWN_KEY = registerKey("rowan_spawn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TWISTED_KEY = registerKey("twisted");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TWISTED_SPAWN_KEY = registerKey("twisted_spawn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WITCH_WOOD_KEY = registerKey("witch_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WITCH_WOOD_SPAWN_KEY = registerKey("witch_wood_spawn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ECHO_WOOD_KEY = registerKey("echo_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ECHO_WOOD_SPAWN_KEY = registerKey("echo_wood_spawn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLOOD_MUSHROOM_KEY = registerKey("blood_mushroom_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLOOD_MUSHROOM_SPAWN_KEY = registerKey("blood_mushroom_spawn");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PEARLSTONE_KEY = registerKey("overworld_pearlstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CRIMSON_KEY = registerKey("overworld_crimson_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_BLACK_OBSIDIAN_KEY = registerKey("end_black_obsidian");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MOONSTONE_ORE_KEY = registerKey("overworld_moonstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_MOONSTONE_ORE_KEY = registerKey("end_moonstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_MOONSTONE_ORE_KEY = registerKey("nether_moonstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILVER_ORE_KEY = registerKey("overworld_silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SILVER_ORE_KEY = registerKey("end_silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SILVER_ORE_KEY = registerKey("nether_silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_VAMPIRIC_ORE_KEY = registerKey("overworld_vampiric_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_VAMPIRIC_ORE_KEY = registerKey("end_vampiric_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_VAMPIRIC_ORE_KEY = registerKey("nether_vampiric_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGIC_CRYSTAL_GEODE_KEY = registerKey("magic_crystal_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> VAMPIRE_ORCHID_KEY = registerKey("vampire_orchid");

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_PEARLSTONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), HexcraftBlocks.PEARL_STONE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CRIMSON = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), HexcraftBlocks.CRIMSON_STONE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_BLACK_OBSIDIAN = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), HexcraftBlocks.BLACK_OBSIDIAN.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_MOONSTONE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), HexcraftBlocks.MOONSTONE_ORE.get().defaultBlockState()),
            OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), HexcraftBlocks.DEEPSLATE_MOONSTONE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_MOONSTONE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), HexcraftBlocks.END_MOONSTONE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_MOONSTONE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), HexcraftBlocks.NETHER_MOONSTONE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SILVER_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), HexcraftBlocks.SILVER_ORE.get().defaultBlockState()),
            OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), HexcraftBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_SILVER_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), HexcraftBlocks.END_SILVER_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_SILVER_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), HexcraftBlocks.NETHER_SILVER_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_VAMPIRIC_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), HexcraftBlocks.VAMPIRIC_ORE.get().defaultBlockState()),
            OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), HexcraftBlocks.DEEPSLATE_VAMPIRIC_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_VAMPIRIC_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), HexcraftBlocks.END_VAMPIRIC_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_VAMPIRIC_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), HexcraftBlocks.NETHER_VAMPIRIC_ORE.get().defaultBlockState())));


    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);

        register(context, EBONY_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(HexcraftBlocks.EBONY_LOG.get()),
                new StraightTrunkPlacer(5, 2, 1),
                BlockStateProvider.simple(HexcraftBlocks.EBONY_LEAVES.get()),
                new SpruceFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3),
                        UniformInt.of(3, 4)),
                new TwoLayersFeatureSize(2, 0, 2)).build());

        register(context, EBONY_SPAWN_KEY, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                        placedFeatures.getOrThrow(HexcraftPlacedFeatures.EBONY_CHECKED_KEY),
                        0.5F)), placedFeatures.getOrThrow(HexcraftPlacedFeatures.EBONY_CHECKED_KEY)));

        register(context, BLOOD_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(HexcraftBlocks.EBONY_LOG.get()),
                new DarkOakTrunkPlacer(2, 3, 3),
                BlockStateProvider.simple(HexcraftBlocks.EBONY_LEAVES.get()),
                new DarkOakFoliagePlacer(UniformInt.of(0, 0),
                        UniformInt.of(0, 0)),
                new TwoLayersFeatureSize(1, 1, 0)).ignoreVines().build());

        register(context, BLOOD_OAK_SPAWN_KEY, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                        placedFeatures.getOrThrow(HexcraftPlacedFeatures.EBONY_CHECKED_KEY),
                        0.5F)), placedFeatures.getOrThrow(HexcraftPlacedFeatures.EBONY_CHECKED_KEY)));

        register(context, HELL_BARK_KEY, Feature.HUGE_FUNGUS, new HugeFungusConfiguration(Blocks.GRASS_BLOCK.defaultBlockState(), HexcraftBlocks.HELL_BARK_LOG.get().defaultBlockState(),
                HexcraftBlocks.HELL_BARK_LEAVES.get().defaultBlockState(), HexcraftBlocks.HELL_FUNGAL_LAMP.get().defaultBlockState(), true));

        register(context, WHITE_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(HexcraftBlocks.WHITE_OAK_LOG.get()),
                new DarkOakTrunkPlacer(2, 3, 3),
                BlockStateProvider.simple(HexcraftBlocks.WHITE_OAK_LEAVES.get()),
                new DarkOakFoliagePlacer(UniformInt.of(0, 0),
                        UniformInt.of(0, 0)),
                new TwoLayersFeatureSize(1, 1, 0)).ignoreVines().build());

        register(context, ALDER_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(HexcraftBlocks.ALDER_LOG.get()),
                new StraightTrunkPlacer(2, 3, 2),
                BlockStateProvider.simple(HexcraftBlocks.ALDER_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, ALDER_SPAWN_KEY, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                        placedFeatures.getOrThrow(HexcraftPlacedFeatures.ALDER_CHECKED_KEY),
                        0.5F)), placedFeatures.getOrThrow(HexcraftPlacedFeatures.ALDER_CHECKED_KEY)));

        register(context, WITCH_HAZEL_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.WITCH_HAZEL_LOG.get()),
                new ForkingTrunkPlacer(2, 4, 4),
                BlockStateProvider.simple(HexcraftBlocks.WITCH_HAZEL_LEAVES.get()),
                new DarkOakFoliagePlacer(UniformInt.of(0, 0),
                        UniformInt.of(0, 0)),
                new TwoLayersFeatureSize(1, 1, 0)).ignoreVines().build());

        register(context, WITCH_HAZEL_SPAWN_KEY, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                        placedFeatures.getOrThrow(HexcraftPlacedFeatures.WITCH_HAZEL_CHECKED_KEY),
                        0.5F)), placedFeatures.getOrThrow(HexcraftPlacedFeatures.WITCH_HAZEL_CHECKED_KEY)));

        register(context, WILLOW_KEY, Feature.TREE,  new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.WILLOW_LOG.get()),
                new StraightTrunkPlacer(4, 4, 6),
                BlockStateProvider.simple(HexcraftBlocks.WILLOW_LEAVES.get()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(5), ConstantInt.of(3), ConstantInt.of(4), 70),
                new TwoLayersFeatureSize(4, 1, 3)).build());

        register(context, HAWTHORN_KEY, Feature.TREE,  new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.HAWTHORN_LOG.get()),
                new ForkingTrunkPlacer(3, 3, 3),
                BlockStateProvider.simple(HexcraftBlocks.HAWTHORN_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                new TwoLayersFeatureSize(3, 3, 3)).ignoreVines().build());

        register(context, CEDAR_KEY, Feature.TREE,  new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.CEDAR_LOG.get()),
                new StraightTrunkPlacer(3, 2, 2),
                BlockStateProvider.simple(HexcraftBlocks.CEDAR_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(7), 7),
                new TwoLayersFeatureSize(3, 3, 3)).ignoreVines().build());

        register(context, DISTORTED_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.DISTORTED_LOG.get()),
                new StraightTrunkPlacer(2, 3, 3),
                BlockStateProvider.simple(HexcraftBlocks.DISTORTED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(3, 2, 0)).ignoreVines().build());

        register(context, ELDER_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.ELDER_LOG.get()),
                new StraightTrunkPlacer(2, 3, 3),
                BlockStateProvider.simple(HexcraftBlocks.ELDER_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(3, 2, 0)).ignoreVines().build());

        register(context, JUNIPER_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.JUNIPER_LOG.get()),
                new ForkingTrunkPlacer(2, 4, 4),
                BlockStateProvider.simple(HexcraftBlocks.JUNIPER_LEAVES.get()),
                new DarkOakFoliagePlacer(UniformInt.of(1, 1),
                        UniformInt.of(0, 0)),
                new TwoLayersFeatureSize(1, 1, 0)).ignoreVines().build());

        register(context, ROWAN_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.ROWAN_LOG.get()),
                new StraightTrunkPlacer(3, 4, 4),
                BlockStateProvider.simple(HexcraftBlocks.ROWAN_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(3, 2, 0)).ignoreVines().build());

        register(context, TWISTED_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.TWISTED_LOG.get()),
                new ForkingTrunkPlacer(4, 4, 4),
                BlockStateProvider.simple(HexcraftBlocks.TWISTED_LEAVES.get()),
                new DarkOakFoliagePlacer(UniformInt.of(0, 0),
                        UniformInt.of(0, 0)),
                new TwoLayersFeatureSize(1, 1, 0)).ignoreVines().build());

        register(context, WITCH_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.WITCH_WOOD_LOG.get()),
                new ForkingTrunkPlacer(4, 4, 4),
                BlockStateProvider.simple(HexcraftBlocks.WITCH_WOOD_LEAVES.get()),
                new DarkOakFoliagePlacer(UniformInt.of(0, 0),
                        UniformInt.of(0, 0)),
                new TwoLayersFeatureSize(1, 1, 0)).ignoreVines().build());

        register(context, ECHO_WOOD_KEY, Feature.HUGE_FUNGUS, new HugeFungusConfiguration(Blocks.GRASS_BLOCK.defaultBlockState(), HexcraftBlocks.ECHO_WOOD_LOG.get().defaultBlockState(),
                HexcraftBlocks.ECHO_WOOD_LEAVES.get().defaultBlockState(), HexcraftBlocks.HELL_FUNGAL_LAMP.get().defaultBlockState(), true));

        register(context, BLOOD_MUSHROOM_KEY, Feature.HUGE_RED_MUSHROOM, new HugeMushroomFeatureConfiguration(BlockStateProvider.simple(HexcraftBlocks.BLOOD_MUSHROOM_BLOCK.get().defaultBlockState().setValue(HugeMushroomBlock.DOWN,
                Boolean.valueOf(false))), BlockStateProvider.simple(HexcraftBlocks.BLOOD_MUSHROOM_STEM.get().defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.valueOf(false)).setValue(HugeMushroomBlock.DOWN,
                Boolean.valueOf(false))), 2));

        register(context, OVERWORLD_PEARLSTONE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_PEARLSTONE.get(),12));

        register(context, OVERWORLD_CRIMSON_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_CRIMSON.get(),12));

        register(context, END_BLACK_OBSIDIAN_KEY, Feature.ORE, new OreConfiguration(END_BLACK_OBSIDIAN.get(),12));

        register(context, OVERWORLD_MOONSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_MOONSTONE_ORES.get(),12));

        register(context, END_MOONSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(END_MOONSTONE_ORES.get(),12));

        register(context, NETHER_MOONSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(NETHER_MOONSTONE_ORES.get(),12));

        register(context, OVERWORLD_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES.get(),12));

        register(context, END_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(END_SILVER_ORES.get(),12));

        register(context, NETHER_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(NETHER_SILVER_ORES.get(),12));

        register(context, OVERWORLD_VAMPIRIC_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_VAMPIRIC_ORES.get(),12));

        register(context, END_VAMPIRIC_ORE_KEY, Feature.ORE, new OreConfiguration(END_VAMPIRIC_ORES.get(),12));

        register(context, NETHER_VAMPIRIC_ORE_KEY, Feature.ORE, new OreConfiguration(NETHER_VAMPIRIC_ORES.get(),12));

        register(context, MAGIC_CRYSTAL_GEODE_KEY, Feature.GEODE,
                new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.DEEPSLATE),
                        BlockStateProvider.simple(HexcraftBlocks.MAGIC_CRYSTAL_BLOCK.get()),
                        BlockStateProvider.simple(HexcraftBlocks.BUDDING_MAGIC_CRYSTAL.get()),
                        BlockStateProvider.simple(HexcraftBlocks.MAGIC_CRYSTAL_BLOCK.get()),
                        List.of(HexcraftBlocks.MAGIC_CRYSTAL_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerSettings(1.7D, 1.2D, 2.5D, 3.5D),
                        new GeodeCrackSettings(0.25D, 1.5D, 1), 0.5D, 0.1D,
                        true, UniformInt.of(3, 8),
                        UniformInt.of(2, 6), UniformInt.of(1, 2),
                        -18, 18, 0.075D, 1));

        register(context, VAMPIRE_ORCHID_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(HexcraftBlocks.VAMPIRE_ORCHID.get())))));


    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Hexcraft.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
