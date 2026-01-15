package implementation.week13.skyhigh.services;

import implementation.week13.skyhigh.drones.Drone;
import implementation.week13.skyhigh.exceptions.CrashException;

import java.util.ArrayList;
import java.util.List;

public class DronePort implements Statusable
{
    private List<Drone> drones;

    public DronePort()
    {
        this.drones = new ArrayList<>();
    }

    public List<Drone> getDrones()
    {
        return this.drones;
    }

    public void addDrone(Drone drone)
    {
        if (this.drones.contains(drone))
        {
            throw new IllegalArgumentException("Drone already exists");
        }

        if (drone == null)
        {
            throw new IllegalArgumentException("Drone is null");
        }

        this.drones.add(drone);
    }

    public void removeDrone(Drone drone)
    {
        if (!this.drones.contains(drone))
        {
            throw new IllegalArgumentException("Drone does not exist");
        }

        this.drones.remove(drone);
    }

    public DeliveryResult deliveryResult(double weight, double time) throws CrashException
    {
        if (this.drones.isEmpty())
        {
            throw new IllegalArgumentException("No drones available in port.");
        }

        return this.drones.getFirst().delivery(weight, time);
    }

    @Override
    public StatusColours checkStatus()
    {
        for (Drone drone : this.drones)
        {
            if (drone.getBatteryLevel() < 20.0)
            {
                return StatusColours.ORANGE;
            }
        }
        return StatusColours.GREEN;
    }
}