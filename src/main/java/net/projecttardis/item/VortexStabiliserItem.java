
package net.projecttardis.item;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

public class VortexStabiliserItem extends Item {
	public VortexStabiliserItem() {
		super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
	}
}
