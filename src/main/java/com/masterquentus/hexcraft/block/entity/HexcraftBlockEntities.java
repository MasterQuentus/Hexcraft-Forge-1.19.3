package com.masterquentus.hexcraft.block.entity;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.block.custom.HexcraftSignBlockEntity;
import com.masterquentus.hexcraft.entity.custom.crate.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Hexcraft.MOD_ID);

    public static final RegistryObject<BlockEntityType<HexcraftSignBlockEntity>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("sign_block_entity", () ->
                    BlockEntityType.Builder.of(HexcraftSignBlockEntity::new,
                            HexcraftBlocks.EBONY_WALL_SIGN.get(),
                            HexcraftBlocks.EBONY_SIGN.get(),
                            HexcraftBlocks.BLOOD_OAK_WALL_SIGN.get(),
                            HexcraftBlocks.BLOOD_OAK_SIGN.get(),
                            HexcraftBlocks.HELL_BARK_SIGN.get(),
                            HexcraftBlocks.HELL_BARK_WALL_SIGN.get(),
                            HexcraftBlocks.WHITE_OAK_SIGN.get(),
                            HexcraftBlocks.WHITE_OAK_WALL_SIGN.get(),
                            HexcraftBlocks.ALDER_WALL_SIGN.get(),
                            HexcraftBlocks.ALDER_SIGN.get(),
                            HexcraftBlocks.WITCH_HAZEL_WALL_SIGN.get(),
                            HexcraftBlocks.WITCH_HAZEL_SIGN.get(),
                            HexcraftBlocks.WILLOW_WALL_SIGN.get(),
                            HexcraftBlocks.WILLOW_SIGN.get(),
                            HexcraftBlocks.HAWTHORN_WALL_SIGN.get(),
                            HexcraftBlocks.HAWTHORN_SIGN.get(),
                            HexcraftBlocks.CEDAR_WALL_SIGN.get(),
                            HexcraftBlocks.CEDAR_SIGN.get(),
                            HexcraftBlocks.DISTORTED_WALL_SIGN.get(),
                            HexcraftBlocks.DISTORTED_SIGN.get(),
                            HexcraftBlocks.ELDER_WALL_SIGN.get(),
                            HexcraftBlocks.ELDER_SIGN.get(),
                            HexcraftBlocks.JUNIPER_WALL_SIGN.get(),
                            HexcraftBlocks.JUNIPER_SIGN.get(),
                            HexcraftBlocks.ROWAN_WALL_SIGN.get(),
                            HexcraftBlocks.ROWAN_SIGN.get(),
                            HexcraftBlocks.TWISTED_WALL_SIGN.get(),
                            HexcraftBlocks.TWISTED_SIGN.get(),
                            HexcraftBlocks.WITCH_WOOD_WALL_SIGN.get(),
                            HexcraftBlocks.WITCH_WOOD_SIGN.get(),
                            HexcraftBlocks.ECHO_WOOD_WALL_SIGN.get(),
                            HexcraftBlocks.ECHO_WOOD_SIGN.get()).build(null));

    //Crates
    public static final RegistryObject<BlockEntityType<?>> CRATE_EBONY = register("crate_ebony", HexcraftBlocks.CRATE_EBONY,
            CrateEbonyBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_BLOOD_OAK = register("crate_blood_oak", HexcraftBlocks.CRATE_BLOOD_OAK,
            CrateBloodOakBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_HELLBARK = register("crate_hellbark", HexcraftBlocks.CRATE_HELLBARK,
            CrateHellbarkBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_WHITE_OAK = register("crate_white_oak", HexcraftBlocks.CRATE_WHITE_OAK,
            CrateWhiteOakBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_ALDER = register("crate_alder", HexcraftBlocks.CRATE_ALDER,
            CrateAlderBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_WITCH_HAZEL = register("crate_witch_hazel", HexcraftBlocks.CRATE_WITCH_HAZEL,
            CrateWitchHazelBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_WILLOW = register("crate_willow", HexcraftBlocks.CRATE_WILLOW,
            CrateWillowBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_HAWTHORN = register("crate_hawthorn", HexcraftBlocks.CRATE_HAWTHORN,
            CrateHawthornBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_CEDAR = register("crate_cedar", HexcraftBlocks.CRATE_CEDAR,
            CrateCedarBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_DISTORTED = register("crate_distorted", HexcraftBlocks.CRATE_DISTORTED,
            CrateDistortedBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_ELDER = register("crate_elder", HexcraftBlocks.CRATE_ELDER,
            CrateElderBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_JUNIPER = register("crate_juniper", HexcraftBlocks.CRATE_JUNIPER,
            CrateJuniperBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_ROWAN = register("crate_rowan", HexcraftBlocks.CRATE_ROWAN,
            CrateRowanBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_TWISTED = register("crate_twisted", HexcraftBlocks.CRATE_TWISTED,
            CrateTwistedBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_WITCH_WOOD = register("crate_witch_wood", HexcraftBlocks.CRATE_WITCH_WOOD,
            CrateWitchWoodBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_ECHO_WOOD = register("crate_echo_wood", HexcraftBlocks.CRATE_ECHO_WOOD,
            CrateEchoWoodBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_OAK = register("crate_oak", HexcraftBlocks.CRATE_OAK,
            CrateOakBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_SPRUCE = register("crate_spruce", HexcraftBlocks.CRATE_SPRUCE,
            CrateSpruceBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_BIRCH = register("crate_birch", HexcraftBlocks.CRATE_BIRCH,
            CrateBirchBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_JUNGLE = register("crate_jungle", HexcraftBlocks.CRATE_JUNGLE,
            CrateJungleBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_ACACIA = register("crate_acacia", HexcraftBlocks.CRATE_ACACIA,
            CrateAcaciaBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_DARK_OAK = register("crate_dark_oak", HexcraftBlocks.CRATE_DARK_OAK,
            CrateDarkOakBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_CRIMSON = register("crate_crimson", HexcraftBlocks.CRATE_CRIMSON,
            CrateCrimsonBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_WARPED = register("crate_warped", HexcraftBlocks.CRATE_WARPED,
            CrateWarpedBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_MANGROVE = register("crate_mangrove", HexcraftBlocks.CRATE_MANGROVE,
            CrateMangroveBlockEntity::new);


    private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
                                                               BlockEntityType.BlockEntitySupplier<?> supplier) {
        return BLOCK_ENTITIES.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
    }


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}