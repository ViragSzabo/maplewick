package implementation.week9.ChefMyFridge.Ingredients;

import implementation.week9.ChefMyFridge.Enums.FreshnessStatus;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Ingredient {
    private final String name;
    private final LocalDate expirationDate;
    private double quantity; // grams, ml, etc.

    /** Constructor */
    public Ingredient(String name, LocalDate expirationDate, double quantity) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.quantity = quantity;
    }

    /** Get the name of the ingredient */
    public String getName() {
        return name;
    }

    /** Get the date of the expiration */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /** Get the quantity of the ingredient */
    public double getQuantity() {
        return quantity;
    }

    /** Change the quantity of the ingredient */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    /** Check if the ingredients is expired */
    public boolean isExpired() {
        return LocalDate.now().isAfter(expirationDate);
    }

    /** Calculate the freshness of the ingredient based on how many days left until it expires */
    public abstract double calculateFreshnessScore();

    /** Get the status label of the freshness */
    public FreshnessStatus getStatus() {
        if (isExpired()) return FreshnessStatus.EXPIRED;
        else if (ChronoUnit.DAYS.between(LocalDate.now(), expirationDate) < 2) return FreshnessStatus.WARNING;
        else return FreshnessStatus.FRESH;
    }
}