package com.macjaron.rubyfun.items.armor;

import com.macjaron.rubyfun.RubyFun;
import com.macjaron.rubyfun.init.ModItems;
import com.macjaron.rubyfun.util.IHasModel;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel {
    public ArmorBase(String name, ArmorMaterial material, int renderIndexIn, EntityEquipmentSlot equipmentSlot){
        super(material, renderIndexIn, equipmentSlot);
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