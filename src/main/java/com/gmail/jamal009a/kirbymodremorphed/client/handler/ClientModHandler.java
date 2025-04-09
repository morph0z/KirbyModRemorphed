package com.gmail.jamal009a.kirbymodremorphed.client.handler;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.client.ModKeybindings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = KirbyModRemorphed.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModHandler {
    @SubscribeEvent
//    public static void clientSetup(FMLClientSetupEvent event){
//        event.enqueueWork(() -> {
//
//        })
//    }
    public static void registerKeys(RegisterKeyMappingsEvent event){
        event.register(ModKeybindings.INSTANCE.primaryAbilityUse);
        event.register(ModKeybindings.INSTANCE.secondaryAbilityUse);
    }
}

