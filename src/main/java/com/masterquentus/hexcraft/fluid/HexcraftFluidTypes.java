package com.masterquentus.hexcraft.fluid;

import com.masterquentus.hexcraft.Hexcraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class HexcraftFluidTypes {
    public static final ResourceLocation BLOOD_STILL_RL = new ResourceLocation(Hexcraft.MOD_ID,"block/blood_still");
    public static final ResourceLocation BLOOD_FLOWING_RL = new ResourceLocation(Hexcraft.MOD_ID,"block/blood_flow");
    public static final ResourceLocation BLOOD_OVERLAY_RL = new ResourceLocation(Hexcraft.MOD_ID, "misc/in_blood");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Hexcraft.MOD_ID);

    public static final RegistryObject<FluidType> BLOOD_FLUID_TYPE = register("blood_fluid",
            FluidType.Properties.create().density(15).viscosity(5).canDrown(true).canPushEntity(true)
                    .canSwim(true).supportsBoating(true).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(BLOOD_STILL_RL, BLOOD_FLOWING_RL, BLOOD_OVERLAY_RL,
                0x0, new Vector3f(0f / 0f, 0f / 0f, 0f / 0f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
