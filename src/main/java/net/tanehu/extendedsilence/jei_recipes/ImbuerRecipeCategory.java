
package net.tanehu.extendedsilence.jei_recipes;

import net.tanehu.extendedsilence.init.ExtendedSilenceModJeiPlugin;
import net.tanehu.extendedsilence.init.ExtendedSilenceModBlocks;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class ImbuerRecipeCategory implements IRecipeCategory<ImbuerRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("extended_silence", "imbuer");
	public final static ResourceLocation TEXTURE = new ResourceLocation("extended_silence", "textures/screens/imburer.png");
	private final IDrawable background;
	private final IDrawable icon;

	public ImbuerRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 180, 93);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ExtendedSilenceModBlocks.DRAGONIMBUER.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<ImbuerRecipe> getRecipeType() {
		return ExtendedSilenceModJeiPlugin.Imbuer_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("imbuer");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, ImbuerRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 39, 30).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 125, 30).addItemStack(recipe.getResultItem(null));
	}
}
