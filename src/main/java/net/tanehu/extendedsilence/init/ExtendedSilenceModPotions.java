
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tanehu.extendedsilence.init;

import net.tanehu.extendedsilence.ExtendedSilenceMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class ExtendedSilenceModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ExtendedSilenceMod.MODID);
	public static final RegistryObject<Potion> DRAGONPOTION = REGISTRY.register("dragonpotion", () -> new Potion(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 0, false, true),
			new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 0, false, true), new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3600, 0, false, true)));
}
