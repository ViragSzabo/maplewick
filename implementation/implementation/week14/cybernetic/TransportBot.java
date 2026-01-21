package implementation.week14.cybernetic;

public class TransportBot extends Robot
{
    private static final double DISTANCE_PERCENTAGE = 100;
    private static final double LOAD_PERCENTAGE = 0.05;

    private double maxWeight;
    private double currentLoad;

    public TransportBot(String serialNumber, double maxWeight, double currentLoad)
    {
        super(serialNumber);
    }

    @Override
    public void performTask() throws LowBatteryException
    {
        deliver(10);
    }

    private void deliver(int distance) throws LowBatteryException
    {
        // 1. Calculate
        double cost = (DISTANCE_PERCENTAGE * distance) + (LOAD_PERCENTAGE * getCurrentLoad());

        // 2. Check
        if (!selfCheck() && getBatteryLevel() < cost)
        {
            throw new LowBatteryException("Low battery");
        }

        // 3. Update
        setBatteryLevel(getBatteryLevel() - (distance * 2));
        System.out.println("Surgery succeeded!");
    }

    @Override
    public boolean selfCheck()
    {
        return currentLoad == 0;
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