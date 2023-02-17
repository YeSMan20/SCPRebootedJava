
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scpr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.scpr.ScprMod;

public class ScprModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ScprMod.MODID);
	public static final RegistryObject<Item> TEST = REGISTRY.register("test_spawn_egg",
			() -> new ForgeSpawnEggItem(ScprModEntities.TEST, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
