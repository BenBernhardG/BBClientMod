package net.bernhardbmx.bbclient.client;

import com.mojang.blaze3d.systems.RenderSystem;
import net.bernhardbmx.bbclient.BBClient;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.gui.overlay.IGuiOverlay;

public class FishOffhandHudOverlay {
    private static final ResourceLocation FISH_OFFHAND = new ResourceLocation(BBClient.MOD_ID,
            "textures/gui/fish_offhand.png");

    public static final IGuiOverlay HUD_FISH_OFFHAND = ((gui, poseStack, partialTick, screenWidth, screenHeight) -> {
        int x = screenWidth / 2;
        int y = screenHeight;

        RenderSystem.setShader(GameRenderer::getPositionShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, FISH_OFFHAND);
        for(int i = 0; i < 1; i++) {
            GuiComponent.blit(poseStack,x - 150 + (i * 9),y - 22,0,0,22,22,
                    22,22);
        }
    });
}
