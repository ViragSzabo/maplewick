package implementation.week8.NuclearPowerplant;

import implementation.week8.NuclearPowerplant.Control.Status;
import implementation.week8.NuclearPowerplant.Control.Statusable;

public class Generator implements Statusable
{
    private double totalProducedKwh;

    public Generator()
    {
        this.totalProducedKwh = 0;
    }

    public double getTotalProducedKwh()
    {
        return this.totalProducedKwh;
    }

    public double generateEnergy(double steam)
    {
        int STEAM_ENERGY_NUMBER = 12;

        this.totalProducedKwh += steam * STEAM_ENERGY_NUMBER;
        return this.totalProducedKwh;
    }

    public Status getStatus()
    {
        int MAX_PRODUCE_KWH = 560;

        if (this.totalProducedKwh > MAX_PRODUCE_KWH)
        {
            return Status.UNSTABLE;
        }

        return Status.STABLE;
    }
}