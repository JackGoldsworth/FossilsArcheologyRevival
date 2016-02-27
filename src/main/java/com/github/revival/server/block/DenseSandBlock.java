package com.github.revival.server.block;

import com.github.revival.server.creativetab.FATabRegistry;
import net.minecraft.block.BlockFalling;

public class DenseSandBlock extends BlockFalling {
    public DenseSandBlock() {
        this.setHardness(3.0F);
        this.setResistance(15F);
        this.setBlockTextureName("fossil:dense_sand");
        this.setBlockName("denseSand");
        this.setStepSound(soundTypeSand);
        this.setCreativeTab(FATabRegistry.tabFBlocks);
    }
}