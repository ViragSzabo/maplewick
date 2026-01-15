package implementation.week13.skyhigh.drones;

import implementation.week13.skyhigh.exceptions.CrashException;
import implementation.week13.skyhigh.services.DeliveryResult;

public class Speedster extends Drone
{
    private static final double MIN_SAFE_BATTERY = 10.0;
    private static final double MAX_WEIGHT_LIMIT = 10.0;
    private static final double LIGHT_LOAD_THRESHOLD = 5.0;
    private static final double CONSUMPTION_PER_MIN = 1.5;

    public Speedster()
    {
        super();
    }

    @Override
    public double getBatteryConsumption(double time, double weight)
    {
        return time * CONSUMPTION_PER_MIN;
    }

    @Override
    public DeliveryResult delivery(double weight, double time) throws CrashException
    {
        // 1. Safety Checks
        safetyCheck(weight);

        // 2. Calculate and Apply Battery Usage
        calculateBatteryUsage(weight, time);

        // 3. Physics Calculation
        double distance = getDistance(weight, time);
        double wear = getWear(weight, time);

        return new DeliveryResult(distance, wear);
    }

    @Override
    public double getDistance(double weight, double time) throws CrashException
    {
        safetyCheck(weight);

        if (weight < LIGHT_LOAD_THRESHOLD) // light load
        {
            return time * 1.2;
        }
        else // heavy load
        {
            return time * 0.8;
        }
    }

    @Override
    public double getWear(double weight, double time) throws CrashException
    {
        safetyCheck(weight);

        if (weight < 5.0) // light load
        {
            return weight * 0.5;
        }
        else // heavy load
        {
            return weight * 2.0;
        }
    }

    private void safetyCheck(double weight) throws CrashException
    {
        if (weight > MAX_WEIGHT_LIMIT)
        {
            throw new CrashException("Speedster Overload: Package weight is more than 10 kg!");
        }
    }

    private void calculateBatteryUsage(double weight, double time) throws CrashException
    {
        double consumption = getBatteryConsumption(time, weight);

        if ((getBatteryLevel() - consumption) < MIN_SAFE_BATTERY)
        {
            throw new CrashException("Speedster Battery Low: Cannot complete the flight!");
        }

        setBatteryLevel(getBatteryLevel() - consumption); // update the battery
    }
}