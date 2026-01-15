package implementation.week13.skyhigh.services;

public class StatisticsServer implements Statusable
{
    private static final double INITIAL_VALUES = 0.0;
    private static final double MAX_FLEET_DISTANCE = 10000.0;

    private double totalFleetDistance;

    public StatisticsServer()
    {
        setTotalFleetDistance(INITIAL_VALUES);
    }

    public double getTotalFleetDistance()
    {
        return totalFleetDistance;
    }

    public void setTotalFleetDistance(double totalFleetDistance)
    {
        if (totalFleetDistance < 0)
        {
            throw new IllegalArgumentException("Total fleet distance cannot be negative");
        }

        this.totalFleetDistance = totalFleetDistance;
    }

    public void logDistance(double distanceKm)
    {
        this.totalFleetDistance += distanceKm;
    }

    @Override
    public StatusColours checkStatus()
    {
        if (this.totalFleetDistance > MAX_FLEET_DISTANCE)
        {
            return StatusColours.RED;
        }

        return StatusColours.GREEN;
    }
}