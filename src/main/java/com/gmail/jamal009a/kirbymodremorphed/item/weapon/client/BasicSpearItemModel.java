package com.gmail.jamal009a.kirbymodremorphed.item.weapon.client;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.item.weapon.BasicSpearItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BasicSpearItemModel extends GeoModel<BasicSpearItem> {
    @Override
    public ResourceLocation getModelResource(BasicSpearItem basicSpearItem) {
        return new ResourceLocation(KirbyModRemorphed.MODID,"geo/item/weapon/basic_spear.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BasicSpearItem basicSpearItem) {
        return new ResourceLocation(KirbyModRemorphed.MODID,"textures/item/weapon/basic_spear.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BasicSpearItem basicSpearItem) {
        return new ResourceLocation(KirbyModRemorphed.MODID,"animations/item/weapon/basic_spear.animation.json");
    }
}
