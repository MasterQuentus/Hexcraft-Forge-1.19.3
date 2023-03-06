package com.masterquentus.hexcraft.client;

import com.masterquentus.hexcraft.entity.client.gui.*;
import com.masterquentus.hexcraft.world.HexcraftMenus;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HexcraftScreens {
    @SubscribeEvent
    public static void clientLoad(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(HexcraftMenus.EBONY_CRATE_GUI.get(), CrateEbonyGUIScreen::new);

            MenuScreens.register(HexcraftMenus.BLOOD_OAK_CRATE_GUI.get(), CrateBloodOakGUIScreen::new);

            MenuScreens.register(HexcraftMenus.HELLBARK_CRATE_GUI.get(), CrateHellbarkGUIScreen::new);

            MenuScreens.register(HexcraftMenus.WHITE_OAK_CRATE_GUI.get(), CrateWhiteOakGUIScreen::new);

            MenuScreens.register(HexcraftMenus.ALDER_CRATE_GUI.get(), CrateAlderGUIScreen::new);

            MenuScreens.register(HexcraftMenus.WITCH_HAZEL_CRATE_GUI.get(), CrateWitchHazelGUIScreen::new);

            MenuScreens.register(HexcraftMenus.WILLOW_CRATE_GUI.get(), CrateWillowGUIScreen::new);

            MenuScreens.register(HexcraftMenus.HAWTHORN_CRATE_GUI.get(), CrateHawthornGUIScreen::new);

            MenuScreens.register(HexcraftMenus.CEDAR_CRATE_GUI.get(), CrateCedarGUIScreen::new);

            MenuScreens.register(HexcraftMenus.DISTORTED_CRATE_GUI.get(), CrateDistortedGUIScreen::new);

            MenuScreens.register(HexcraftMenus.ELDER_CRATE_GUI.get(), CrateElderGUIScreen::new);

            MenuScreens.register(HexcraftMenus.JUNIPER_CRATE_GUI.get(), CrateJuniperGUIScreen::new);

            MenuScreens.register(HexcraftMenus.ROWAN_CRATE_GUI.get(), CrateRowanGUIScreen::new);

            MenuScreens.register(HexcraftMenus.TWISTED_CRATE_GUI.get(), CrateTwistedGUIScreen::new);

            MenuScreens.register(HexcraftMenus.WITCH_WOOD_CRATE_GUI.get(), CrateWitchWoodGUIScreen::new);

            MenuScreens.register(HexcraftMenus.ECHO_WOOD_CRATE_GUI.get(), CrateEchoWoodGUIScreen::new);

            MenuScreens.register(HexcraftMenus.OAK_CRATE_GUI.get(), CrateOakGUIScreen::new);

            MenuScreens.register(HexcraftMenus.SPRUCE_CRATE_GUI.get(), CrateSpruceGUIScreen::new);

            MenuScreens.register(HexcraftMenus.BIRCH_CRATE_GUI.get(), CrateBirchGUIScreen::new);

            MenuScreens.register(HexcraftMenus.JUNGLE_CRATE_GUI.get(), CrateJungleGUIScreen::new);

            MenuScreens.register(HexcraftMenus.ACACIA_CRATE_GUI.get(), CrateAcaciaGUIScreen::new);

            MenuScreens.register(HexcraftMenus.DARK_OAK_CRATE_GUI.get(), CrateDarkOakGUIScreen::new);

            MenuScreens.register(HexcraftMenus.CRIMSON_CRATE_GUI.get(), CrateCrimsonGUIScreen::new);

            MenuScreens.register(HexcraftMenus.WARPED_CRATE_GUI.get(), CrateWarpedGUIScreen::new);

            MenuScreens.register(HexcraftMenus.MANGROVE_CRATE_GUI.get(), CrateMangroveGUIScreen::new);
        });
    }
}
