
package net.tanehu.extendedsilence.item;

import net.tanehu.extendedsilence.init.ExtendedSilenceModFluids;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;
import net.minecraft.network.chat.Component;

import java.util.List;

public class DragonessenceItem extends BucketItem {
	public DragonessenceItem() {
		super(ExtendedSilenceModFluids.DRAGONESSENCE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
