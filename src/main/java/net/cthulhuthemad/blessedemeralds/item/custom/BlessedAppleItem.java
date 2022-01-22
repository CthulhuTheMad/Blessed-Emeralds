package net.cthulhuthemad.blessedemeralds.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlessedAppleItem extends Item {
    public BlessedAppleItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
