package com.macjaron.rubyfun.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends BlockBase {

    public RubyBlock(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.METAL); // what kind of sound does this block make?
        setHardness(5.5f); // how hard is it to mine this block? (https://tinyurl.com/y7lfodta)
        setResistance(50f); // how much blast resistance does this block have? (https://tinyurl.com/y789np2d)
        setHarvestLevel("pickaxe", 3); // with what do you mine it and what material do you need (pickaxe, spade/shovel, sword, axe) (https://tinyurl.com/y8fcfa3o)
        //setLightLevel(0f); // how much light does it emit? (https://tinyurl.com/y9b4l2fp)
        //setLightOpacity(0); how much light can pass trough?
        //setBlockUnbreakable(); is the block unbreakable?
    }
    
}