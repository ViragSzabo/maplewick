package implementation.week14.cybernetic;

public abstract class Robot implements Diagnostic
{
    private String serialNumber;
    private double batteryLevel; // 0 - 100
    private boolean isActive;

    public Robot(String serialNumber)
    {
        this.serialNumber = serialNumber;
        setBatteryLevel(100);
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
        return batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel)
    {
        if (batteryLevel < 0 || batteryLevel > 100)
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