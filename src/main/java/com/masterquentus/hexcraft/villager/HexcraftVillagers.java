package com.masterquentus.hexcraft.villager;

import com.google.common.collect.ImmutableSet;
import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.block.HexcraftBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class HexcraftVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, Hexcraft.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, Hexcraft.MOD_ID);
    public static final RegistryObject<PoiType> WITCHES_CAULDRON_BLOCK_POI = POI_TYPES.register("witches_cauldron_poi",
            () -> new PoiType(ImmutableSet.copyOf(HexcraftBlocks.WITCHES_CAULDRON.get().getStateDefinition().getPossibleStates()),
                    1, 1));
    public static final RegistryObject<PoiType> HUNTERS_TABLE_BLOCK_POI = POI_TYPES.register("hunters_table_block_poi",
            () -> new PoiType(ImmutableSet.copyOf(HexcraftBlocks.HUNTERS_TABLE.get().getStateDefinition().getPossibleStates()),
                    1, 1));
    public static final RegistryObject<VillagerProfession> WITCH_PROFESSION = VILLAGER_PROFESSIONS.register("witch_profession",
            () -> new VillagerProfession("witch_profession", x -> x.get() == WITCHES_CAULDRON_BLOCK_POI.get(),
                    x -> x.get() == WITCHES_CAULDRON_BLOCK_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));
    public static final RegistryObject<VillagerProfession> VAMPIRE_EXPERT = VILLAGER_PROFESSIONS.register("vampire_expert",
            () -> new VillagerProfession("vampire_expert", x -> x.get() == HUNTERS_TABLE_BLOCK_POI.get(),
                    x -> x.get() == HUNTERS_TABLE_BLOCK_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));

    public static void registerPOIs() {
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, WITCHES_CAULDRON_BLOCK_POI.get());
        } catch (InvocationTargetException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
