package com.macjaron.rubyfun.items.food;

import com.macjaron.rubyfun.RubyFun;
import com.macjaron.rubyfun.init.ModItems;
import com.macjaron.rubyfun.util.IHasModel;

import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel {
    public FoodBase(String name, int amount, float saturation, boolean isWolfFood, boolean alwaysEdible){
        super(amount, saturation, isWolfFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModItems.RUBY_FUN);
        if (alwaysEdible){
            setAlwaysEdible(); // can eat even if hunger is full
        }

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        RubyFun.proxy.registerItemRenderer(this, 0, "inventory");
    }
}