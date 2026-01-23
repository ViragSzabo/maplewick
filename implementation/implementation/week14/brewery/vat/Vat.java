package implementation.week14.brewery.vat;

import implementation.week14.brewery.enums.Ingredient;
import implementation.week14.brewery.exceptions.BrewingFailedException;
import implementation.week14.brewery.exceptions.VatExplosionException;
import implementation.week14.brewery.interfaces.Monitorable;

import java.util.ArrayList;
import java.util.List;

public abstract class Vat implements Monitorable
{
    private String id;
    private double currentTemperature;
    private List<Ingredient> ingredients;

    public Vat(String id)
    {
        setId(id);
        setCurrentTemperature(20.0); // room temperature
        this.ingredients = new ArrayList<Ingredient>();
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException("The id cannot be null");
        }

        this.id = id;
    }

    public double getCurrentTemperature()
    {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature)
    {
        if (currentTemperature < 0)
        {
            throw new IllegalArgumentException("The temperature here cannot be negative");
        }

        this.currentTemperature = currentTemperature;
    }

    public List<Ingredient> getIngredients()
    {
        return this.ingredients;
    }

    public void addIngredient(Ingredient ingredient)
    {
        this.ingredients.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient)
    {
        this.ingredients.remove(ingredient);
    }

    public abstract String brew() throws BrewingFailedException;
    public abstract void heatUp() throws VatExplosionException;
}