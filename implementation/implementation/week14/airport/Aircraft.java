package implementation.week14.airport;

public abstract class Aircraft
{
    private String callSign;
    private int fuelCapacity;
    private double currentFuel;

    public Aircraft(String callSign, int fuelCapacity, double currentFuel)
    {
        setCallSign(callSign);
        setFuelCapacity(fuelCapacity);
        setCurrentFuel(currentFuel);
    }

    public abstract void fly(int distance) throws InsufficientFuelException;

    public String getCallSign()
    {
        return callSign;
    }

    public void setCallSign(String callSign)
    {
        if (callSign == null)
        {
            throw new IllegalArgumentException("callSign cannot be null");
        }

        this.callSign = callSign;
    }

    public int getFuelCapacity()
    {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity)
    {
        if (fuelCapacity <= 0)
        {
            throw new IllegalArgumentException("fuelCapacity cannot be less than 0");
        }

        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuel()
    {
        return currentFuel;
    }

    public void setCurrentFuel(double currentFuel)
    {
        if (currentFuel < 0)
        {
            throw new IllegalArgumentException("currentFuel cannot be less than 0");
        }
        else if (currentFuel > fuelCapacity)
        {
            throw new IllegalArgumentException("currentFuel cannot be greater than fuelCapacity");
        }

        this.currentFuel = currentFuel;
    }
}