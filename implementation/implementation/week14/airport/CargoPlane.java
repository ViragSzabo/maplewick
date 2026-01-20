package implementation.week14.airport;

public class CargoPlane extends Aircraft implements Maintenance
{
    private static final double FUELPERKM_PERCENTAGE = 2.0;
    private static final double CURRENTCARGLOAD_PERCENTAGE = 0.1;

    private double maxCargoWeight;
    private double currentCargoLoad;

    public CargoPlane(String callSign, int fuelCapacity, double currentFuel, double maxCargoWeight)
    {
        super(callSign, fuelCapacity, currentFuel);
        setMaxCargoWeight(maxCargoWeight);
    }

    @Override
    public void fly(int distance) throws InsufficientFuelException
    {
        // 1. Calculate Required Fuel
        double fuelPerKm = FUELPERKM_PERCENTAGE + (currentCargoLoad * CURRENTCARGLOAD_PERCENTAGE);
        double requiredFuel = fuelPerKm * distance;

        // 2. Check If Enough
        if (getCurrentFuel() < requiredFuel)
        {
            throw new InsufficientFuelException("Too low. Fuel is not enough.");
        }

        setCurrentFuel(getCurrentFuel() - requiredFuel);
        System.out.println("Flight successful. Consumed: " + requiredFuel);
    }

    @Override
    public boolean performCheck()
    {
        return currentCargoLoad <= maxCargoWeight;
    }

    public double getRevenueFormula()
    {
        return (currentCargoLoad * 1.5);
    }

    public double getMaxCargoWeight()
    {
        return maxCargoWeight;
    }

    public void setMaxCargoWeight(double maxCargoWeight)
    {
        if (maxCargoWeight < 0)
        {
            throw new IllegalArgumentException("maxCargoWeight cannot be less than 0");
        }

        this.maxCargoWeight = maxCargoWeight;
    }

    public double getCurrentCargoLoad()
    {
        return currentCargoLoad;
    }

    public void setCurrentCargoLoad(double currentCargoLoad)
    {
        if (currentCargoLoad < 0)
        {
            throw new IllegalArgumentException("currentCargoLoad cannot be less than 0");
        }

        this.currentCargoLoad = currentCargoLoad;
    }
}