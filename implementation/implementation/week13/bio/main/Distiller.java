package implementation.week13.bio.main;

import implementation.week13.bio.status.Monitorable;
import implementation.week13.bio.status.Status;

public class Distiller implements Monitorable
{
    private static final double INITIAL_TOTAL_OF_FUEL_PRODUCED = 0.0;
    private static final double DECAY_RAW_ETHANOL = 0.0009;
    private static final double MAX_FUEL_PRODUCED = 5000.0;

    private double totalOfFuelProduced;

    public Distiller()
    {
        this.totalOfFuelProduced = INITIAL_TOTAL_OF_FUEL_PRODUCED;
    }

    public double getPureFuel(double rawEthanol)
    {
        return totalOfFuelProduced += (rawEthanol * DECAY_RAW_ETHANOL);
    }

    @Override
    public Status checkSystem()
    {
        if (this.totalOfFuelProduced > MAX_FUEL_PRODUCED)
        {
            return Status.DANGER;
        }

        return Status.OK;
    }
}