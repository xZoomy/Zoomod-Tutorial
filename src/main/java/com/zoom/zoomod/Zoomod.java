package com.zoom.zoomod;

import com.zoom.zoomod.block.ModBlocks;
import com.zoom.zoomod.item.ModItemGroups;
import com.zoom.zoomod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Updated 1.21.3 : Fuel, Attack, Block, Model, Recipe, Effect, Item, Hammer, Tool, Armor, Food, Trim

public class Zoomod implements ModInitializer {
	public static final String MOD_ID = "zoomod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}