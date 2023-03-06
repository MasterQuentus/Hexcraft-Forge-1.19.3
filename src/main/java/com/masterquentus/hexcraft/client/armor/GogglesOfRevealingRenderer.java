package com.masterquentus.hexcraft.client.armor;

import com.masterquentus.hexcraft.item.custom.GoogglesOfRevealingItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class GogglesOfRevealingRenderer extends GeoArmorRenderer<GoogglesOfRevealingItem> {
    public GogglesOfRevealingRenderer() {
        super(new GogglesOfRevealingModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}