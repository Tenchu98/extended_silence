package net.tanehu.extendedsilence.enchantment;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.TridentItem;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.damagesource.DamageSource;

import java.util.Map;
import java.util.UUID;

public class MagicbaneEnchantment extends Enchantment {
    private static final UUID ATTACK_DAMAGE_MODIFIER_UUID = UUID.randomUUID();

    public MagicbaneEnchantment() {
        super(Rarity.RARE, EnchantmentCategory.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
        // Register the event handler
        MinecraftForge.EVENT_BUS.register(this);
    }

    public boolean canApply(ItemStack stack) {
        return stack.getItem() instanceof SwordItem ||
                stack.getItem() instanceof AxeItem ||
                stack.getItem() instanceof TridentItem;
    }

    public int getMinCost(int level) {
        return 10 + 20 * (level - 1);
    }

    public int getMaxCost(int level) {
        return super.getMinCost(level) + 50;
    }

    public int getMaxLevel() {
        return 1;
    }

    public boolean isTreasureOnly() {
        return false;
    }

    public boolean isCursed() {
        return false;
    }

    public boolean isDiscoverable() {
        return false;
    }

    public boolean isTradeable() {
        return false;
    }

    public boolean isAllowedOnBooks() {
        return true;
    }

    @SubscribeEvent
    public void onEnchantmentAdded(AnvilUpdateEvent event) {
        ItemStack left = event.getLeft(); // The item to be enchanted
        ItemStack right = event.getRight(); // The enchantment book

        if (canApply(left) && right.getItem() instanceof EnchantedBookItem) {
            // Check if the book has the Magicbane enchantment
            if (EnchantmentHelper.getEnchantments(right).containsKey(this)) {
                int enchantmentLevel = EnchantmentHelper.getEnchantments(right).get(this);
                addMagicbaneModifier(left, enchantmentLevel);
            }
        }
    }

    public void addMagicbaneModifier(ItemStack stack, int enchantmentLevel) {
        double modifierValue = (2 * enchantmentLevel) + 2; // Replace with your actual calculation

        // Retrieve existing tag or create a new one
        CompoundTag tag = stack.getOrCreateTag();

        // Retrieve existing attribute modifiers or create a new compound tag for them
        CompoundTag modifiersTag = tag.getCompound("AttributeModifiers");

        // Create a compound tag for the new modifier
        CompoundTag newModifierTag = new CompoundTag();
        newModifierTag.putString("AttributeName", "generic.attack_damage");
        newModifierTag.putString("Name", "Magicbane damage");
        newModifierTag.putDouble("Amount", modifierValue);
        newModifierTag.putInt("Operation", 0);
        newModifierTag.putUUID("UUID", ATTACK_DAMAGE_MODIFIER_UUID);

        // Put the new modifier tag into the modifiers compound tag
        modifiersTag.put("magicbane", newModifierTag);

        // Put the modifiers compound tag back into the main tag
        tag.put("AttributeModifiers", modifiersTag);

        // Update the item stack's tag
        stack.setTag(tag);
    }

    private int calculateTotalEnchantmentLevels(ItemStack stack) {
        int totalLevels = 0;
        Map<Enchantment, Integer> enchantments = EnchantmentHelper.getEnchantments(stack);
        for (Map.Entry<Enchantment, Integer> entry : enchantments.entrySet()) {
            Enchantment enchantment = entry.getKey();
            int level = entry.getValue();
            if (enchantment != this) { // Exclude the Magicbane enchantment
                totalLevels += level;
            }
        }
        return totalLevels;
    }

    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        LivingEntity target = event.getEntity(); // The entity receiving damage
        if (target != null) {
            LivingEntity attacker = event.getSource().getEntity() instanceof LivingEntity ? (LivingEntity) event.getSource().getEntity() : null; // The entity causing the damage
            if (attacker != null) {
                ItemStack stack = attacker.getMainHandItem();
                if (stack.isEnchanted()) {
                    addMagicbaneModifier(stack, calculateTotalEnchantmentLevels(stack)); // Update the modifier based on total enchantment levels
                    double modifierValue = calculateTotalEnchantmentLevels(stack); // Calculate the modifier value

                    float newDamage = event.getAmount() + (float) modifierValue; // Add the modifier to the existing damage
                    event.setAmount(newDamage); // Set the new damage amount
                }
            }
        }
    }

    public boolean isBeneficial() {
        return true;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return false;
    }
}
