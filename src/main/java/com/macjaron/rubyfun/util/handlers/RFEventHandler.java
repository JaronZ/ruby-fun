package com.macjaron.rubyfun.util.handlers;

import com.macjaron.rubyfun.init.ModItems;
import com.macjaron.rubyfun.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.items.ItemHandlerHelper;

public class RFEventHandler {
    @SubscribeEvent
    public void onEntityEndSleep(PlayerWakeUpEvent event){
        final Entity entity = event.getEntity();
        final World world = entity.world;
        if (entity == null){
            System.err.println("Can't load entity");
            return;
        }
        if (ConfigHandler.sleepRuby && Math.floor(Math.random() * 100) == 66){
            if (entity instanceof EntityPlayer){
                ItemHandlerHelper.giveItemToPlayer((EntityPlayer)entity, new ItemStack(ModItems.RUBY, 1));
                final MinecraftServer mcserver = FMLCommonHandler.instance().getMinecraftServerInstance();
                if (mcserver != null){
                    if (world.isRemote){
                        return;
                    }
                    mcserver.getPlayerList().sendMessage((ITextComponent)new TextComponentString(TextFormatting.DARK_BLUE + entity.getName().toString() + TextFormatting.RESET + " has gotten a free " + TextFormatting.DARK_RED + "Ruby" + TextFormatting.RESET + "!"));
                }
            }
        }
    }

    @SubscribeEvent
    public void onConfigChanged(OnConfigChangedEvent event){
        if (event.getModID().equals(Reference.MOD_ID)) ConfigManager.sync(Reference.MOD_ID, Config.Type.INSTANCE);
    }
}