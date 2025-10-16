package implementation.week9.ChefMyFridge.Ingredients;

import implementation.week9.ChefMyFridge.Enums.FreshnessStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class IngredientTest {
    Ingredient vegetable;
    Ingredient meat;
    Ingredient milk;

    @BeforeEach
    void setUp() {
        vegetable = new Vegetable("Tomato", LocalDate.now().plusDays(3), 200);
        meat = new Meat("Chicken Breast", LocalDate.now().plusDays(1), 500);
        milk = new Dairy("Milk", LocalDate.now().plusDays(2), 1000);
    }

    @Test
    void getName() {
        assertEquals("Tomato", vegetable.getName());
        assertEquals("Chicken Breast", meat.getName());
        assertEquals("Milk", milk.getName());
    }

    @Test
    void getExpirationDate() {
        assertEquals(LocalDate.now().plusDays(3), vegetable.getExpirationDate());
        assertEquals(LocalDate.now().plusDays(1), meat.getExpirationDate());
        assertEquals(LocalDate.now().plusDays(2), milk.getExpirationDate());
    }

    @Test
    void getQuantity() {
        assertEquals(200, vegetable.getQuantity());
        assertEquals(500, meat.getQuantity());
        assertEquals(1000, milk.getQuantity());
    }

    @Test
    void setQuantity() {
        vegetable.setQuantity(500);
        assertEquals(500, vegetable.getQuantity());
        meat.setQuantity(250);
        assertEquals(250, meat.getQuantity());
        milk.setQuantity(150);
        assertEquals(150, milk.getQuantity());
    }

    @Test
    void isExpired() {
        assertFalse(vegetable.isExpired());
        assertFalse(meat.isExpired());
        assertFalse(milk.isExpired());
    }

    @Test
    void calculateFreshnessScore() {
        assertEquals(30.0, vegetable.calculateFreshnessScore());
        assertEquals(25.0, meat.calculateFreshnessScore());
        assertEquals(10.0, milk.calculateFreshnessScore());
    }

    @Test
    void getStatus() {
        assertEquals(FreshnessStatus.FRESH, vegetable.getStatus());
        assertEquals(FreshnessStatus.WARNING, meat.getStatus());
        assertEquals(FreshnessStatus.FRESH, milk.getStatus());
    }
}