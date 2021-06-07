
package net.page.creepscrawls.item;

import net.page.creepscrawls.CreepsCrawlsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@CreepsCrawlsModElements.ModElement.Tag
public class MysticSwordItem extends CreepsCrawlsModElements.ModElement {
	@ObjectHolder("creeps_crawls:mystic_sword")
	public static final Item block = null;
	public MysticSwordItem(CreepsCrawlsModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 6280;
			}

			public float getEfficiency() {
				return 24f;
			}

			public float getAttackDamage() {
				return 18f;
			}

			public int getHarvestLevel() {
				return 20;
			}

			public int getEnchantability() {
				return 140;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MysticRuneItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("mystic_sword"));
	}
}
