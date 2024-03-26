
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.tanehu.extendedsilence.init;

import net.tanehu.extendedsilence.world.inventory.DragonimbuerguiMenu;
import net.tanehu.extendedsilence.ExtendedSilenceMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class ExtendedSilenceModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ExtendedSilenceMod.MODID);
	public static final RegistryObject<MenuType<DragonimbuerguiMenu>> DRAGONIMBUERGUI = REGISTRY.register("dragonimbuergui", () -> IForgeMenuType.create(DragonimbuerguiMenu::new));
}
