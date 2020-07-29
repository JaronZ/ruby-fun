package com.macjaron.rubyfun.items.tools;

import com.macjaron.rubyfun.RubyFun;
import com.macjaron.rubyfun.init.ModItems;
import com.macjaron.rubyfun.util.IHasModel;

import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{
    public ToolSword(String name, ToolMaterial material){
        super(material);
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