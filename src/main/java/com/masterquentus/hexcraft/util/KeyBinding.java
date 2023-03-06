package com.masterquentus.hexcraft.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATEGORY_HEXCRAFT = "key.category.hexcraft.hexcraft";
    public static final String KEY_DRINK_BLOOD = "key.hexcraft.drink_blood";

    public static final KeyMapping DRINKING_KEY = new KeyMapping(KEY_DRINK_BLOOD, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_V, KEY_CATEGORY_HEXCRAFT);

}
