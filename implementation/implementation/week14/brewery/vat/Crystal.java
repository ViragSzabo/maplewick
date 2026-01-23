package implementation.week14.brewery.vat;

import implementation.week14.brewery.enums.Ingredient;
import implementation.week14.brewery.exceptions.BrewingFailedException;
import implementation.week14.brewery.exceptions.VatExplosionException;
import implementation.week14.brewery.interfaces.Monitorable;

public class Crystal extends Vat implements Monitorable
{
    public static final double MAX_TEMP = 80.0;
    public static final double INCREASE_TEMP = 5.0;

    public Crystal(String id)
    {
        super(id);
    }

    @Override
    public String brew() throws BrewingFailedException
    {
        for (Ingredient i : getIngredients())
        {
            if (!Ingredient.TOADSTOOL.equals(i))
            {
                getIngredients().remove(i);
                return "Pure Elixir";
            }
        }

        throw new BrewingFailedException("Not possible. Must not include pure elixir!");
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
        return getCurrentTemperature() / 80;
    }
}