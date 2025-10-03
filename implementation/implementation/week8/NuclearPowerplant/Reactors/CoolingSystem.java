package implementation.week8.NuclearPowerplant.Reactors;

public class CoolingSystem
{
    private double waterTemperature = 0;

    public void abductResidualHeat(double residualHeat)
    {
        waterTemperature = residualHeat * 0.4;
    }

    public double getWaterTemperature()
    {
        return waterTemperature;
    }
}