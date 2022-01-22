package net.cthulhuthemad.blessedemeralds.item;

import net.cthulhuthemad.blessedemeralds.BlessedEmeralds;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BLESSED_EMERALDS = FabricItemGroupBuilder.build(new Identifier(BlessedEmeralds.MOD_ID, "blessed_emeralds"),
            () -> new ItemStack(ModItems.EMERALD_SHARD));
}
