package implementation.week14.cybernetic;

public abstract class Robot implements Diagnostic
{
    private static final double INITIAL_BATTERY_PERCENTAGE = 100.0;

    private String serialNumber;
    private double batteryLevel; // 0 - 100
    private boolean isActive;

    public Robot(String serialNumber)
    {
        this.serialNumber = serialNumber;
        setBatteryLevel(INITIAL_BATTERY_PERCENTAGE);
        setActive(true);
    }

    public abstract void performTask() throws LowBatteryException;

    public String getSerialNumber()
    {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber)
    {
        if (serialNumber == null)
        {
            throw new IllegalArgumentException("Serial number cannot be null");
        }

        this.serialNumber = serialNumber;
    }

    public double getBatteryLevel()
    {
        return this.batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel)
    {
        if (batteryLevel < 0.0 || batteryLevel > INITIAL_BATTERY_PERCENTAGE)
        {
            throw new IllegalArgumentException("Battery level cannot be negative or above 100");
        }

        this.batteryLevel = batteryLevel;
    }

    public boolean isActive()
    {
        return isActive;
    }

    public void setActive(boolean active)
    {
        isActive = active;
    }
}