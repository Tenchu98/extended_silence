
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.tanehu.extendedsilence.init;

import net.tanehu.extendedsilence.enchantment.MagicbaneEnchantment;
import net.tanehu.extendedsilence.ExtendedSilenceMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

public class ExtendedSilenceModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ExtendedSilenceMod.MODID);
	public static final RegistryObject<Enchantment> MAGICBANE = REGISTRY.register("magicbane", () -> new MagicbaneEnchantment());
}
