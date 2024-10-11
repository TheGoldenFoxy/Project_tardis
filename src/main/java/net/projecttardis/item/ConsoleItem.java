
package net.projecttardis.item;

import net.minecraft.item.Rarity;
import net.minecraft.item.Item;

public class ConsoleItem extends Item {
	public ConsoleItem() {
		super(new Item.Properties().group(null).maxStackSize(64).rarity(Rarity.COMMON));
	}
}
