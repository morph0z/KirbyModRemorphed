package com.gmail.jamal009a.kirbymodremorphed.item.weapon.client;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.item.weapon.BasicSpearItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class BasicSpearItemRenderer extends GeoItemRenderer<BasicSpearItem> {
    public BasicSpearItemRenderer() {
        super(new BasicSpearItemModel());
    }
}

