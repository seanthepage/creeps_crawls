package net.page.creepscrawls.procedures;

import net.page.creepscrawls.CreepsCrawlsModElements;
import net.page.creepscrawls.CreepsCrawlsMod;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;

import java.util.Map;

@CreepsCrawlsModElements.ModElement.Tag
public class TheAltCanTravelThroughPortalProcedure extends CreepsCrawlsModElements.ModElement {
	public TheAltCanTravelThroughPortalProcedure(CreepsCrawlsModElements instance) {
		super(instance, 10);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CreepsCrawlsMod.LOGGER.warn("Failed to load dependency world for procedure TheAltCanTravelThroughPortal!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		return (!((world instanceof World) ? ((World) world).isDaytime() : false));
	}
}
