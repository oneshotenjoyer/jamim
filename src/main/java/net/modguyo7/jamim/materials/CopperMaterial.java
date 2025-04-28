package net.modguyo7.jamim.materials;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

public class CopperMaterial implements ToolMaterial {
    public static final CopperMaterial INSTANCE = new CopperMaterial();

    @Override
    public int getDurability() {
        return 48;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 11.5f;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return null;
    }

    @Override
    public int getEnchantability() {
        return 32;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }


}
