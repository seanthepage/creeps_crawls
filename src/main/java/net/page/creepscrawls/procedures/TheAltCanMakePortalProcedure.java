package net.page.creepscrawls.procedures;

import net.page.creepscrawls.CreepsCrawlsModElements;
import net.page.creepscrawls.CreepsCrawlsMod;

import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;

import java.util.Map;

@CreepsCrawlsModElements.ModElement.Tag
public class TheAltCanMakePortalProcedure extends CreepsCrawlsModElements.ModElement {
	public TheAltCanMakePortalProcedure(CreepsCrawlsModElements instance) {
		super(instance, 9);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CreepsCrawlsMod.LOGGER.warn("Failed to load dependency x for procedure TheAltCanMakePortal!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CreepsCrawlsMod.LOGGER.warn("Failed to load dependency y for procedure TheAltCanMakePortal!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CreepsCrawlsMod.LOGGER.warn("Failed to load dependency z for procedure TheAltCanMakePortal!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CreepsCrawlsMod.LOGGER.warn("Failed to load dependency world for procedure TheAltCanMakePortal!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		return (world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
				&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("creeps_crawls:charred_forest")));
	}
}
