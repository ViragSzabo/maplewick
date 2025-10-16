package implementation.week9.ChefMyFridge.Exceptions;

public class IngredientNotFoundException extends Exception {
    public IngredientNotFoundException(String name) {
        super("⚠️ Ingredient not found: " + name);
    }
}