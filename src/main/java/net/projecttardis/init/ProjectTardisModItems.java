
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.projecttardis.init;

import net.projecttardis.item.VortexStabiliserItem;
import net.projecttardis.item.TungstenIngotItem;
import net.projecttardis.item.TardisShellItem;
import net.projecttardis.item.SecuritySystemItem;
import net.projecttardis.item.HeartOfTheTardisItem;
import net.projecttardis.item.FlightControllerItem;
import net.projecttardis.item.EyeOfHarmonyItem;
import net.projecttardis.item.ConsoleItem;
import net.projecttardis.ProjectTardisMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.RegistryObject;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;

public class ProjectTardisModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ProjectTardisMod.MODID);
	public static final RegistryObject<Item> TUNGSTENORE = block(ProjectTardisModBlocks.TUNGSTENORE, ProjectTardisModTabs.TAB_PROJECT_TARDIS);
	public static final RegistryObject<Item> TUNGSTEN_INGOT = REGISTRY.register("tungsten_ingot", () -> new TungstenIngotItem());
	public static final RegistryObject<Item> TARDIS_SHELL = REGISTRY.register("tardis_shell", () -> new TardisShellItem());
	public static final RegistryObject<Item> EYE_OF_HARMONY = REGISTRY.register("eye_of_harmony", () -> new EyeOfHarmonyItem());
	public static final RegistryObject<Item> HEART_OF_THE_TARDIS = REGISTRY.register("heart_of_the_tardis", () -> new HeartOfTheTardisItem());
	public static final RegistryObject<Item> FLIGHT_CONTROLLER = REGISTRY.register("flight_controller", () -> new FlightControllerItem());
	public static final RegistryObject<Item> VORTEX_STABILISER = REGISTRY.register("vortex_stabiliser", () -> new VortexStabiliserItem());
	public static final RegistryObject<Item> SECURITY_SYSTEM = REGISTRY.register("security_system", () -> new SecuritySystemItem());
	public static final RegistryObject<Item> CONSOLE = REGISTRY.register("console", () -> new ConsoleItem());
	public static final RegistryObject<Item> NAV_ARRAY = block(ProjectTardisModBlocks.NAV_ARRAY, ProjectTardisModTabs.TAB_PROJECT_TARDIS);
	public static final RegistryObject<Item> SOLAR_CORE = block(ProjectTardisModBlocks.SOLAR_CORE, ProjectTardisModTabs.TAB_PROJECT_TARDIS);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block, ItemGroup tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().group(tab)));
	}
}
