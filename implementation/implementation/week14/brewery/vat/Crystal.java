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
        if (getIngredients().contains(Ingredient.TOADSTOOL))
        {

            throw new BrewingFailedException("Not possible. Must not include toad stool!");
        }

        getIngredients().clear();

        return "Pure Elixir";
    }

    @Override
    public void heatUp() throws VatExplosionException
    {
        double newTemp = getCurrentTemperature() + INCREASE_TEMP;

        if (newTemp > MAX_TEMP)
        {
            throw new VatExplosionException("BOOM!");
        }

        setCurrentTemperature(newTemp);
    }

    @Override
    public double getDangerLevel()
    {
        return getCurrentTemperature() / 80;
    }
}