package implementation.week8.NuclearPowerplant.Reactor;

import implementation.week8.NuclearPowerplant.Fuel.MeltdownException;
import implementation.week8.NuclearPowerplant.Fuel.SplittingRod;

public abstract class SplitResult extends SplittingRod {
    private final double steamInCubicMeters;
    private final double residualHeat;

    public SplitResult(double steamInCubicMeters, double residualHeat)
    {
        this.steamInCubicMeters = steamInCubicMeters;
        this.residualHeat = residualHeat;
    }

    public double getSteamInCubicMeters()
    {
        return this.steamInCubicMeters;
    }

    public double getResidualHeat()
    {
        return this.residualHeat;
    }
}