package implementation.week9.ChefMyFridge.Ingredients;

import implementation.week9.ChefMyFridge.Interfaces.Cookable;
import implementation.week9.ChefMyFridge.Interfaces.Storable;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Dairy extends Ingredient implements Cookable, Storable {

    /** Constructor */
    public Dairy(String name, LocalDate expirationDate, double quantity) {
        super(name, expirationDate, quantity);
    }

    /** Calculate the freshness of the veggies */
    @Override
    public double calculateFreshnessScore() {
        long daysLeft = ChronoUnit.DAYS.between(LocalDate.now(), getExpirationDate());
        return Math.max(0, daysLeft * 5);
    }

    /** Cookable behaviour */
    @Override
    public boolean isCookable() {
        return !isExpired();
    }

    @Override
    public String recommendedDish() {
        return "Dairy: " + getName();
    }

    /** Storable behaviour */
    @Override
    public int preferredTemperature() {
        return 4; // typical fridge temp
    }

    @Override
    public boolean requiresRefrigeration() {
        return true;
    }
}