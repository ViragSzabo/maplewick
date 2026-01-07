package implementation.week8.NuclearPowerplant.Reactor;

import implementation.week8.NuclearPowerplant.Control.Status;
import implementation.week8.NuclearPowerplant.Control.Statusable;
import implementation.week8.NuclearPowerplant.Fuel.MeltdownException;
import implementation.week8.NuclearPowerplant.Fuel.SplittingRod;

import java.util.HashSet;

public class Reactor implements Statusable
{
    private final HashSet<SplittingRod> splittingRods;

    public Reactor()
    {
        this.splittingRods = new HashSet<>();
    }

    public HashSet<SplittingRod> getSplittingRods()
    {
        return this.splittingRods;
    }

    public void addCore(SplittingRod core)
    {
        if (this.splittingRods.contains(core))
        {
            throw new IllegalArgumentException();
        }

        this.splittingRods.add(core);
    }

    public SplitResult run(int time, int temperature) throws MeltdownException
    {
        double totalSteam = 0;
        double totalResidualHeat = 0;

        for (SplittingRod splittingRod : this.splittingRods)
        {
            if (this.splittingRods.contains(splittingRod))
            {
                SplitResult result = splittingRod.split(time, temperature);
                totalSteam += result.steamInCubicMeters();
                totalResidualHeat += result.residualHeat();
            }
        }

        return new SplitResult(totalSteam, totalResidualHeat);
    }

    public Status getStatus()
    {
        final double CHECK_MELTDOWN_NUMBER = 0.1;

        for (SplittingRod fuel : this.splittingRods)
        {
            if (fuel.getPercentageLeft() <= CHECK_MELTDOWN_NUMBER)
            {
                return Status.NEEDS_ATTENTION;
            }
        }

        return Status.STABLE;
    }
}