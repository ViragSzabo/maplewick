package implementation.week8.NuclearPowerplant.SlittingRods;

import implementation.week8.NuclearPowerplant.MeltdownException;

public abstract class SplittingRod
{
    protected double residualPercentage = 100.0;

    public abstract double[] split(double temperature, double time) throws MeltdownException, MeltdownException;

    public double getResidualPercentage()
    {
        return residualPercentage;
    }
}