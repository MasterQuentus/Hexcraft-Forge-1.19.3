package com.masterquentus.hexcraft.block.custom.crates;

import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.entity.custom.crate.CrateCedarBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.phys.BlockHitResult;

import java.util.List;

public class CrateCedarBlock extends Block implements EntityBlock {

    public static final ResourceLocation CONTENTS = new ResourceLocation("contents");

    public CrateCedarBlock() {
        super(Properties.of(Material.STONE).sound(SoundType.WOOD).strength(2.5f, 12.5f).requiresCorrectToolForDrops());
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 15;
    }

    @Override
    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
            return tieredItem.getTier().getLevel() >= 0;
        return false;
    }

    @Override
    public List<ItemStack> getDrops(BlockState p_56246_, LootContext.Builder p_56247_) {
        BlockEntity blockentity = p_56247_.getOptionalParameter(LootContextParams.BLOCK_ENTITY);
        if (blockentity instanceof CrateCedarBlockEntity shulkerboxblockentity) {
            p_56247_ = p_56247_.withDynamicDrop(CONTENTS, (p_56218_, p_56219_) -> {
                for(int i = 0; i < shulkerboxblockentity.getContainerSize(); ++i) {
                    p_56219_.accept(shulkerboxblockentity.getItem(i));
                }
            });
        }

        return super.getDrops(p_56246_, p_56247_);
    }

    @Override
    public void setPlacedBy(Level p_56206_, BlockPos p_56207_, BlockState p_56208_, LivingEntity p_56209_, ItemStack p_56210_) {
        if (p_56210_.hasCustomHoverName()) {
            BlockEntity blockentity = p_56206_.getBlockEntity(p_56207_);
            if (blockentity instanceof ShulkerBoxBlockEntity) {
                ((ShulkerBoxBlockEntity)blockentity).setCustomName(p_56210_.getHoverName());
            }
        }
    }

    @Override
    public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
        if (world.isClientSide) {
            return InteractionResult.SUCCESS;
        } else if (entity.isSpectator()) {
            return InteractionResult.CONSUME;
        } else {
            BlockEntity blockentity = world.getBlockEntity(pos);
            if (blockentity instanceof CrateCedarBlockEntity) {
                CrateCedarBlockEntity shulkerboxblockentity = (CrateCedarBlockEntity)blockentity;
//                if (canOpen(blockstate, world, pos, shulkerboxblockentity)) {
                entity.openMenu(shulkerboxblockentity);
                entity.awardStat(Stats.OPEN_SHULKER_BOX);
                PiglinAi.angerNearbyPiglins(entity, true);
//                }

                return InteractionResult.CONSUME;
            } else {
                return InteractionResult.PASS;
            }
        }
    }

    @Override
    public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
        BlockEntity tileEntity = worldIn.getBlockEntity(pos);
        return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new CrateCedarBlockEntity(pos, state);
    }

    @Override
    public ItemStack getCloneItemStack(BlockGetter p_56202_, BlockPos p_56203_, BlockState p_56204_) {
        ItemStack itemstack = super.getCloneItemStack(p_56202_, p_56203_, p_56204_);
        p_56202_.getBlockEntity(p_56203_, BlockEntityType.SHULKER_BOX).ifPresent((p_187446_) -> {
            p_187446_.saveToItem(itemstack);
        });
        return itemstack;
    }

    @Override
    public void playerWillDestroy(Level p_49852_, BlockPos p_49853_, BlockState p_49854_, Player p_49855_) {
        BlockEntity blockentity = p_49852_.getBlockEntity(p_49853_);
        if (blockentity instanceof CrateCedarBlockEntity shulkerboxblockentity) {
            if (!p_49852_.isClientSide && p_49855_.isCreative() && !shulkerboxblockentity.isEmpty()) {
                ItemStack itemstack = new ItemStack(HexcraftBlocks.CRATE_CEDAR.get());
                blockentity.saveToItem(itemstack);
                if (shulkerboxblockentity.hasCustomName()) {
                    itemstack.setHoverName(shulkerboxblockentity.getCustomName());
                }

                ItemEntity itementity = new ItemEntity(p_49852_, (double)p_49853_.getX() + 0.5D, (double)p_49853_.getY() + 0.5D, (double)p_49853_.getZ() + 0.5D, itemstack);
                itementity.setDefaultPickUpDelay();
                p_49852_.addFreshEntity(itementity);
            } else {
                shulkerboxblockentity.unpackLootTable(p_49855_);
            }
        }

        super.playerWillDestroy(p_49852_, p_49853_, p_49854_, p_49855_);
    }

    @Override
    public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
        super.triggerEvent(state, world, pos, eventID, eventParam);
        BlockEntity blockEntity = world.getBlockEntity(pos);
        return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
    }

    @Override
    public void onRemove(BlockState p_56234_, Level p_56235_, BlockPos p_56236_, BlockState p_56237_, boolean p_56238_) {
        if (!p_56234_.is(p_56237_.getBlock())) {
            BlockEntity blockentity = p_56235_.getBlockEntity(p_56236_);
            if (blockentity instanceof CrateCedarBlockEntity) {
                p_56235_.updateNeighbourForOutputSignal(p_56236_, p_56234_.getBlock());
            }

            super.onRemove(p_56234_, p_56235_, p_56236_, p_56237_, p_56238_);
        }
    }

    @Override
    public boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }

    @Override
    public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
        BlockEntity tileentity = world.getBlockEntity(pos);
        if (tileentity instanceof CrateCedarBlockEntity be)
            return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
        else
            return 0;
    }

}