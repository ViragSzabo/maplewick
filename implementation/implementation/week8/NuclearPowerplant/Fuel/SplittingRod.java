package implementation.week8.NuclearPowerplant.Fuel;

import implementation.week8.NuclearPowerplant.Reactor.SplitResult;

public abstract class SplittingRod
{
    protected double remainPercentage;

    public SplittingRod()
    {
        this.remainPercentage = 100.0;
    }

    public double getPercentageLeft()
    {
        return this.remainPercentage;
    }

    public SplitResult split(int time, int temperature) throws MeltdownException
    {
        return new SplitResult(time, temperature);
    }
}