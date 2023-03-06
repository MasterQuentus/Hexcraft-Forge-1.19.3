package com.masterquentus.hexcraft.dimesnsion;

import com.masterquentus.hexcraft.Hexcraft;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class HexcraftDimensions {
    public static final ResourceKey<Level> UNDERWORLD_DIMENSION_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(Hexcraft.MOD_ID, "underworld"));

    public static final ResourceKey<DimensionType> UNDERWORLD_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY,
                    new ResourceLocation(Hexcraft.MOD_ID, "underworld"));

    public static void register() {
        System.out.println("Registering HexcraftDimensions for " + Hexcraft.MOD_ID);
    }
}