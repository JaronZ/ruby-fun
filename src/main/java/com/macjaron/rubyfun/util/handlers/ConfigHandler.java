package com.macjaron.rubyfun.util.handlers;

import com.macjaron.rubyfun.util.Reference;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.LangKey;
import net.minecraftforge.common.config.Config.Name;

@Config(modid = Reference.MOD_ID, category = "Options")
public class ConfigHandler {
    @Name("Sleep Ruby")
    @LangKey("config.rubyfun.sleepruby")
    @Comment({
        "Enable or Disable having a chance of getting ruby's in your sleep"
    })
    public static boolean sleepRuby = true;
}