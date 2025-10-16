package implementation.week9.ChefMyFridge.Fridge;

import implementation.week9.ChefMyFridge.Enums.FreshnessStatus;
import implementation.week9.ChefMyFridge.Exceptions.FridgeFullException;
import implementation.week9.ChefMyFridge.Exceptions.IngredientNotFoundException;
import implementation.week9.ChefMyFridge.Ingredients.Dairy;
import implementation.week9.ChefMyFridge.Ingredients.Ingredient;
import implementation.week9.ChefMyFridge.Ingredients.Meat;
import implementation.week9.ChefMyFridge.Ingredients.Vegetable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SmartFridgeTest {
    SmartFridge fridge;
    Ingredient tomato;
    Ingredient chicken;
    Ingredient milk;

    @BeforeEach
    void setUp() {
        fridge = new SmartFridge();

        tomato = new Vegetable("Tomato", LocalDate.now().plusDays(3), 200);
        chicken = new Meat("Chicken Breast", LocalDate.now().plusDays(1), 500);
        milk = new Dairy("Milk", LocalDate.now().plusDays(2), 1000);

    }

    @Test
    void addIngredient_overCapacity_throwsFridgeFullException() throws FridgeFullException {
        fridge.addIngredient(tomato);
        fridge.addIngredient(chicken);
        fridge.addIngredient(milk);
        assertEquals(3, fridge.getIngredients().size());

        // Fill up to the limit (20)
        for (int i = 0; i < 17; i++) {
            fridge.addIngredient(new Dairy("Yoghurt", LocalDate.now().plusDays(15), 5));
        }

        // This 21st ingredient should trigger the exception
        assertThrows(FridgeFullException.class, () ->
                fridge.addIngredient(new Dairy("Overflow", LocalDate.now().plusDays(10), 5))
        );
    }

    @Test
    void removeIngredient() {
        try {
            fridge.addIngredient(tomato);
            fridge.addIngredient(chicken);
            fridge.addIngredient(milk);
            assertEquals(3, fridge.getIngredients().size());

            fridge.removeIngredient(tomato);
            assertEquals(2, fridge.getIngredients().size());

        } catch (IngredientNotFoundException | FridgeFullException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void findFreshest() {
        try {
            fridge.addIngredient(tomato);
            fridge.addIngredient(chicken);
            fridge.addIngredient(milk);

            assertEquals(tomato, fridge.findFreshest());

        } catch (FridgeFullException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void findClosestToExpiry() {
        try {
            fridge.addIngredient(tomato);
            fridge.addIngredient(chicken);
            fridge.addIngredient(milk);

            assertEquals(milk, fridge.findClosestToExpiry());

        } catch (FridgeFullException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void getExpiredIngredients() {
        try {
            fridge.addIngredient(tomato);
            fridge.addIngredient(chicken);
            fridge.addIngredient(milk);

            assertEquals(FreshnessStatus.FRESH, tomato.getStatus());
            assertEquals(FreshnessStatus.WARNING, chicken.getStatus());
            assertEquals(FreshnessStatus.FRESH, milk.getStatus());

        } catch (FridgeFullException e) {
            throw new RuntimeException(e);
        }
    }
}