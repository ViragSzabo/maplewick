package implementation.week14.cybernetic;

public class TransportBot extends Robot
{
    private double maxWeight;
    private double currentLoad;

    public TransportBot(String serialNumber, double maxWeight, double currentLoad)
    {
        super(serialNumber);
    }

    @Override
    public void performTask()
    {
        deliver(10);
    }

    private void deliver(int distance)
    {

    }

    public double getMaxWeight()
    {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight)
    {
        if (maxWeight < 0)
        {
            throw new IllegalArgumentException("maxWeight cannot be negative");
        }

        this.maxWeight = maxWeight;
    }

    public double getCurrentLoad()
    {
        return currentLoad;
    }

    public void setCurrentLoad(double currentLoad)
    {
        if (currentLoad < 0)
        {
            throw new IllegalArgumentException("currentLoad cannot be negative");
        }

        this.currentLoad = currentLoad;
    }
}