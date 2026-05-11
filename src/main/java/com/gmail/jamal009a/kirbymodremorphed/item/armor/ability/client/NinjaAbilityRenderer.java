package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.FighterAbility;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.NinjaAbility;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class NinjaAbilityRenderer extends GeoArmorRenderer<NinjaAbility> {
    public NinjaAbilityRenderer() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(KirbyModRemorphed.MODID, "armor/ability/ninjaability")));
    }
}
