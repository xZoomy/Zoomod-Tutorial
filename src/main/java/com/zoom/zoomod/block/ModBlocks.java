package com.zoom.zoomod.block;

import com.zoom.zoomod.Zoomod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // strength(hardness, resitance) = time, explosion
    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK));

    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            AbstractBlock.Settings.create().strength(5f).requiresTool());

    public static final Block PINK_GARNET_ORE = registerBlock("pink_garnet_ore",
            ExperienceDroppingBlock.Settings.create().strength(3f).requiresTool());

    public static final Block PINK_GARNET_DEEPSLATE_ORE = registerBlock("pink_garnet_deepslate_ore",
            ExperienceDroppingBlock.Settings.create().strength(4.5f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)); // TODO: verifier si l'exp drop bien

    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Zoomod.MOD_ID, name));
        Block block = new Block(blockSettings.registryKey(key));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static void registerBlockItem(String name, Block block){
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Zoomod.MOD_ID, name)); // Text.translatable(name).toString()
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));
        Registry.register(Registries.ITEM, key, item);
    }
    public static void registerModBlocks(){
        Zoomod.LOGGER.info("Registering mod blocks for " + Zoomod.MOD_ID);
    }
}
