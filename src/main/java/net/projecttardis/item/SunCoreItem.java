
package net.projecttardis.item;

import net.projecttardis.procedures.SunCoreItemInInventoryTickProcedure;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;

public class SunCoreItem extends Item {
	public SunCoreItem() {
		super(new Item.Properties().group(null).maxStackSize(1).rarity(Rarity.RARE));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		SunCoreItemInInventoryTickProcedure.execute(world, entity);
	}
}
