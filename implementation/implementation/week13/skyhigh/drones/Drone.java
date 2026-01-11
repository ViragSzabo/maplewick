package implementation.week13.skyhigh.drones;

import implementation.week13.skyhigh.exceptions.CrashException;

public abstract class Drone
{
    private static final int INITIAL_BATTERY_LEVEL = 100;

    private double time;
    private double weight;
    private double batteryLevel;

    public Drone(double time, double weight)
    {
        this.batteryLevel = INITIAL_BATTERY_LEVEL;
        setTime(time);
        setWeight(weight);
    }

    public double getBatteryLevel()
    {
        return this.batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel)
    {
        if (batteryLevel < 0)
        {
            throw new IllegalArgumentException("Battery level must be a positive number");
        }

        this.batteryLevel = batteryLevel;
    }

    public double getTime()
    {
        return time;
    }

    public void setTime(double time)
    {
        if (time < 0)
        {
            throw new IllegalArgumentException("Time must be a positive number");
        }

        this.time = time;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        if (weight < 0)
        {
            throw new IllegalArgumentException("Weight must be a positive number");
        }

        this.weight = weight;
    }

    public abstract double getBatteryConsumption(double time, double weight) throws CrashException;
}