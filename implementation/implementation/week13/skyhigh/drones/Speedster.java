package implementation.week13.skyhigh.drones;

import implementation.week13.skyhigh.exceptions.CrashException;
import implementation.week13.skyhigh.services.FlightService;

public class Speedster extends Drone implements FlightService
{
    public Speedster(double time, double weight)
    {
        super(time, weight);
    }

    @Override
    public double getBatteryConsumption(double time, double weight) throws CrashException
    {
        double consumption = 0.0;

        if (getBatteryLevel() < 10)
        {
            throw new CrashException("The battery level is too low!");
        }

        consumption = (98.5 * (time / 60));
        consumption -= this.getBatteryLevel();

        return consumption;
    }

    @Override
    public void calculateFlightPhysics(double weight, double time) throws CrashException
    {
        double distance, wear = 0.0;

        if (weight < 5) // light load
        {
            distance = time * 1.2;
            wear = weight * 0.5;
        }
        else if (weight >= 5) // heavy load
        {
            distance = time * 0.8;
            wear = weight * 2.0;
        }

        checkOverload(weight);
    }

    private void checkOverload(double weight) throws CrashException
    {
        if (weight > 10)
        {
            throw new CrashException("Package weight is overload!");
        }
    }
}