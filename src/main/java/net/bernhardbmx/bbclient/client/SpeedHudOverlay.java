package net.bernhardbmx.bbclient.client;

import com.mojang.blaze3d.systems.RenderSystem;
import net.bernhardbmx.bbclient.BBClient;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.gui.overlay.IGuiOverlay;

public class SpeedHudOverlay {
    private static final ResourceLocation SPEEDOMETER_0 = new ResourceLocation(BBClient.MOD_ID,
        "textures/gui/speedometer/speedometer_0.png");
    private static final ResourceLocation SPEEDOMETER_1 = new ResourceLocation(BBClient.MOD_ID,
            "textures/gui/speedometer/speedometer_1.png");
    private static final ResourceLocation SPEEDOMETER_2 = new ResourceLocation(BBClient.MOD_ID,
            "textures/gui/speedometer/speedometer_2.png");

    public static final IGuiOverlay HUD_SPEEDOMETER = ((gui, poseStack, partialTick, screenWidth, screenHeight) -> {
        int x = screenWidth / 2;
        int y = screenHeight;

        RenderSystem.setShader(GameRenderer::getPositionShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

        RenderSystem.setShaderTexture(0, SPEEDOMETER_0);
        for(int i = 0; i < 1; i++) {
            if(ClientSpeedData.getPlayerSpeed() == 0) {
            GuiComponent.blit(poseStack,x - 94 + (i * 9),y - 54,0,0,17,17,
                    17,17);
        } else {
            break;
        }
        }

        RenderSystem.setShaderTexture(0, SPEEDOMETER_1);
        for(int i = 0; i < 1; i++) {
            if(ClientSpeedData.getPlayerSpeed() > 0) {
                GuiComponent.blit(poseStack,x - 94 + (i * 9),y - 54,0,0,17,17,
                        17,17);
            } else {
                break;
            }
        }

        // max speed 5.612
    });
}
