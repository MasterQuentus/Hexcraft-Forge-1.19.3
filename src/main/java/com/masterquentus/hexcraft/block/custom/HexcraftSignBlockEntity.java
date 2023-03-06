package com.masterquentus.hexcraft.block.custom;

import com.masterquentus.hexcraft.block.entity.HexcraftBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class HexcraftSignBlockEntity extends SignBlockEntity {
    public HexcraftSignBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(pWorldPosition, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return HexcraftBlockEntities.SIGN_BLOCK_ENTITIES.get();
    }
}
