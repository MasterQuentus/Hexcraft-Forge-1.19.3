package com.masterquentus.hexcraft.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.FairyEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FairyModel extends AnimatedGeoModel<FairyEntity> {
    @Override
    public ResourceLocation getModelResource(FairyEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "geo/fairy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FairyEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/fairies/fairy.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FairyEntity animatable) {
        return new ResourceLocation(Hexcraft.MOD_ID, "animations/fairy.animation.json");
    }
}
