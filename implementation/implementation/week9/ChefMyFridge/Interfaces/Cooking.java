package implementation.week9.ChefMyFridge.Interfaces;

import implementation.week9.ChefMyFridge.Fridge.SmartFridge;

public interface Cooking {
    boolean canBeCooked(SmartFridge fridge);
    void cook();
}