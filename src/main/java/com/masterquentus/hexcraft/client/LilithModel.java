package com.masterquentus.hexcraft.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.LilithEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LilithModel extends AnimatedGeoModel<LilithEntity> {
    @Override
    public ResourceLocation getModelResource(LilithEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "geo/lilith.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LilithEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/lilith/lilith.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LilithEntity animatable) {
        return new ResourceLocation(Hexcraft.MOD_ID, "animations/lilith.animation.json");
    }
}
