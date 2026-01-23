package implementation.week14.galactic.ships;

import implementation.week14.galactic.exceptions.IllegalCargoException;
import implementation.week14.galactic.exceptions.InsufficientFuelException;
import implementation.week14.galactic.enums.MissionType;

public abstract class Starship
{
    private String callSign;
    private double fuelLevel; // 0 - 100
    private int shieldStrength; // 0 - 100

    public Starship(String callSign)
    {
        setCallSign(callSign);
        setFuelLevel(100);
        setShieldStrength(100);
    }

    public abstract void performMission(MissionType mission) throws InsufficientFuelException, IllegalCargoException;

    public String getCallSign()
    {
        return this.callSign;
    }

    public void setCallSign(String callSign)
    {
        if (callSign == null)
        {
            throw new IllegalArgumentException("callSign cannot be null");
        }

        this.callSign = callSign;
    }

    public double getFuelLevel()
    {
        return this.fuelLevel;
    }

    public void setFuelLevel(double fuelLevel)
    {
        if (fuelLevel <= 0)
        {
            throw new IllegalArgumentException("fuelLevel cannot be less or exactly 0");
        }

        this.fuelLevel = fuelLevel;
    }

    public int getShieldStrength()
    {
        return this.shieldStrength;
    }

    public void setShieldStrength(int shieldStrength)
    {
        if (shieldStrength <= 0)
        {
            throw new IllegalArgumentException("shieldStrength cannot be less or exactly 0");
        }

        this.shieldStrength = shieldStrength;
    }
}