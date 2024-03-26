
package net.tanehu.extendedsilence.init;

import net.tanehu.extendedsilence.jei_recipes.ImbuerRecipeCategory;
import net.tanehu.extendedsilence.jei_recipes.ImbuerRecipe;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class ExtendedSilenceModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<ImbuerRecipe> Imbuer_Type = new mezz.jei.api.recipe.RecipeType<>(ImbuerRecipeCategory.UID, ImbuerRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("extended_silence:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new ImbuerRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<ImbuerRecipe> ImbuerRecipes = recipeManager.getAllRecipesFor(ImbuerRecipe.Type.INSTANCE);
		registration.addRecipes(Imbuer_Type, ImbuerRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(ExtendedSilenceModBlocks.DRAGONIMBUER.get().asItem()), Imbuer_Type);
	}
}
