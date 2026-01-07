package implementation.week8.NuclearPowerplant.Fuel;

import implementation.week8.NuclearPowerplant.Reactor.SplitResult;

public class Nhlium extends SplittingRod
{
    private static final int CRITICAL_TIME_LIMIT = 60;
    private static final int CRITICAL_HEAT_LIMIT = 100;

    private static final double MIN_FUEL_THRESHOLD = 0.1;
    private static final double FUEL_CONSUMPTION_RATE = 0.06;

    private static final int STABLE_TEMP_LIMIT = 90;
    private static final double REACTION_FACTOR = 0.9;
    private static final double STEAM_DIVISOR = 70.0;
    private static final double RESIDUAL_HEAT_FACTOR_LOW_TEMP = 3.0;
    private static final double RESIDUAL_HEAT_FACTOR_HIGH_TEMP = 10.0;

    public Nhlium()
    {
        super();
    }

    @Override
    public SplitResult split(int time, int temperature) throws MeltdownException
    {
        // 1. Guard Check: The critical point
        checkCriticalLimits(time, temperature);

        // 2. Fuel Consumption
        applyFuelConsumption(time);

        // 3. Output: The calculation point
        double steam = calculateSteam(time, temperature);
        double residualHeat = calculateResidualHeat(time, temperature);

        // 4. Lastly: The check point
        checkFuelLevel();

        return new SplitResult(steam, residualHeat);
    }

    private void checkCriticalLimits(int time, int temp) throws MeltdownException
    {
        if (time > CRITICAL_TIME_LIMIT && temp > CRITICAL_HEAT_LIMIT)
        {
            throw new MeltdownException("Critical time limit exceeded");
        }
    }

    private void applyFuelConsumption(int time)
    {
        double decreasedAmount = (FUEL_CONSUMPTION_RATE * time);
        decreasePercentage(decreasedAmount);
    }

    private double calculateSteam(int time, int temp)
    {
        if (temp < STABLE_TEMP_LIMIT)
        {
            return ((double) temp / STEAM_DIVISOR) * time * REACTION_FACTOR;
        }
        else
        {
            return REACTION_FACTOR * (temp * REACTION_FACTOR / time) * Math.sqrt(3) * time;
        }
    }

    private double calculateResidualHeat(int time, int temp)
    {
        if (temp < STABLE_TEMP_LIMIT)
        {
            return time * RESIDUAL_HEAT_FACTOR_LOW_TEMP;
        }
        else
        {
            return (double) time / RESIDUAL_HEAT_FACTOR_HIGH_TEMP;
        }
    }

    private void checkFuelLevel() throws MeltdownException
    {
        if (getPercentageLeft() < MIN_FUEL_THRESHOLD)
        {
            throw new MeltdownException("Fuel is below critical level!");
        }
    }
}