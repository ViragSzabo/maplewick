package implementation.week8.NuclearPowerplant;

import implementation.week8.NuclearPowerplant.Control.Status;
import implementation.week8.NuclearPowerplant.Control.Statusable;

public class Generator implements Statusable
{
    private static final int MAX_CUMULATIVE_KWH_LIMIT = 560;
    private static final int ENERGY_PER_STEAM_UNIT = 12;
    private static final int INITIAL_TOTAL_PRODUCE_KWH = 0;

    private double totalProducedKwh;

    public Generator()
    {
        this.totalProducedKwh = INITIAL_TOTAL_PRODUCE_KWH;
    }

    public double getTotalProducedKwh()
    {
        return this.totalProducedKwh;
    }

    public double generateEnergy(double steam)
    {
        // 1. Calculate the current energy
        double currentEnergy = steam * ENERGY_PER_STEAM_UNIT;

        // 2. Add to the total
        this.totalProducedKwh += currentEnergy;

        // 3. Return the result
        return currentEnergy;
    }

    public Status getStatus()
    {
        if (this.totalProducedKwh > MAX_CUMULATIVE_KWH_LIMIT)
        {
            return Status.UNSTABLE;
        }

        return Status.STABLE;
    }
}