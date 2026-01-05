package implementation.week8.NuclearPowerplant.Fuel;

import implementation.week8.NuclearPowerplant.Reactor.SplitResult;

public class Nhlium extends SplittingRod
{
    public Nhlium()
    {
        super();
    }

    @Override
    public SplitResult split(int time, int temperature) throws MeltdownException
    {
        double steam;
        double residualHeat;
        final int MAX_TIME = 60;
        final double CALCULATE_HELPER = 0.9;
        final double HELPER_STEAM_NUMBER = 70;
        final int MAX_RESIDUAL_HEAT_TEMP = 100;
        final double CHECK_MELTDOWN_NUMBER = 0.1;
        final double HELPER_RESIDUAL_NUMBER = 10;
        final int NUMBER_OF_TIMES_RESIDUAL_HEAT = 3;
        final int MAX_TEMP_FOR_REMAIN_PERCENTAGE = 90;
        final double MULTIPLE_FOR_REMAIN_PERCENTAGE = 0.06;

        if (time > MAX_TIME && temperature > MAX_RESIDUAL_HEAT_TEMP)
        {
            throw new MeltdownException("Oh My God! Something went wrong.");
        }

        this.remainPercentage -= (MULTIPLE_FOR_REMAIN_PERCENTAGE * time);

        if (temperature < MAX_TEMP_FOR_REMAIN_PERCENTAGE)
        {
            steam = ((double) temperature / HELPER_STEAM_NUMBER) * time * CALCULATE_HELPER;
            residualHeat = time * NUMBER_OF_TIMES_RESIDUAL_HEAT;
        }
        else
        {
            steam = CALCULATE_HELPER * (temperature * CALCULATE_HELPER / time) * Math.sqrt(3) * time;
            residualHeat = (double) time / HELPER_RESIDUAL_NUMBER;
        }

        if (this.remainPercentage < CHECK_MELTDOWN_NUMBER)
        {
            throw new MeltdownException("Oh My God! Something went wrong.");
        }

        return new SplitResult(steam, residualHeat);
    }
}