
package net.page.creepscrawls.item;

import net.page.creepscrawls.CreepsCrawlsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@CreepsCrawlsModElements.ModElement.Tag
public class MysticRuneItem extends CreepsCrawlsModElements.ModElement {
	@ObjectHolder("creeps_crawls:mystic_rune")
	public static final Item block = null;
	public MysticRuneItem(CreepsCrawlsModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(3).rarity(Rarity.EPIC));
			setRegistryName("mystic_rune");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
