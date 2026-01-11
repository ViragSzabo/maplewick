package implementation.week13.skyhigh.services;

import java.util.ArrayList;
import java.util.List;

public class StatisticsServer
{
    private List<DronePort> ports;

    public StatisticsServer()
    {
        this.ports = new ArrayList<>();
    }

    public void addDronePort(DronePort port)
    {
        if (this.ports.contains(port))
        {
            throw new IllegalArgumentException("Drone port already exists");
        }

        if (port == null)
        {
            throw new IllegalArgumentException("Drone port is null");
        }

        this.ports.add(port);
    }

    public void removeDronePort(DronePort port)
    {
        if (!this.ports.contains(port))
        {
            throw new IllegalArgumentException("Drone port does not exist");
        }

        this.ports.remove(port);
    }

    public int totalServiceCost()
    {
        int total = 0;

        return 0;
    }
}