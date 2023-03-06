package com.masterquentus.hexcraft.client.armor;

import com.masterquentus.hexcraft.item.custom.WitchesArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WitchesArmorRenderer extends GeoArmorRenderer<WitchesArmorItem> {
    public WitchesArmorRenderer() {
        super(new WitchesArmorModel());

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