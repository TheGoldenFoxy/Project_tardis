
package net.projecttardis.item;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

public class SteelNuggetItem extends Item {
	public SteelNuggetItem() {
		super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
	}
}
