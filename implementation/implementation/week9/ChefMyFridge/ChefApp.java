package implementation.week9.ChefMyFridge;

import implementation.week9.ChefMyFridge.Exceptions.FridgeFullException;
import implementation.week9.ChefMyFridge.Exceptions.IngredientNotFoundException;
import implementation.week9.ChefMyFridge.Fridge.SmartFridge;
import implementation.week9.ChefMyFridge.Ingredients.Dairy;
import implementation.week9.ChefMyFridge.Ingredients.Ingredient;
import implementation.week9.ChefMyFridge.Ingredients.Meat;
import implementation.week9.ChefMyFridge.Ingredients.Vegetable;

import java.time.LocalDate;

public class ChefApp {
    public static void main(String[] args) throws FridgeFullException, IngredientNotFoundException {
        SmartFridge fridge = new SmartFridge();

        Ingredient tomato = new Vegetable("Tomato", LocalDate.now().plusDays(3), 200);
        Ingredient chicken = new Meat("Chicken Breast", LocalDate.now().plusDays(1), 500);
        Ingredient milk = new Dairy("Milk", LocalDate.now().plusDays(2), 1000);

        fridge.addIngredient(tomato);
        fridge.addIngredient(chicken);
        fridge.addIngredient(milk);

        System.out.println("👨‍🍳 Welcome to Chef & My Fridge!");
        System.out.println("--------------------------------------------------");
        fridge.showFridgeContents();

        System.out.println("\n🥇 Freshest: " + fridge.findFreshest().getName());
        System.out.println("⏳ Closest to Expiry: " + fridge.findClosestToExpiry().getName());

        System.out.println("\n❌ Expired Items:");
        fridge.getExpiredIngredients().forEach(i -> System.out.println(" - " + i.getName()));

        fridge.showCookableItems();
        fridge.showStorageTips();

        fridge.removeIngredient(milk);
    }
}