package com.masterquentus.hexcraft.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.WendigoEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WendigoModel extends AnimatedGeoModel<WendigoEntity> {
    @Override
    public ResourceLocation getModelResource(WendigoEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "geo/wendigo.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WendigoEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/wendigo/wendigo.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WendigoEntity animatable) {
        return new ResourceLocation(Hexcraft.MOD_ID, "animations/wendigo.animation.json");
    }
}
