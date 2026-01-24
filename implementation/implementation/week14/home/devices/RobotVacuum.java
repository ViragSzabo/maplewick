package implementation.week14.home.devices;

import implementation.week14.home.exceptions.LowBatteryException;
import implementation.week14.home.interfaces.Rechargeable;

public class RobotVacuum extends SmartDevice implements Rechargeable
{
    private static final int REQUIRED_BATTERY_LEVEL = 15;
    private static final int MAX_BATTERY_LEVEL = 100;
    private static final int MIN_BATTERY_LEVEL = 0;

    private int batteryLevel;  // 0 - 100

    public RobotVacuum(String deviceName, double powerCost, int batteryLevel)
    {
        super(deviceName, powerCost);

        setBatteryLevel(batteryLevel);
    }

    @Override
    public void performTask() throws LowBatteryException
    {
        // Calculate
        int usedBatteryLevel = getBatteryLevel() - REQUIRED_BATTERY_LEVEL;

        // Check
        checkIfBatteryNotTooLow(usedBatteryLevel);
        setBatteryLevel(usedBatteryLevel);

        // Perform
        System.out.println("Cleaning floors...");
    }

    @Override
    public void charge(int percentage)
    {
        // Check
        checkBatteryLevel(percentage);

        // Update
        setBatteryLevel(getBatteryLevel() + percentage);
    }

    @Override
    public int getBatteryLevel()
    {
        return this.batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel)
    {
        checkBatteryLevel(batteryLevel);
        this.batteryLevel = batteryLevel;
    }

    /** HELPER method: Check if battery level is not lower than the requested used one */
    private void checkIfBatteryNotTooLow(int usedBatteryLevel) throws LowBatteryException
    {
        if (batteryLevel < usedBatteryLevel)
        {
            throw new LowBatteryException("The battery is too low!");
        }
    }

    /** HELPER method: Check if battery level is between 0 - 100 */
    private static void checkBatteryLevel(int batteryLevel)
    {
        if (batteryLevel < MIN_BATTERY_LEVEL || batteryLevel > MAX_BATTERY_LEVEL)
        {
            throw new IllegalArgumentException("Battery level must be a positive integer, but not larger than 100!");
        }
    }
}