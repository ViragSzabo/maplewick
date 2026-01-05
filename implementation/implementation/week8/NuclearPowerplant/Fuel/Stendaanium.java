package implementation.week8.NuclearPowerplant.Fuel;

import implementation.week8.NuclearPowerplant.Reactor.SplitResult;

public class Stendaanium extends SplittingRod
{
    public Stendaanium()
    {
        super();
    }

    @Override
    public SplitResult split(int time, int temperature) throws MeltdownException
    {
        final int MIN_TEMP = 150;
        final int AVG_TEMP = 50;
        final double CALC_ONE = 0.00007;
        final double CALC_TWO = 0.0004;
        final int NO_DECREASE = 0;

        if (temperature > MIN_TEMP)
        {
            throw new MeltdownException("Oh My God!");
        }

        if (temperature >= AVG_TEMP)
        {
            this.remainPercentage -= CALC_ONE * temperature * time + CALC_TWO;
        }

        if (temperature < AVG_TEMP)
        {
            this.remainPercentage -= NO_DECREASE;
        }

        return new SplitResult(time, temperature);
    }
}