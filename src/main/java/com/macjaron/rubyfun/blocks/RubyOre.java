package com.macjaron.rubyfun.blocks;

import java.util.Random;

import com.macjaron.rubyfun.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RubyOre extends BlockBase {
    public RubyOre(String name, Material material){
        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(5.5f);
        setResistance(50f);
        setHarvestLevel("pickaxe", 3);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rnd, int fortune){
        return ModItems.RUBY;
    }

    @Override
    public int quantityDropped(Random rnd){
        int randomNumber = rnd.nextInt(20) + 1;
        int goalNumber = rnd.nextInt(20) + 1;
        if (randomNumber == goalNumber){
            return 2;
        } else {
            return 1;
        }
    }
}