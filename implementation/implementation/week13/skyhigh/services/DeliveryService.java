package implementation.week13.skyhigh.services;

import implementation.week13.skyhigh.drones.Heavylift;
import implementation.week13.skyhigh.drones.Speedster;
import implementation.week13.skyhigh.exceptions.CrashException;

public class DeliveryService
{
    private final DronePort port;
    private final StatisticsServer server;
    private final MaintenanceDepot depot;

    public DeliveryService()
    {
        this.port = new DronePort();
        this.server = new StatisticsServer();
        this.depot = new MaintenanceDepot();

        this.port.addDrone(new Speedster());
        this.port.addDrone(new Heavylift());
    }

    public double perform(double weight, double time) throws CrashException
    {
        // 1. Fly the mission
        DeliveryResult result = this.port.deliveryResult(weight, time);

        // 2. Log Statistics
        this.server.logDistance(result.getDistanceKm());

        // 3. Service the motor and return the cost
        return this.depot.service(result.getWearPercentage());
    }
}