package world.vanillyn.data.items.Recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.input.CraftingRecipeInput;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.World;

public class CraftingInterfaceRecipe implements Recipe<CraftingRecipeInput> {
    private final Ingredient inputA;
    private final ItemStack result;
    private final int cost;

    public CraftingInterfaceRecipe(Ingredient inputA, ItemStack result, int cost) {
        this.inputA = inputA;
        this.result = result;
        this.cost = cost;
    }

    public Ingredient getInputA() {
        return this.inputA;
    }


    @Override
    public boolean matches(CraftingRecipeInput input, World world) {
        if (input.getSize() < 3) return false;
        return inputA.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(CraftingRecipeInput input, RegistryWrapper.WrapperLookup lookup) {

        return this.getResult(lookup).copy();
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResult(RegistryWrapper.WrapperLookup registriesLookup) {
        return this.result;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return null;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<CraftingInterfaceRecipe> {
        public static final Type INSTANCE = new Type();
        public static final String ID = "bangboo_combine";
        private Type() {
        }
    }
}
