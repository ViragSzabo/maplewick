package implementation.week9.ChefMyFridge.People;

import implementation.week9.ChefMyFridge.Fridge.SmartFridge;
import implementation.week9.ChefMyFridge.Meals.Recipe;

import java.util.ArrayList;
import java.util.List;

public class Chef {
    private final String name;
    private final List<Recipe> recipes;

    public Chef(String name) {
        this.name = name;
        this.recipes = new ArrayList<>();
    }

    /** Get the name of the chef */
    public String getName() { return this.name; }

    /** Get all the recipes of the chef */
    public List<Recipe> getRecipes() { return this.recipes; }

    /** Add new recipe */
    public void addRecipe(Recipe recipe) { recipes.add(recipe); }

    /** Check the content of the fridge */
    public void inspectFridge(SmartFridge fridge) {
        System.out.println("👨‍🍳 Chef " + name + " is checking the fridge...");
        fridge.showFridgeContents();
    }

    /** Suggesting recipes */
    public void suggestRecipe(SmartFridge fridge, List<Recipe> recipes) {
        recipes.stream()
                .filter(r -> r.canBeCooked(fridge))
                .forEach(r -> System.out.println("🍽️ " + this.name + " can cook: " + r.getName()));}
}