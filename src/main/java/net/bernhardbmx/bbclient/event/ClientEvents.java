package net.bernhardbmx.bbclient.event;

import net.bernhardbmx.bbclient.BBClient;
import net.bernhardbmx.bbclient.client.FishOffhandHudOverlay;
import net.bernhardbmx.bbclient.client.LlamaHudOverlay;
import net.bernhardbmx.bbclient.client.SpeedHudOverlay;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = BBClient.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void registerGuiOverlays(RegisterGuiOverlaysEvent event) {
            event.registerAboveAll("speedometer", SpeedHudOverlay.HUD_SPEEDOMETER);
            event.registerAboveAll("llama", LlamaHudOverlay.HUD_LLAMA);
            event.registerAboveAll("fish_offhand", FishOffhandHudOverlay.HUD_FISH_OFFHAND);
        }
    }
}
