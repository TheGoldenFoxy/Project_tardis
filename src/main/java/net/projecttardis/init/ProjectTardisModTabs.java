/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.projecttardis.init;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

public class ProjectTardisModTabs {
	public static ItemGroup TAB_PROJECT_TARDIS;

	public static void load() {
		TAB_PROJECT_TARDIS = new ItemGroup("tab_project_tardis") {
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ProjectTardisModItems.SECURITY_SYSTEM.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
