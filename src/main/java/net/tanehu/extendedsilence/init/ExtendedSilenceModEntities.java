
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tanehu.extendedsilence.init;

import net.tanehu.extendedsilence.entity.WithergolemEntity;
import net.tanehu.extendedsilence.entity.VoidWalkerEntity;
import net.tanehu.extendedsilence.entity.GolemEntity;
import net.tanehu.extendedsilence.entity.EndgolemEntity;
import net.tanehu.extendedsilence.entity.DragonGolemEntity;
import net.tanehu.extendedsilence.entity.CelestialravagerEntity;
import net.tanehu.extendedsilence.ExtendedSilenceMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExtendedSilenceModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ExtendedSilenceMod.MODID);
	public static final RegistryObject<EntityType<EndgolemEntity>> ENDGOLEM = register("endgolem",
			EntityType.Builder.<EndgolemEntity>of(EndgolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EndgolemEntity::new).fireImmune().sized(2f, 4f));
	public static final RegistryObject<EntityType<VoidWalkerEntity>> VOID_WALKER = register("void_walker",
			EntityType.Builder.<VoidWalkerEntity>of(VoidWalkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VoidWalkerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GolemEntity>> MYTHRIL_GOLEM = register("mythril_golem",
			EntityType.Builder.<GolemEntity>of(GolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GolemEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WithergolemEntity>> WITHERGOLEM = register("withergolem",
			EntityType.Builder.<WithergolemEntity>of(WithergolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WithergolemEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DragonGolemEntity>> DRAGON_GOLEM = register("dragon_golem",
			EntityType.Builder.<DragonGolemEntity>of(DragonGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DragonGolemEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CelestialravagerEntity>> CELESTIALRAVAGER = register("celestialravager", EntityType.Builder.<CelestialravagerEntity>of(CelestialravagerEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CelestialravagerEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EndgolemEntity.init();
			VoidWalkerEntity.init();
			GolemEntity.init();
			WithergolemEntity.init();
			DragonGolemEntity.init();
			CelestialravagerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ENDGOLEM.get(), EndgolemEntity.createAttributes().build());
		event.put(VOID_WALKER.get(), VoidWalkerEntity.createAttributes().build());
		event.put(MYTHRIL_GOLEM.get(), GolemEntity.createAttributes().build());
		event.put(WITHERGOLEM.get(), WithergolemEntity.createAttributes().build());
		event.put(DRAGON_GOLEM.get(), DragonGolemEntity.createAttributes().build());
		event.put(CELESTIALRAVAGER.get(), CelestialravagerEntity.createAttributes().build());
	}
}
