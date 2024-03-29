package net.tanehu.extendedsilence.procedures;

import net.tanehu.extendedsilence.init.ExtendedSilenceModItems;
import net.tanehu.extendedsilence.init.ExtendedSilenceModEntities;
import net.tanehu.extendedsilence.init.ExtendedSilenceModBlocks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GolemspawnerOnBlockRightClickedProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ExtendedSilenceModItems.DRAGONSCALE.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ExtendedSilenceModItems.DRAGONSCALE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ExtendedSilenceModEntities.ENDGOLEM.get().spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0.5, 0);
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ExtendedSilenceModBlocks.MYTHRIL_BLOCK.get().asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ExtendedSilenceModBlocks.MYTHRIL_BLOCK.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ExtendedSilenceModEntities.MYTHRIL_GOLEM.get().spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0.5, 0);
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ExtendedSilenceModItems.DRAGONCRYSTAL.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ExtendedSilenceModItems.DRAGONCRYSTAL.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ExtendedSilenceModEntities.DRAGON_GOLEM.get().spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0.5, 0);
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ExtendedSilenceModItems.INFUSEDSTAR.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ExtendedSilenceModItems.INFUSEDSTAR.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ExtendedSilenceModEntities.CELESTIALRAVAGER.get().spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0.5, 0);
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ExtendedSilenceModItems.EBONYCRYSTAL.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ExtendedSilenceModItems.EBONYCRYSTAL.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ExtendedSilenceModEntities.WITHERGOLEM.get().spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0.5, 0);
				}
			}
		}
	}
}
