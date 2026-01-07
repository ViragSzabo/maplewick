package implementation.week8.NuclearPowerplant.Fuel;

import implementation.week8.NuclearPowerplant.Reactor.SplitResult;

public abstract class SplittingRod
{
    private static final double INITIAL_PERCENTAGE = 100.0;
    private double remainPercentage;

    public SplittingRod()
    {
        this.remainPercentage = INITIAL_PERCENTAGE;
    }

    public double getPercentageLeft()
    {
        return this.remainPercentage;
    }

    protected void decreasePercentage(double amount)
    {
        this.remainPercentage -= amount;

        if (this.remainPercentage < 0)
        {
            this.remainPercentage = 0;
        }
    }

    public abstract SplitResult split(int time, int temperature) throws MeltdownException;
}