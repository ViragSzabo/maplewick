package implementation.week13.skyhigh.services;

import implementation.week13.skyhigh.drones.Drone;

import java.util.ArrayList;
import java.util.List;

public class DronePort
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
}