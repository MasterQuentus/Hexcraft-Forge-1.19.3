package com.masterquentus.hexcraft.item;

import com.masterquentus.hexcraft.Hexcraft;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Hexcraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class HexcraftCreativeModTabs {
    public static CreativeModeTab HEXCRAFT_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        HEXCRAFT_TAB = event.registerCreativeModeTab(new ResourceLocation(Hexcraft.MOD_ID, "hexcraft_tab"),
                builder -> builder.icon(() -> new ItemStack((HexcraftItems.BLOOD_BOTTLE.get())))
                        .title(Component.translatable("creativemodetab.hexcraft_tab")));
    }
}
