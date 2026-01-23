package implementation.week14.brewery.vat;

import implementation.week14.brewery.enums.Ingredient;
import implementation.week14.brewery.exceptions.BrewingFailedException;
import implementation.week14.brewery.exceptions.VatExplosionException;
import implementation.week14.brewery.interfaces.Monitorable;

public class Copper extends Vat implements Monitorable
{
    public static final double MAX_TEMP = 100.0;
    public static final double INCREASE_TEMP = 10.0;

    public Copper(String id)
    {
        super(id);
    }

    @Override
    public String brew() throws BrewingFailedException
    {
        if (getIngredients().size() == 3)
        {
            for (Ingredient i : getIngredients())
            {
                getIngredients().remove(i);
            }

            return "Simple Potion";
        }

        throw new BrewingFailedException("Not possible to brew. Not enough ingredients.");
    }

    @Override
    public void heatUp() throws VatExplosionException
    {
        if (getCurrentTemperature() > MAX_TEMP)
        {
            throw new VatExplosionException("BOOM!");
        }

        setCurrentTemperature(getCurrentTemperature() + INCREASE_TEMP);
    }

    @Override
    public double getDangerLevel()
    {
        return getCurrentTemperature() / 100;
    }
}