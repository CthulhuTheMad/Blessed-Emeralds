package net.cthulhuthemad.blessedemeralds.item;

import net.cthulhuthemad.blessedemeralds.BlessedEmeralds;
import net.cthulhuthemad.blessedemeralds.item.custom.BlessedAppleItem;
import net.cthulhuthemad.blessedemeralds.item.custom.ModAxeItem;
import net.cthulhuthemad.blessedemeralds.item.custom.ModHoeItem;
import net.cthulhuthemad.blessedemeralds.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
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

    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe",
            new ModPickaxeItem(ModToolMaterial.EMERALD, 1, -2.8F,
                    new FabricItemSettings().group(ModItemGroup.BLESSED_EMERALDS)));
    public static final Item EMERALD_AXE = registerItem("emerald_axe",
            new ModAxeItem(ModToolMaterial.EMERALD, 5.5F, -3.0F,
                    new FabricItemSettings().group(ModItemGroup.BLESSED_EMERALDS)));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe",
            new ModHoeItem(ModToolMaterial.EMERALD, -3, 0.0F,
                    new FabricItemSettings().group(ModItemGroup.BLESSED_EMERALDS)));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel",
            new ShovelItem(ModToolMaterial.EMERALD, 2, -3.0F,
                    new FabricItemSettings().group(ModItemGroup.BLESSED_EMERALDS)));
    public static final Item EMERALD_SWORD = registerItem("emerald_sword",
            new SwordItem(ModToolMaterial.EMERALD, 4, -2.4F,
                    new FabricItemSettings().group(ModItemGroup.BLESSED_EMERALDS)));

    public static final Item BLESSED_EMERALD_PICKAXE = registerItem("blessed_emerald_pickaxe",
            new ModPickaxeItem(ModToolMaterial.BLESSED_EMERALD, 1, -2.8F,
                    new FabricItemSettings().group(ModItemGroup.BLESSED_EMERALDS)));
    public static final Item BLESSED_EMERALD_AXE = registerItem("blessed_emerald_axe",
            new ModAxeItem(ModToolMaterial.BLESSED_EMERALD, 5.5F, -3.0F,
                    new FabricItemSettings().group(ModItemGroup.BLESSED_EMERALDS)));
    public static final Item BLESSED_EMERALD_HOE = registerItem("blessed_emerald_hoe",
            new ModHoeItem(ModToolMaterial.BLESSED_EMERALD, -3, 0.0F,
                    new FabricItemSettings().group(ModItemGroup.BLESSED_EMERALDS)));
    public static final Item BLESSED_EMERALD_SHOVEL = registerItem("blessed_emerald_shovel",
            new ShovelItem(ModToolMaterial.BLESSED_EMERALD, 2, -3.0F,
                    new FabricItemSettings().group(ModItemGroup.BLESSED_EMERALDS)));
    public static final Item BLESSED_EMERALD_SWORD = registerItem("blessed_emerald_sword",
            new SwordItem(ModToolMaterial.BLESSED_EMERALD, 4, -2.4F,
                    new FabricItemSettings().group(ModItemGroup.BLESSED_EMERALDS)));

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
