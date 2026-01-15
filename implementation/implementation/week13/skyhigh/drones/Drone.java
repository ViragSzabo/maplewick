package implementation.week13.skyhigh.drones;

import implementation.week13.skyhigh.exceptions.CrashException;
import implementation.week13.skyhigh.services.DeliveryResult;

public abstract class Drone
{
    private static final int INITIAL_BATTERY_LEVEL = 100;

    private double batteryLevel;

    public Drone()
    {
        this.batteryLevel = INITIAL_BATTERY_LEVEL;
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
    public abstract double getBatteryConsumption(double time, double weight) throws CrashException;
    public abstract double getDistance(double weight, double time) throws CrashException;
    public abstract double getWear(double weight, double time) throws CrashException;
    public abstract DeliveryResult delivery(double weight, double time) throws CrashException;
}