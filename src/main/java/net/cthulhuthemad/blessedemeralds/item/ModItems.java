package net.cthulhuthemad.blessedemeralds.item;

import net.cthulhuthemad.blessedemeralds.BlessedEmeralds;
import net.cthulhuthemad.blessedemeralds.item.custom.BlessedAppleItem;
import net.cthulhuthemad.blessedemeralds.item.custom.ModFoodComponents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item EMERALD_SHARD = registerItem("emerald_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.BLESSED_EMERALDS)));
    public static final Item POWERED_EMERALD_SHARD = registerItem("powered_emerald_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.BLESSED_EMERALDS).rarity(Rarity.RARE)));
    public static final Item BLESSED_EMERALD_PIECE = registerItem("blessed_emerald_piece",
            new Item(new FabricItemSettings().group(ModItemGroup.BLESSED_EMERALDS).rarity(Rarity.RARE)));
    public static final Item BLESSED_EMERALD = registerItem("blessed_emerald",
            new Item(new FabricItemSettings().group(ModItemGroup.BLESSED_EMERALDS).rarity(Rarity.EPIC)));

    public static final Item BLESSED_APPLE = registerItem("blessed_apple",
            new BlessedAppleItem(new FabricItemSettings().group(ModItemGroup.BLESSED_EMERALDS)
                    .rarity(Rarity.EPIC).food(ModFoodComponents.BLESSED_APPLE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BlessedEmeralds.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Now registering items for " + BlessedEmeralds.MOD_ID);
    }
}
