
package net.projecttardis.item;

import net.projecttardis.init.ProjectTardisModTabs;

import net.minecraft.item.Rarity;
import net.minecraft.item.Item;

public class HeartOfTheTardisItem extends Item {
	public HeartOfTheTardisItem() {
		super(new Item.Properties().group(ProjectTardisModTabs.TAB_PROJECT_TARDIS).maxStackSize(64).rarity(Rarity.COMMON));
	}
}
