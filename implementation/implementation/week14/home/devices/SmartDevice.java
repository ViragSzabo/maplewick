package implementation.week14.home.devices;

import implementation.week14.home.exceptions.DeviceOffException;
import implementation.week14.home.exceptions.ItemNotFoundException;
import implementation.week14.home.exceptions.LowBatteryException;

public abstract class SmartDevice
{
    private String deviceName;
    private boolean isOn;
    private double powerCost;

    public SmartDevice(String deviceName, double powerCost)
    {
        setDeviceName(deviceName);
        setPowerCost(powerCost);
        this.isOn = false;
    }

    public abstract void performTask() throws DeviceOffException, LowBatteryException, ItemNotFoundException;

    public String getDeviceName()
    {
        return this.deviceName;
    }

    public void setDeviceName(String deviceName)
    {
        if (deviceName == null)
        {
            throw new IllegalArgumentException("Device name cannot be null.");
        }

        this.deviceName = deviceName;
    }

    public double getPowerCost()
    {
        return this.powerCost;
    }

    public void setPowerCost(double powerCost)
    {
        if (powerCost < 0)
        {
            throw new IllegalArgumentException("Power cost cannot be negative.");
        }

        this.powerCost = powerCost;
    }

    public boolean isOn()
    {
        return this.isOn;
    }

    public void setOn(boolean on)
    {
        this.isOn = on;
    }
}