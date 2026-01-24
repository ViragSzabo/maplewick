package implementation.week14.home.devices;

import implementation.week14.home.exceptions.DeviceOffException;

public class SmartLight extends SmartDevice
{
    private static final int MAX_BRIGHTNESS_LEVEL = 100;
    private static final int MIN_BRIGHTNESS_LEVEL = 0;

    private int brightness; // 0 - 100

    public SmartLight(String deviceName, double powerCost, int brightness)
    {
        super(deviceName, powerCost);

        setBrightness(brightness);
    }

    @Override
    public void performTask() throws DeviceOffException
    {
        // Check
        checkIfDeviceIsOff();

        // Perform
        System.out.println("Lighting up room at " + this.brightness + "%.");
    }

    public int getBrightness()
    {
        return this.brightness;
    }

    public void setBrightness(int brightness)
    {
        // Check
        checkRequestedBrightness(brightness);

        // Act
        this.brightness = brightness;
    }

    /** HELPER method: Check if device is off */
    private void checkIfDeviceIsOff() throws DeviceOffException
    {
        if (!isOn())
        {
            throw new DeviceOffException("The smart light is not on!");
        }
    }

    /** HELPER method: Check if brightness level is between 0 - 100 */
    private static void checkRequestedBrightness(int brightness)
    {
        if (brightness < MIN_BRIGHTNESS_LEVEL || brightness > MAX_BRIGHTNESS_LEVEL)
        {
            throw new IllegalArgumentException("Brightness must be a positive integer, but not larger than 100!");
        }
    }
}