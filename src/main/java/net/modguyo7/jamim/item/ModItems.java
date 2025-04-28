package net.modguyo7.jamim.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.modguyo7.jamim.JAMIM;
import net.modguyo7.jamim.materials.*;

public class ModItems {

    public static Item COPPER_SWORD = null;
    public static Item COPPER_PICKAXE = null;
    public static Item COPPER_AXE = null;
    public static Item COPPER_SHOVEL = null;
    public static Item COPPER_HOE = null;

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(JAMIM.MOD_ID, name), item);
    }

    public static void registerModItems() {
        JAMIM.LOGGER.info("Registering items for " + JAMIM.MOD_ID);
        int itemsRegistered = 0;
        COPPER_SWORD = registerItem("copper_sword", new SwordItem(CopperMaterial.INSTANCE, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(COPPER_SWORD));
        COPPER_PICKAXE = registerItem("copper_pickaxe", new SwordItem(CopperMaterial.INSTANCE, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.add(COPPER_PICKAXE));
        COPPER_AXE = registerItem("copper_axe", new SwordItem(CopperMaterial.INSTANCE, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.add(COPPER_AXE));
        COPPER_SHOVEL = registerItem("copper_shovel", new SwordItem(CopperMaterial.INSTANCE, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.add(COPPER_SHOVEL));
        COPPER_HOE = registerItem("copper_hoe", new SwordItem(CopperMaterial.INSTANCE, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.add(COPPER_HOE));
        itemsRegistered += 5;
        JAMIM.LOGGER.info("Items " + itemsRegistered + "/5 registered");
    }
}
