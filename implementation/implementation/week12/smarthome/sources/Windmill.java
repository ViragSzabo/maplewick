package implementation.week12.smarthome.sources;

import implementation.week12.smarthome.HouseholdResult;
import implementation.week12.smarthome.Weather;
import implementation.week12.smarthome.exception.BlackoutException;

public class Windmill extends PowerSource
{
    public Windmill(String id)
    {
        super(id);
    }

    @Override
    public HouseholdResult run(Weather weather) throws BlackoutException
    {
        if (weather == null)
        {
            throw new BlackoutException("Weather cannot be null.");
        }

        double budget = calculateBudget(weather);
        double pricePerKwh = calculatePricePerKwh(weather);

        return new HouseholdResult(budget, pricePerKwh);
    }

    private double calculateBudget(Weather weather)
    {
        if (weather != null)
        {
            return 25.0;
        }

        return 0.0;
    }

    private double calculatePricePerKwh(Weather weather)
    {
        if (weather == Weather.SUNNY)
        {
            return 10.0;
        }

        if (weather == Weather.RAINY)
        {
            return 25.0;
        }

        if (weather == Weather.CLOUDY)
        {
            return 15.0;
        }

        return 0.0;
    }
}