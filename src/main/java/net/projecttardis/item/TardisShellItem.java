
package net.projecttardis.item;

import net.projecttardis.init.ProjectTardisModTabs;

import net.minecraft.item.Rarity;
import net.minecraft.item.Item;

public class TardisShellItem extends Item {
	public TardisShellItem() {
		super(new Item.Properties().group(ProjectTardisModTabs.TAB_PROJECT_TARDIS).maxStackSize(1).rarity(Rarity.EPIC));
	}
}
