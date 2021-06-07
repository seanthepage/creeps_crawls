package net.page.creepscrawls.procedures;

import net.page.creepscrawls.CreepsCrawlsModElements;
import net.page.creepscrawls.CreepsCrawlsMod;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@CreepsCrawlsModElements.ModElement.Tag
public class AltChargeLivingEntityIsHitWithItemProcedure extends CreepsCrawlsModElements.ModElement {
	public AltChargeLivingEntityIsHitWithItemProcedure(CreepsCrawlsModElements instance) {
		super(instance, 20);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CreepsCrawlsMod.LOGGER.warn("Failed to load dependency entity for procedure AltChargeLivingEntityIsHitWithItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 60, (int) 1));
	}
}
