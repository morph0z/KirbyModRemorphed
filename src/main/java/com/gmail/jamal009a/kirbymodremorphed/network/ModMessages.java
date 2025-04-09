package com.gmail.jamal009a.kirbymodremorphed.network;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.network.packet.PrimaryAbilityC2SPacket;
import com.gmail.jamal009a.kirbymodremorphed.network.packet.SecondaryAbilityC2SPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;

public class ModMessages {
    private static SimpleChannel INSTANCE;

    private static int packetId = 0;
    private static int id() {
        return packetId++;
    }

    public static void register() {
        SimpleChannel net = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation(KirbyModRemorphed.MODID, "messages"))
                .networkProtocolVersion(() -> "1.0")
                .clientAcceptedVersions(s -> true)
                .serverAcceptedVersions(s -> true)
                .simpleChannel();

        INSTANCE = net;

        net.messageBuilder(PrimaryAbilityC2SPacket.class, id(), NetworkDirection.PLAY_TO_SERVER)
                .decoder(PrimaryAbilityC2SPacket::new)
                .encoder(PrimaryAbilityC2SPacket::toBytes)
                .consumerMainThread(PrimaryAbilityC2SPacket::handle)
                .add();

        net.messageBuilder(SecondaryAbilityC2SPacket.class, id(), NetworkDirection.PLAY_TO_SERVER)
                .decoder(SecondaryAbilityC2SPacket::new)
                .encoder(SecondaryAbilityC2SPacket::toBytes)
                .consumerMainThread(SecondaryAbilityC2SPacket::handle)
                .add();
    }

    public static <MSG> void sendToServer(MSG message) {
        INSTANCE.sendToServer(message);
    }

    public static <MSG> void sendToPlayer(MSG message, ServerPlayer player) {
        INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), message);
    }
}