package implementation.week8.NuclearPowerplant.Fuel;

import implementation.week8.NuclearPowerplant.Reactor.SplitResult;

public class Stendaanium extends SplittingRod
{
    private static final int MELTDOWN_THRESHOLD_TEMP = 150;
    private static final int REACTION_MIN_TEMP = 50;
    private static final double DECAY_FACTOR_TIME = 0.00007;
    private static final double DECAY_BASE_AMOUNT = 0.0004;

    public Stendaanium()
    {
        super();
    }

    @Override
    public SplitResult split(int time, int temperature) throws MeltdownException
    {
        // 1. Guard Check: The critical point
        if (temperature > MELTDOWN_THRESHOLD_TEMP)
        {
            throw new MeltdownException("Critical temperature exceeded temperature threshold!");
        }

        // 2. Business Logic: The reaction point
        if (temperature >= REACTION_MIN_TEMP)
        {
            applyUsageCalculation(time, temperature);
        }

        return new SplitResult(time, temperature);
    }

    // HELPER: To calculate how much fuel will be decreased
    private void applyUsageCalculation(int time, int temp)
    {
        double usage = (DECAY_FACTOR_TIME * temp * time + DECAY_BASE_AMOUNT);

        decreasePercentage(usage);
    }
}