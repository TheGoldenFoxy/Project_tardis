
package net.projecttardis.item;

import net.projecttardis.init.ProjectTardisModTabs;

import net.minecraft.item.Rarity;
import net.minecraft.item.Item;

public class FlightControllerItem extends Item {
	public FlightControllerItem() {
		super(new Item.Properties().group(ProjectTardisModTabs.TAB_PROJECT_TARDIS).maxStackSize(1).rarity(Rarity.EPIC));
	}
}
