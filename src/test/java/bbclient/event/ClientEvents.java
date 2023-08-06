package bbclient.event;

import bbclient.BBClient;
import bbclient.client.LlamaHudOverlay;
import bbclient.client.SpeedHudOverlay;
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
        }
    }
}
