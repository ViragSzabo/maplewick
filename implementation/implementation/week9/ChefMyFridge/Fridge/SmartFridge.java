package implementation.week9.ChefMyFridge.Fridge;

import implementation.week9.ChefMyFridge.Exceptions.FridgeFullException;
import implementation.week9.ChefMyFridge.Exceptions.IngredientNotFoundException;
import implementation.week9.ChefMyFridge.Ingredients.Ingredient;
import implementation.week9.ChefMyFridge.Interfaces.Cookable;
import implementation.week9.ChefMyFridge.Interfaces.Storable;
import implementation.week9.ChefMyFridge.Meals.Recipe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SmartFridge {
    private final List<Ingredient> ingredients;

    /** Constructor */
    public SmartFridge() {
        this.ingredients = new ArrayList<>();
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    /** Try to put the ingredient in the fridge */
    public void addIngredient(Ingredient ingredient) throws FridgeFullException {
        if (ingredients.size() >= 20) throw new FridgeFullException();
        ingredients.add(ingredient);
    }

    /** Try to remove the ingredient from the fridge */
    public void removeIngredient(Ingredient ingredient) throws IngredientNotFoundException {
        if (!ingredients.remove(ingredient)) throw new IngredientNotFoundException(ingredient.getName());
        System.out.println("🧊 Removed: " + ingredient.getName());
    }

    /** Find the freshest ingredient in the fridge */
    public Ingredient findFreshest() {
        return ingredients.stream()
                .max(Comparator.comparing(Ingredient::calculateFreshnessScore))
                .orElse(null);
    }

    /** Find the closest to expiry ingredient in the fridge */
    public Ingredient findClosestToExpiry() {
        return ingredients.stream()
                .min(Comparator.comparing(Ingredient::calculateFreshnessScore))
                .orElse(null);
    }

    /** Get all the expired items from the fridge */
    public List<Ingredient> getExpiredIngredients() {
        return ingredients.stream()
                .filter(Ingredient::isExpired)
                .collect(Collectors.toList());
    }

    /** Get all the ingredients from the fridge */
    public void showFridgeContents() {
        System.out.println("🧺 Current Fridge Contents:");
        for (Ingredient i : ingredients) {
            System.out.printf("%s (%s) → Freshness: %.1f%%, Expiry: %s%n",
                    i.getName(),
                    i.getClass().getSimpleName(),
                    i.calculateFreshnessScore(),
                    i.getExpirationDate());
        }
    }

    /** 🧑‍🍳 List all the cookable ingredients */
    public void showCookableItems() {
        System.out.println("\n🍳 Cookable Ingredients:");
        ingredients.stream()
                .filter(i -> i instanceof Cookable)
                .forEach(i -> {
                    Cookable c = (Cookable) i;
                    if (c.isCookable()) {
                        System.out.println("✅ " + i.getName() + " → Dish: " + c.recommendedDish());
                    } else {
                        System.out.println("⚠️ " + i.getName() + " is not fresh enough to cook!");
                    }
                });
    }

    /** ❄️ Show the fridge temperature needs */
    public void showStorageTips() {
        System.out.println("\n🧊 Storage Recommendations:");
        ingredients.stream()
                .filter(i -> i instanceof Storable)
                .forEach(i -> {
                    Storable s = (Storable) i;
                    String temp = s.requiresRefrigeration()
                            ? "Keep at " + s.preferredTemperature() + "°C"
                            : "Room temperature OK";
                    System.out.println(i.getName() + ": " + temp);
                });
    }

    /** Show the cookable recipes */
    public void showCookableRecipes(List<Recipe> recipes) {
        recipes.stream()
                .filter(r -> r.canBeCooked(this))
                .forEach(r -> System.out.println("✅ Can cook: " + r.getName()));
    }
}