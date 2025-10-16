package implementation.week9.ChefMyFridge;

import implementation.week9.ChefMyFridge.Exceptions.FridgeFullException;
import implementation.week9.ChefMyFridge.Exceptions.IngredientNotFoundException;
import implementation.week9.ChefMyFridge.Fridge.SmartFridge;
import implementation.week9.ChefMyFridge.Ingredients.Dairy;
import implementation.week9.ChefMyFridge.Ingredients.Ingredient;
import implementation.week9.ChefMyFridge.Ingredients.Meat;
import implementation.week9.ChefMyFridge.Ingredients.Vegetable;
import implementation.week9.ChefMyFridge.Meals.Recipe;
import implementation.week9.ChefMyFridge.People.Chef;

import java.time.LocalDate;
import java.util.List;

public class ChefApp {
    public static void main(String[] args) throws FridgeFullException, IngredientNotFoundException {
        SmartFridge fridge = new SmartFridge();

        Ingredient tomato = new Vegetable("Tomato", LocalDate.now().plusDays(3), 200);
        Ingredient chicken = new Meat("Chicken Breast", LocalDate.now().plusDays(1), 500);
        Ingredient milk = new Dairy("Milk", LocalDate.now().plusDays(2), 1000);
        Ingredient egg = new Dairy("Egg", LocalDate.now().plusDays(5), 50);

        Recipe omelette = new Recipe("Omelette", List.of(egg, milk, tomato));
        Chef chef = new Chef("Joghue");

        fridge.addIngredient(tomato);
        fridge.addIngredient(chicken);
        fridge.addIngredient(milk);
        fridge.addIngredient(egg);

        chef.addRecipe(omelette);

        System.out.println("🍳 Welcome to Chef & My Fridge!");
        System.out.println("--------------------------------------------------");

        chef.inspectFridge(fridge);
        System.out.println("\n🥇 Freshest: " + fridge.findFreshest().getName());
        System.out.println("⏳ Closest to Expiry: " + fridge.findClosestToExpiry().getName());

        System.out.println("\n🧊 Checking expired items...");
        fridge.getExpiredIngredients().forEach(i -> System.out.println("❌ " + i.getName()));

        System.out.println("\n📦 Storage Tips:");
        fridge.showStorageTips();

        System.out.println("\n🍽️ Available Recipes:");
        chef.suggestRecipe(fridge, chef.getRecipes());

        System.out.println("\n👨‍🍳 Let's Cook!");
        chef.getRecipes().forEach(Recipe::cook);
        fridge.showCookableRecipes(chef.getRecipes());

    }
}