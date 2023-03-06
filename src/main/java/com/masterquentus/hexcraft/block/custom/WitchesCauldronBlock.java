package com.masterquentus.hexcraft.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WitchesCauldronBlock extends Block {

    private static final VoxelShape SHAPE = makeShape();
    public WitchesCauldronBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext ctx) {
        return SHAPE;

    }

    public static VoxelShape makeShape(){
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0.9375, 0.40625, 0.015625, 1, 0.53125, 0.9781249999999999), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.984375, 0.53125, 0.015625, 1.046875, 0.5375, 1.028125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.03125, 0.53125, -0.046875, 0.03125, 0.5375, 1.028125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.53125, -0.046875, 1.04375, 0.5375, 0.015625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.53125, 0.96875, 1, 0.5375, 1.03125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.046875, 0, -0.015625, 0.984375, 0.40625, 0.046875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.03125, 0, 0.96875, 0.96875, 0.40625, 1.03125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.953125, 0, 0.0625, 1.015625, 0.40625, 0.9375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.03125, 0, 0.0625, 0.03125, 0.40625, 0.9375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.015625, 0, 0.03125, 0.984375, 0.0625, 0.96875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.90625, 0.0625, 0.015625, 0.9625, 0.4375, 0.071875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.03125, 0, 0.9375, 0.03125, 0.4125, 1.025), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.96875, 0, 0.9375, 1.025, 0.4125, 1.025), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.40625, 0.015625, 0.0625, 0.53125, 0.9781249999999999), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.015625, 0.40625, 0.015625, 0.9781249999999999, 0.53125, 0.078125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.015625, 0.40625, 0.921875, 0.9781249999999999, 0.53125, 0.984375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.96875, 0, -0.015625, 1.025, 0.4125, 0.078125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.03125, 0, -0.015625, 0.056249999999999994, 0.4125, 0.07187499999999991), BooleanOp.OR);

        return shape;
    }
}
