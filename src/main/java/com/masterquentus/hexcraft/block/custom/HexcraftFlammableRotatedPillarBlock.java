package com.masterquentus.hexcraft.block.custom;

import com.masterquentus.hexcraft.block.HexcraftBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class HexcraftFlammableRotatedPillarBlock extends RotatedPillarBlock {
    public HexcraftFlammableRotatedPillarBlock(Properties properties) {

        super(properties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {
            if(state.is(HexcraftBlocks.EBONY_LOG.get())) {
                return HexcraftBlocks.STRIPPED_EBONY_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(HexcraftBlocks.EBONY_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_EBONY_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.BLOOD_OAK_LOG.get())) {
                return HexcraftBlocks.STRIPPED_BLOOD_OAK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.BLOOD_OAK_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_BLOOD_OAK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.HELL_BARK_LOG.get())) {
                return HexcraftBlocks.STRIPPED_HELL_BARK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.HELL_BARK_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_HELL_BARK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.WHITE_OAK_LOG.get())) {
                return HexcraftBlocks.STRIPPED_WHITE_OAK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.WHITE_OAK_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_WHITE_OAK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.ALDER_LOG.get())) {
                return HexcraftBlocks.STRIPPED_ALDER_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.ALDER_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_ALDER_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.WITCH_HAZEL_LOG.get())) {
                return HexcraftBlocks.STRIPPED_WITCH_HAZEL_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.WITCH_HAZEL_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_WITCH_HAZEL_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.WILLOW_LOG.get())) {
                return HexcraftBlocks.STRIPPED_WILLOW_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.WILLOW_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_WILLOW_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.HAWTHORN_LOG.get())) {
                return HexcraftBlocks.STRIPPED_HAWTHORN_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.HAWTHORN_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_HAWTHORN_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.CEDAR_LOG.get())) {
                return HexcraftBlocks.STRIPPED_CEDAR_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.CEDAR_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_CEDAR_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.DISTORTED_LOG.get())) {
                return HexcraftBlocks.STRIPPED_DISTORTED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.DISTORTED_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_DISTORTED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.ELDER_LOG.get())) {
                return HexcraftBlocks.STRIPPED_ELDER_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.ELDER_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_ELDER_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.JUNIPER_LOG.get())) {
                return HexcraftBlocks.STRIPPED_JUNIPER_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.JUNIPER_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_JUNIPER_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.ROWAN_LOG.get())) {
                return HexcraftBlocks.STRIPPED_ROWAN_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.ROWAN_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_ROWAN_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.TWISTED_LOG.get())) {
                return HexcraftBlocks.STRIPPED_TWISTED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.TWISTED_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_TWISTED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.WITCH_WOOD_LOG.get())) {
                return HexcraftBlocks.STRIPPED_WITCH_WOOD_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.WITCH_WOOD_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_WITCH_WOOD_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.ECHO_WOOD_LOG.get())) {
                return HexcraftBlocks.STRIPPED_ECHO_WOOD_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.ECHO_WOOD_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_ECHO_WOOD_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}