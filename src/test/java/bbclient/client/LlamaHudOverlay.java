package bbclient.client;

import bbclient.BBClient;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.gui.overlay.IGuiOverlay;

public class LlamaHudOverlay {
    private static final ResourceLocation LLAMA = new ResourceLocation(BBClient.MOD_ID,
            "textures/gui/llama.png");

    public static final IGuiOverlay HUD_LLAMA = ((gui, poseStack, partialTick, screenWidth, screenHeight) -> {
        int x = screenWidth / 2;
        int y = screenHeight;

        RenderSystem.setShader(GameRenderer::getPositionShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, LLAMA);
        for(int i = 0; i < 1; i++) {
                GuiComponent.blit(poseStack,x - 30 + (i * 9),y - 5,0,0,24,24,
                        24,24);
        }
    });
}
