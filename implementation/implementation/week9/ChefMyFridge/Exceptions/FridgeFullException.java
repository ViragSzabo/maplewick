package implementation.week9.ChefMyFridge.Exceptions;

public class FridgeFullException extends Exception {
    public FridgeFullException() {
        super("❌ The fridge is fulL! You can't add more ingredients.");
    }
}