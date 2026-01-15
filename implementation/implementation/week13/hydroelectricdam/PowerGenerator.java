package implementation.week13.hydroelectricdam;

public abstract class PowerGenerator
{
    private double reservoirLevel;

    public PowerGenerator(double reservoirLevel)
    {
        setReservoirLevel(reservoirLevel);
    }

    public double getReservoirLevel()
    {
        return reservoirLevel;
    }

    public void setReservoirLevel(double reservoirLevel)
    {
        if (reservoirLevel < 0)
        {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        this.reservoirLevel = reservoirLevel;
    }

    public abstract double generateElectricity(double waterFlow) throws HydroElectricCriticalException;
}