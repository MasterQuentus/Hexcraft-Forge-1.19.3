package com.masterquentus.hexcraft.world;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.world.inventory.crate.*;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftMenus {

    private static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Hexcraft.MOD_ID);

    public static final RegistryObject<MenuType<CrateEbonyGUIMenu>> EBONY_CRATE_GUI = REGISTRY.register("ebony_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateEbonyGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateBloodOakGUIMenu>> BLOOD_OAK_CRATE_GUI = REGISTRY.register("blood_oak_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateBloodOakGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateHellbarkGUIMenu>> HELLBARK_CRATE_GUI = REGISTRY.register("hellbark_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateHellbarkGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateWhiteOakGUIMenu>> WHITE_OAK_CRATE_GUI = REGISTRY.register("white_oak_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateWhiteOakGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateAlderGUIMenu>> ALDER_CRATE_GUI = REGISTRY.register("alder_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateAlderGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateWitchHazelGUIMenu>> WITCH_HAZEL_CRATE_GUI = REGISTRY.register("witch_hazel_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateWitchHazelGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateWillowGUIMenu>> WILLOW_CRATE_GUI = REGISTRY.register("willow_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateWillowGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateHawthornGUIMenu>> HAWTHORN_CRATE_GUI = REGISTRY.register("hawthorn_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateHawthornGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateCedarGUIMenu>> CEDAR_CRATE_GUI = REGISTRY.register("cedar_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateCedarGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateDistortedGUIMenu>> DISTORTED_CRATE_GUI = REGISTRY.register("crate_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateDistortedGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateElderGUIMenu>> ELDER_CRATE_GUI = REGISTRY.register("elder_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateElderGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateJuniperGUIMenu>> JUNIPER_CRATE_GUI = REGISTRY.register("juniper_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateJuniperGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateRowanGUIMenu>> ROWAN_CRATE_GUI = REGISTRY.register("rowan_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateRowanGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateTwistedGUIMenu>> TWISTED_CRATE_GUI = REGISTRY.register("twisted_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateTwistedGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateWitchWoodGUIMenu>> WITCH_WOOD_CRATE_GUI = REGISTRY.register("witch_wood_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateWitchWoodGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateEchoWoodGUIMenu>> ECHO_WOOD_CRATE_GUI = REGISTRY.register("echo_wood_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateEchoWoodGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateOakGUIMenu>> OAK_CRATE_GUI = REGISTRY.register("oak_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateOakGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateSpruceGUIMenu>> SPRUCE_CRATE_GUI = REGISTRY.register("spruce_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateSpruceGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateBirchGUIMenu>> BIRCH_CRATE_GUI = REGISTRY.register("birch_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateBirchGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateJungleGUIMenu>> JUNGLE_CRATE_GUI = REGISTRY.register("jungle_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateJungleGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateAcaciaGUIMenu>> ACACIA_CRATE_GUI = REGISTRY.register("acacia_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateAcaciaGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateDarkOakGUIMenu>> DARK_OAK_CRATE_GUI = REGISTRY.register("dark_oak_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateDarkOakGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateCrimsonGUIMenu>> CRIMSON_CRATE_GUI = REGISTRY.register("crimson_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateCrimsonGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateWarpedGUIMenu>> WARPED_CRATE_GUI = REGISTRY.register("warped_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateWarpedGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateMangroveGUIMenu>> MANGROVE_CRATE_GUI = REGISTRY.register("mangrove_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateMangroveGUIMenu(id, inv, null)));


    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }

}