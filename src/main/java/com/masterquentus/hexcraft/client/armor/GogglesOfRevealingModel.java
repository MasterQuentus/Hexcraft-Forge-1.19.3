package com.masterquentus.hexcraft.client.armor;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.item.custom.GoogglesOfRevealingItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GogglesOfRevealingModel extends AnimatedGeoModel<GoogglesOfRevealingItem> {
    @Override
    public ResourceLocation getModelResource(GoogglesOfRevealingItem object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "geo/goggles_of_revealing.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GoogglesOfRevealingItem object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/models/armor/goggles_of_revealing_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GoogglesOfRevealingItem animatable) {
        return new ResourceLocation(Hexcraft.MOD_ID, "animations/armor_animation.json");
    }
}
