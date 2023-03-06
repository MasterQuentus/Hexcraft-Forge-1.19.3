package com.masterquentus.hexcraft.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.VampirePiglinEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class VampirePiglinRenderer extends GeoEntityRenderer<VampirePiglinEntity> {
    public VampirePiglinRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new VampirePiglinModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(VampirePiglinEntity instance) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/vampires/vampire_piglin.png");
    }

    @Override
    public RenderType getRenderType(VampirePiglinEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}