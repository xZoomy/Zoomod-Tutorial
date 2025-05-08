package com.zoom.zoomod.item;

import com.zoom.zoomod.Zoomod;
import com.zoom.zoomod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ZOOMOD_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Zoomod.MOD_ID, "zoomod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.zoomod.zoomod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                    }).build());

    public static final ItemGroup ZOOMOD_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Zoomod.MOD_ID, "zoomod_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.zoomod.zoomod_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
                    }).build());

    public static void registerItemGroups() {
        Zoomod.LOGGER.info("Registering item groups for " + Zoomod.MOD_ID);
    }
}
