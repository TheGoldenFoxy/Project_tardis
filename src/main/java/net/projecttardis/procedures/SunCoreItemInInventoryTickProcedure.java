package net.projecttardis.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

public class SunCoreItemInInventoryTickProcedure {
	public static void execute(IWorld world, Entity entity) {
		if (entity == null)
			return;
		entity.attackEntityFrom(DamageSource.IN_FIRE, 5);
	}
}
