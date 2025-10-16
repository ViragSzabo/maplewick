package implementation.week9.ChefMyFridge.Meals;

import implementation.week9.ChefMyFridge.Fridge.SmartFridge;
import implementation.week9.ChefMyFridge.Ingredients.Ingredient;
import implementation.week9.ChefMyFridge.Interfaces.Cooking;

import java.util.List;

public class Recipe implements Cooking {
    private final String name;
    private final List<Ingredient> requiredIngredients;

    public Recipe(String name, List<Ingredient> requiredIngredients) {
        this.name = name;
        this.requiredIngredients = requiredIngredients;
    }

    public String getName() { return name; }

    @Override
    public boolean canBeCooked(SmartFridge fridge) {
        return requiredIngredients.stream()
                .allMatch(ingredientName ->
                        fridge.getIngredients().stream()
                                .anyMatch(i -> i.getName().equalsIgnoreCase(ingredientName.getName())));
    }

    @Override
    public void cook() {
        System.out.println("🔥 Cooking " + name + "...");
        System.out.println("🍽️ Bon appétit!");
    }
}