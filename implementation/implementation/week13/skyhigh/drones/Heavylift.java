package implementation.week13.skyhigh.drones;

import implementation.week13.skyhigh.exceptions.CrashException;
import implementation.week13.skyhigh.services.DeliveryResult;

public class Heavylift extends Drone
{
    private static final double DISTANCE_WEAR_PERCENTAGE = 100.0;
    private static final double CRITICAL_WEIGHT = 20.0;
    private static final int CRITICAL_TIME = 60;
    private static final int SHORT_FLIGHT_LIMIT = 10;

    private static final double FLAT_CONSUMPTION_SHORT_FLIGHT = 1.0;
    private static final double CONSUMPTION_FACTOR = 0.05;
    private static final double CONSUMPTION_BASE = 0.2;

    public Heavylift()
    {
        super();
    }

    @Override
    public DeliveryResult delivery(double weight, double time) throws CrashException
    {
        // 1. Safety Checks
        safetyCheck(weight, time);

        // 2. Battery Update
        updateBattery(weight, time);

        // 3. Physics Calculation
        double distance = getDistance(weight, time);
        double wear = getWear(weight, time);

        return new DeliveryResult(distance, wear);
    }

    @Override
    public double getBatteryConsumption(double time, double weight)
    {
        if (time <= SHORT_FLIGHT_LIMIT)
        {
            return FLAT_CONSUMPTION_SHORT_FLIGHT;
        }
        else
        {
            return (CONSUMPTION_FACTOR * weight * time) * CONSUMPTION_BASE;
        }
    }

    @Override
    public double getDistance(double weight, double time) throws CrashException
    {
        return time * 0.5;
    }

    @Override
    public double getWear(double weight, double time) throws CrashException
    {
        return (weight * time) / DISTANCE_WEAR_PERCENTAGE;
    }

    private void safetyCheck(double weight, double time) throws CrashException
    {
        if (time > CRITICAL_TIME && weight > CRITICAL_WEIGHT)
        {
            throw new CrashException("Heavylift Unsafe: Long flight with too heavy lift!");
        }
    }

    private void updateBattery(double weight, double time)
    {
        setBatteryLevel(getBatteryConsumption(weight, time));
    }
}