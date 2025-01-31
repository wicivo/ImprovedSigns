package com.craftycorvid.improvedSigns.config;

import com.craftycorvid.improvedSigns.ImprovedSignsMod;

import draylar.omegaconfig.OmegaConfig;
import draylar.omegaconfig.api.Comment;
import draylar.omegaconfig.api.Config;

public class ModConfig implements Config {

    private static ModConfig CONFIG;

    @Comment("==== Signs ===")
    public boolean disableSignEditOnPlace = false;
    public boolean enableSignPassthrough = true;
    public boolean enableSignRetain = true;
    public boolean enableSignCopy = true;
    @Comment("This option will copy the target sign's color and glow. \n" +
            "Disabled by default because it's technically duping dyes.")
    public boolean retainDyeOnSignCopy = false;

    @Comment("==== Item Frames ===")
    public boolean enableFramePassthrough = true;
    public boolean enableInvisibleFrames = true;
    @Comment("Choose what item turns frames invisible. Supported Items:\n" +
            "\tAMETHYST_SHARD\n" +
            "\tGLASS_PANE")
    public String invisibleFrameItem = "AMETHYST_SHARD";

    public static void init() {
        CONFIG = OmegaConfig.register(ModConfig.class);
        if (!CONFIG.invisibleFrameItem.equals("AMETHYST_SHARD") && !CONFIG.invisibleFrameItem.equals("GLASS_PANE")) {
            throw new IllegalArgumentException("Improved Frames config 'invisibleFrameItem' is invalid!");
        }
    }

    public static ModConfig get() {
        return CONFIG;
    }

    @Override
    public String getName() {
        return ImprovedSignsMod.MOD_ID;
    }

    @Override
    public String getExtension() {
        return "json5";
    }
}
