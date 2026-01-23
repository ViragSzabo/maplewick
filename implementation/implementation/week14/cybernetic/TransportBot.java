package implementation.week14.cybernetic;

public class TransportBot extends Robot implements Diagnostic
{
    private static final double DISTANCE_PERCENTAGE = 0.1;
    private static final double LOAD_PERCENTAGE = 0.05;

    private double maxWeight;
    private double currentLoad;

    public TransportBot(String serialNumber, double maxWeight, double currentLoad)
    {
        super(serialNumber);
        setMaxWeight(maxWeight);
        setCurrentLoad(currentLoad);
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
        if (getBatteryLevel() < cost)
        {
            throw new LowBatteryException("Low battery");
        }

        // 3. Update
        setBatteryLevel(getBatteryLevel() - cost);
        System.out.println("Delivery succeeded!");
    }

    @Override
    public boolean selfCheck()
    {
        return this.currentLoad == 0;
    }

    public double getMaxWeight()
    {
        return this.maxWeight;
    }

    public void setMaxWeight(double maxWeight)
    {
        if (maxWeight < 0.0)
        {
            throw new IllegalArgumentException("maxWeight cannot be negative");
        }

        this.maxWeight = maxWeight;
    }

    public double getCurrentLoad()
    {
        return this.currentLoad;
    }

    public void setCurrentLoad(double currentLoad)
    {
        if (currentLoad < 0.0)
        {
            throw new IllegalArgumentException("currentLoad cannot be negative");
        }

        this.currentLoad = currentLoad;
    }
}