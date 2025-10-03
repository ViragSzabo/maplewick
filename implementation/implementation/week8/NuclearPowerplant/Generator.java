package implementation.week8.NuclearPowerplant;

import implementation.week8.NuclearPowerplant.Control.Status;
import implementation.week8.NuclearPowerplant.Control.Statusable;

public class Generator implements Statusable {
    private double totalProducedKwh;

    public Generator()
    {
        this.totalProducedKwh = 0;
    }

    public double generateEnergy(double steam)
    {
        this.totalProducedKwh += steam * 12;
        return this.totalProducedKwh;
    }

    public Status getStatus()
    {
        if (this.totalProducedKwh > 556)
        {
            return Status.UNSTABLE;
        }

        return Status.STABLE;
    }
}