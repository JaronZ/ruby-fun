package com.macjaron.rubyfun.init;

import java.util.List;

import com.macjaron.rubyfun.items.ItemBase;
import com.macjaron.rubyfun.items.armor.ArmorBase;
import com.macjaron.rubyfun.items.tools.ToolAxe;
import com.macjaron.rubyfun.items.tools.ToolHoe;
import com.macjaron.rubyfun.items.tools.ToolPickaxe;
import com.macjaron.rubyfun.items.tools.ToolSpade;
import com.macjaron.rubyfun.items.tools.ToolSword;
import com.macjaron.rubyfun.util.Reference;

import java.util.ArrayList;

import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.creativetab.CreativeTabs;

public class ModItems 
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    // Creative tabs
    public static final CreativeTabs RUBY_FUN = (new CreativeTabs("RUBY_FUN"){
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(RUBY);
        }
    });

    // Materials
    public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 4, 100000, 12f, 7.5f, 6);
    public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 17, new int[] {13 /* Boots */, 15 /* Leggings */, 16 /* Chestplate */, 11 /* Helmet */}, 6, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.6f);

    // Items
    public static final Item RUBY = new ItemBase("ruby");

    // Tools
    public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
    public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
    public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY, 11.5f, 1.2f);
    public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
    public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);

    // Armor
    public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
    public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
    public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
    public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);

    // Food
    // none for now

    // ItemStack for repair
    public static ItemStack stack = new ItemStack(RUBY);
    
    // Functions
    public static void init(){
        // set repair items
        MATERIAL_RUBY.setRepairItem(new ItemStack(RUBY));
        ARMOR_MATERIAL_RUBY.setRepairItem(new ItemStack(RUBY));
    }
}