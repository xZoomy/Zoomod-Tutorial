package com.zoom.zoomod.item;

import com.zoom.zoomod.Zoomod;
import com.zoom.zoomod.item.custom.ChiselItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    // ITEMS
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Zoomod.MOD_ID, "pink_garnet")))));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Zoomod.MOD_ID, "raw_pink_garnet")))));

    // STUFF
    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Zoomod.MOD_ID, "chisel")))));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Zoomod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Zoomod.LOGGER.info("Registering mod items for " + Zoomod.MOD_ID);
    }

}
