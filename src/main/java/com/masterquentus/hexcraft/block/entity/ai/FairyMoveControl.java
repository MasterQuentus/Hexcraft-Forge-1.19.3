package com.masterquentus.hexcraft.block.entity.ai;

import com.masterquentus.hexcraft.entity.custom.FairyEntity;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class FairyMoveControl extends MoveControl {
    private final FairyEntity fairyEntity;
    private int floatDuration;
    public FairyMoveControl(FairyEntity fairyEntity) {
        super(fairyEntity);
        this.fairyEntity = fairyEntity;
    }

    public void tick() {
        if (this.operation == Operation.MOVE_TO) {
            if (this.floatDuration-- <= 0) {
                this.floatDuration += this.fairyEntity.getRandom().nextInt(5) + 2;
                Vec3 vec3 = new Vec3(this.wantedX - this.fairyEntity.getX(), this.wantedY - this.fairyEntity.getY(), this.wantedZ - this.fairyEntity.getZ());
                double d0 = vec3.length();
                vec3 = vec3.normalize();
                if (this.canReach(vec3, Mth.ceil(d0))) {
                    this.fairyEntity.setDeltaMovement(this.fairyEntity.getDeltaMovement().add(vec3.scale(0.1D)));
                } else {
                    this.operation = Operation.WAIT;
                }
            }

        }
    }

    private boolean canReach(Vec3 pPos, int pLength) {
        AABB aabb = this.fairyEntity.getBoundingBox();

        for(int i = 1; i < pLength; ++i) {
            aabb = aabb.move(pPos);
            if (!this.fairyEntity.level.noCollision(this.fairyEntity, aabb)) {
                return false;
            }
        }

        return true;
    }
}
