package implementation.week8.NuclearPowerplant.Reactor;

public record SplitResult(double steamInCubicMeters, double residualHeat)
{
    @Override
    public String toString()
    {
        return "SplitResult{" + "steam=" + steamInCubicMeters + ", heat=" + residualHeat + '}';
    }
}