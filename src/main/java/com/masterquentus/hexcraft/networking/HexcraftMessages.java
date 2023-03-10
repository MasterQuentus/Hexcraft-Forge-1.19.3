package com.masterquentus.hexcraft.networking;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.networking.packet.DrinkBloodC2SPacket;
import com.masterquentus.hexcraft.networking.packet.ThirstDataSyncS2CPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;

public class HexcraftMessages {
    private static SimpleChannel INSTANCE;

    private static int packetId = 0;
    private static int id() {
        return packetId++;
    }

    public static void register () {
        SimpleChannel net = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation(Hexcraft.MOD_ID, "messages"))
                .networkProtocolVersion(() -> "1.0")
                .clientAcceptedVersions(s -> true)
                .serverAcceptedVersions(s -> true)
                .simpleChannel();

        INSTANCE = net;

        net.messageBuilder(DrinkBloodC2SPacket.class, id(), NetworkDirection.PLAY_TO_SERVER)
                .decoder(DrinkBloodC2SPacket::new)
                .encoder(DrinkBloodC2SPacket::toBytes)
                .consumerMainThread(DrinkBloodC2SPacket::handle)
                .add();

        net.messageBuilder(ThirstDataSyncS2CPacket.class, id(), NetworkDirection.PLAY_TO_CLIENT)
                .decoder(ThirstDataSyncS2CPacket::new)
                .encoder(ThirstDataSyncS2CPacket::toBytes)
                .consumerMainThread(ThirstDataSyncS2CPacket::handle)
                .add();

    }

    public static <MSG> void sendToServer(MSG message) {
        INSTANCE.sendToServer(message);
    }

    public static <MSG> void sendToPlayer(MSG message, ServerPlayer player) {
        INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), message);
    }

}
