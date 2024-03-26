package net.tanehu.extendedsilence.client.gui;

import net.tanehu.extendedsilence.world.inventory.DragonimbuerguiMenu;
import net.tanehu.extendedsilence.procedures.Fluidguiprogress1Procedure;
import net.tanehu.extendedsilence.procedures.FluidGuiProgress2Procedure;
import net.tanehu.extendedsilence.procedures.FluidGUIProgress5Procedure;
import net.tanehu.extendedsilence.procedures.FluidGUIProgress4Procedure;
import net.tanehu.extendedsilence.procedures.FluidGUIProgress3Procedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DragonimbuerguiScreen extends AbstractContainerScreen<DragonimbuerguiMenu> {
	private final static HashMap<String, Object> guistate = DragonimbuerguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public DragonimbuerguiScreen(DragonimbuerguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 182;
		this.imageHeight = 182;
	}

	private static final ResourceLocation texture = new ResourceLocation("extended_silence:textures/screens/dragonimbuergui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("extended_silence:textures/screens/tank_background.png"), this.leftPos + 6, this.topPos + 29, 0, 0, 25, 50, 25, 50);

		if (Fluidguiprogress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("extended_silence:textures/screens/tank_bar_1.png"), this.leftPos + 15, this.topPos + 67, 0, 0, 8, 6, 8, 6);
		}
		if (FluidGuiProgress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("extended_silence:textures/screens/tank_bar_2.png"), this.leftPos + 15, this.topPos + 60, 0, 0, 8, 13, 8, 13);
		}
		if (FluidGUIProgress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("extended_silence:textures/screens/tank_bar_3.png"), this.leftPos + 15, this.topPos + 54, 0, 0, 8, 19, 8, 19);
		}
		if (FluidGUIProgress4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("extended_silence:textures/screens/tank_bar_4.png"), this.leftPos + 15, this.topPos + 47, 0, 0, 8, 26, 8, 26);
		}
		if (FluidGUIProgress5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("extended_silence:textures/screens/tank_bar_5.png"), this.leftPos + 15, this.topPos + 41, 0, 0, 8, 32, 8, 32);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
