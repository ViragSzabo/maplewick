package implementation.week13.skyhigh.services;

public class MaintenanceDepot implements Statusable
{
    private static final double INITIAL_VALUES = 0.0;
    private static final double COST_MULTIPLIER = 15.0;

    private double totalServiceCost;

    public MaintenanceDepot()
    {
        setTotalServiceCost(INITIAL_VALUES);
    }

    public double getTotalServiceCost()
    {
        return totalServiceCost;
    }

    public void setTotalServiceCost(double totalServiceCost)
    {
        if (totalServiceCost < 0.0)
        {
            throw new IllegalArgumentException("TotalServiceCost cannot be negative");
        }

        this.totalServiceCost = totalServiceCost;
    }

    public double service(double wearPercentage)
    {
        double cost = wearPercentage * COST_MULTIPLIER;

        this.totalServiceCost += cost;

        return cost;
    }

    @Override
    public StatusColours checkStatus()
    {
        if (this.totalServiceCost > 2000.0)
        {
            return StatusColours.RED;
        }

        if (this.totalServiceCost >= 1000.0)
        {
            return StatusColours.ORANGE;
        }

        return StatusColours.GREEN;
    }
}