package com.masterquentus.hexcraft.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

import java.util.Collection;

public class TaintedMagicVein extends MultifaceBlock implements SculkBehaviour, SimpleWaterloggedBlock {
    private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public TaintedMagicVein(BlockBehaviour.Properties p_222353_) {
        super(p_222353_);
        this.registerDefaultState(this.defaultBlockState().setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    public static boolean regrow(LevelAccessor p_222364_, BlockPos p_222365_, BlockState p_222366_, Collection<Direction> p_222367_) {
        boolean flag = false;
        BlockState blockstate = Blocks.SCULK_VEIN.defaultBlockState();

        for(Direction direction : p_222367_) {
            BlockPos blockpos = p_222365_.relative(direction);
            if (canAttachTo(p_222364_, direction, blockpos, p_222364_.getBlockState(blockpos))) {
                blockstate = blockstate.setValue(getFaceProperty(direction), Boolean.valueOf(true));
                flag = true;
            }
        }

        if (!flag) {
            return false;
        } else {
            if (!p_222366_.getFluidState().isEmpty()) {
                blockstate = blockstate.setValue(WATERLOGGED, Boolean.valueOf(true));
            }

            p_222364_.setBlock(p_222365_, blockstate, 3);
            return true;
        }
    }

    public void onDischarged(LevelAccessor p_222359_, BlockState p_222360_, BlockPos p_222361_, RandomSource p_222362_) {
        if (p_222360_.is(this)) {
            for(Direction direction : DIRECTIONS) {
                BooleanProperty booleanproperty = getFaceProperty(direction);
                if (p_222360_.getValue(booleanproperty) && p_222359_.getBlockState(p_222361_.relative(direction)).is(Blocks.SCULK)) {
                    p_222360_ = p_222360_.setValue(booleanproperty, Boolean.valueOf(false));
                }
            }

            if (!hasAnyFace(p_222360_)) {
                FluidState fluidstate = p_222359_.getFluidState(p_222361_);
                p_222360_ = (fluidstate.isEmpty() ? Blocks.AIR : Blocks.WATER).defaultBlockState();
            }

            p_222359_.setBlock(p_222361_, p_222360_, 3);
            SculkBehaviour.super.onDischarged(p_222359_, p_222360_, p_222361_, p_222362_);
        }
    }

    @Override
    public int attemptUseCharge(SculkSpreader.ChargeCursor p_222039_, LevelAccessor p_222040_, BlockPos p_222041_, RandomSource p_222042_, SculkSpreader p_222043_, boolean p_222044_) {
        return 0;
    }

    public BlockState updateShape(BlockState p_222384_, Direction p_222385_, BlockState p_222386_, LevelAccessor p_222387_, BlockPos p_222388_, BlockPos p_222389_) {
        if (p_222384_.getValue(WATERLOGGED)) {
            p_222387_.scheduleTick(p_222388_, Fluids.WATER, Fluids.WATER.getTickDelay(p_222387_));
        }

        return super.updateShape(p_222384_, p_222385_, p_222386_, p_222387_, p_222388_, p_222389_);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_222391_) {
        super.createBlockStateDefinition(p_222391_);
        p_222391_.add(WATERLOGGED);
    }

    public boolean canBeReplaced(BlockState p_222381_, BlockPlaceContext p_222382_) {
        return !p_222382_.getItemInHand().is(Items.SCULK_VEIN) || super.canBeReplaced(p_222381_, p_222382_);
    }

    @Override
    public MultifaceSpreader getSpreader() {
        return null;
    }

    public FluidState getFluidState(BlockState p_222394_) {
        return p_222394_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_222394_);
    }
}