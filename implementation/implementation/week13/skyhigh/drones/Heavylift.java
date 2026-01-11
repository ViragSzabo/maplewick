package implementation.week13.skyhigh.drones;

import implementation.week13.skyhigh.exceptions.CrashException;
import implementation.week13.skyhigh.services.FlightService;

public class Heavylift extends Drone implements FlightService
{
    public Heavylift(double time, double weight)
    {
        super(time, weight);
    }

    @Override
    public double getBatteryConsumption(double time, double weight)
    {
        double consumption = 0.0;

        if (time >= 10)
        {
            consumption = (0.05 * weight * time) + 0.002;
        }

        return consumption;
    }

    @Override
    public void calculateFlightPhysics(double weight, double time) throws CrashException
    {
        double distance = 0.0;
        double wear = 0.0;

        if (time > 60 && weight > 20)
        {
            throw new CrashException("The flight is too long and weight is too large.");
        }
        else
        {
            distance = time * 0.5;
            wear = (weight * time) / 100;
        }
    }
}