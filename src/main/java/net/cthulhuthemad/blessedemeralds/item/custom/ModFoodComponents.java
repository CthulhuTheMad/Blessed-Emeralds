package net.cthulhuthemad.blessedemeralds.item.custom;


import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static FoodComponent BLESSED_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 6000, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 6000, 5), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 6000, 5), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 6000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 6000, 4), 1.0f)
            .alwaysEdible()
            .build();
}
