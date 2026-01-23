package implementation.week14.brewery.vat;

import implementation.week14.brewery.enums.Ingredient;
import implementation.week14.brewery.exceptions.BrewingFailedException;
import implementation.week14.brewery.exceptions.VatExplosionException;
import implementation.week14.brewery.interfaces.Monitorable;

public class Iron extends Vat implements Monitorable
{
    public static final double MAX_TEMP = 500.0;
    public static final double INCREASE_TEMP = 50.0;

    public Iron(String id)
    {
        super(id);
    }

    @Override
    public String brew() throws BrewingFailedException
    {
        for (Ingredient i : getIngredients())
        {
            if (Ingredient.DRAGON_SCALE.equals(i))
            {
                getIngredients().remove(i);
                return "Strong Potion";
            }
        }

        throw new BrewingFailedException("Not possible. Missing Dragon Scale.");
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
        return getCurrentTemperature() / 500;
    }
}