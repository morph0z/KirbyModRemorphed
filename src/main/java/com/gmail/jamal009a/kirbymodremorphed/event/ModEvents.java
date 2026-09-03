package com.gmail.jamal009a.kirbymodremorphed.event;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.entity.ModEntities;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.KirbyEntity;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.WaddleDeeEntity;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.JambelieverEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = KirbyModRemorphed.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.KIRBY.get(), KirbyEntity.setAttributes());
        event.put(ModEntities.WADDLE_DEE.get(), WaddleDeeEntity.setAttributes());

        event.put(ModEntities.JAMBELIEVER.get(), JambelieverEntity.setAttributes());
    }
}