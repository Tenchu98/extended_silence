
package net.tanehu.extendedsilence.block;

import org.checkerframework.checker.units.qual.s;

import net.tanehu.extendedsilence.procedures.SilentCauldronUpdateTickProcedure;
import net.tanehu.extendedsilence.procedures.SilentCauldronOnBlockRightClickedProcedure;
import net.tanehu.extendedsilence.block.entity.SilentCauldronBlockEntity;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.Containers;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class SilentCauldronBlock extends Block implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 3);

	public SilentCauldronBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.GRAVEL).strength(5f, 10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				if (s.getValue(BLOCKSTATE) == 3)
					return 15;
				return 4;
			}
		}.getLightLevel())).noOcclusion().randomTicks().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		if (state.getValue(BLOCKSTATE) == 1) {
			return Shapes.or(box(0, 0, 14, 2, 2, 16), box(14, 0, 14, 16, 2, 16), box(14, 0, 0, 16, 2, 2), box(0, 0, 0, 2, 2, 2), box(0, 2, 0, 16, 4, 16), box(0, 4, 1, 1, 15, 15), box(15, 4, 1, 16, 15, 15), box(1, 4, 0, 15, 15, 1),
					box(1, 4, 15, 15, 15, 16), box(0, 15, 0, 15, 16, 1), box(0, 4, 0, 1, 15, 1), box(15, 15, 0, 16, 16, 15), box(15, 4, 15, 16, 15, 16), box(0, 15, 1, 1, 16, 16), box(0, 4, 15, 1, 15, 16), box(1, 15, 15, 16, 16, 16),
					box(15, 4, 0, 16, 15, 1));
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return Shapes.or(box(0, 0, 14, 2, 2, 16), box(14, 0, 14, 16, 2, 16), box(14, 0, 0, 16, 2, 2), box(0, 0, 0, 2, 2, 2), box(0, 2, 0, 16, 4, 16), box(0, 4, 1, 1, 15, 15), box(15, 4, 1, 16, 15, 15), box(1, 4, 0, 15, 15, 1),
					box(1, 4, 15, 15, 15, 16), box(0, 15, 0, 15, 16, 1), box(0, 4, 0, 1, 15, 1), box(15, 15, 0, 16, 16, 15), box(15, 4, 15, 16, 15, 16), box(0, 15, 1, 1, 16, 16), box(0, 4, 15, 1, 15, 16), box(1, 15, 15, 16, 16, 16),
					box(15, 4, 0, 16, 15, 1), box(1, 5, 1, 15, 15, 15));
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return Shapes.or(box(0, 0, 14, 2, 2, 16), box(14, 0, 14, 16, 2, 16), box(14, 0, 0, 16, 2, 2), box(0, 0, 0, 2, 2, 2), box(0, 2, 0, 16, 4, 16), box(0, 4, 1, 1, 15, 15), box(15, 4, 1, 16, 15, 15), box(1, 4, 0, 15, 15, 1),
					box(1, 4, 15, 15, 15, 16), box(0, 15, 0, 15, 16, 1), box(0, 4, 0, 1, 15, 1), box(15, 15, 0, 16, 16, 15), box(15, 4, 15, 16, 15, 16), box(0, 15, 1, 1, 16, 16), box(0, 4, 15, 1, 15, 16), box(1, 15, 15, 16, 16, 16),
					box(15, 4, 0, 16, 15, 1), box(1, 5, 1, 15, 15, 15));
		}
		return Shapes.join(box(0, 0, 0, 16, 16, 16), box(1, 5, 1, 15, 16, 15), BooleanOp.ONLY_FIRST);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(BLOCKSTATE);
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		SilentCauldronUpdateTickProcedure.execute(world, x, y, z, blockstate);
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		SilentCauldronOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new SilentCauldronBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof SilentCauldronBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof SilentCauldronBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}
