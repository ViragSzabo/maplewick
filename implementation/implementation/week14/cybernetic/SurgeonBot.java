package implementation.week14.cybernetic;

public class SurgeonBot extends Robot
{
    private static final double MIN_DIFFICULTY = 5.0;

    private double precision; // 0 - 100

    public SurgeonBot(String serialNumber, double precision)
    {
        super(serialNumber);
        setPrecision(precision);
    }

    @Override
    public void performTask() throws LowBatteryException
    {
        operate(MIN_DIFFICULTY);
        System.out.println("Standard surgery");
    }

    private void operate(double difficulty) throws LowBatteryException
    {
        // 1. Calculate
        double cost = difficulty * 2;

        // 2. Check
        if (getBatteryLevel() < cost && !selfCheck())
        {
            throw new LowBatteryException("Low battery");
        }

        // 3. Update
        setBatteryLevel(getBatteryLevel() - cost);
        System.out.println("Task Complete");
    }

    @Override
    public boolean selfCheck()
    {
        return precision > 90;
    }

    public double getPrecision()
    {
        return precision;
    }

    public void setPrecision(double precision)
    {
        if (precision < 0)
        {
            throw new IllegalArgumentException("Precision must be a positive number");
        }

        this.precision = precision;
    }
}