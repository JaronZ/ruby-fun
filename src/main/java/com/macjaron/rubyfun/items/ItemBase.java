package com.macjaron.rubyfun.items;

import com.macjaron.rubyfun.RubyFun;
import com.macjaron.rubyfun.init.ModItems;
import com.macjaron.rubyfun.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModItems.RUBY_FUN);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        RubyFun.proxy.registerItemRenderer(this, 0, "inventory");
    }
}