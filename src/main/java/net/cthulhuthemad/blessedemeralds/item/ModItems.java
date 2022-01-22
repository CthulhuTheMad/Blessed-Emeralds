package net.cthulhuthemad.blessedemeralds.item;

import net.cthulhuthemad.blessedemeralds.BlessedEmeralds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item EMERALD_SHARD = registerItem("emerald_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.BLESSED_EMERALDS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BlessedEmeralds.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Now registering items for " + BlessedEmeralds.MOD_ID);
    }
}
