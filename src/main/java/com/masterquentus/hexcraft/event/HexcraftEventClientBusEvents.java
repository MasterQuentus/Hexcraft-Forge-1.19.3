package com.masterquentus.hexcraft.event;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.client.armor.GogglesOfRevealingRenderer;
import com.masterquentus.hexcraft.entity.client.armor.WitchesArmorRenderer;
import com.masterquentus.hexcraft.item.custom.GoogglesOfRevealingItem;
import com.masterquentus.hexcraft.item.custom.WitchesArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = Hexcraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HexcraftEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(WitchesArmorItem.class, new WitchesArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(GoogglesOfRevealingItem.class, new GogglesOfRevealingRenderer());
    }
}