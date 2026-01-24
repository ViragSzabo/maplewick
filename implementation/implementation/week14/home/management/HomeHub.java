package implementation.week14.home.management;

import implementation.week14.home.devices.SmartDevice;
import implementation.week14.home.exceptions.DeviceOffException;
import implementation.week14.home.exceptions.ItemNotFoundException;
import implementation.week14.home.exceptions.LowBatteryException;

import java.util.HashSet;

public class HomeHub
{
    private HashSet<SmartDevice> devices;

    public HomeHub()
    {
        this.devices = new HashSet<>();
    }

    public void activateRoutine()
    {
        for (SmartDevice device : this.devices)
        {
            device.setOn(true);
            checkPerformingTask(device);
            System.out.println("Device " + device.getDeviceName() + " activated.");
        }
    }

    public HashSet<SmartDevice> getDevices()
    {
        return this.devices;
    }

    public void addDevice(SmartDevice device)
    {
        checkIfDeviceNull(device);
        this.devices.add(device);
    }

    public void removeDevice(SmartDevice device)
    {
        checkIfDeviceNull(device);
        this.devices.remove(device);
    }

    private static void checkPerformingTask(SmartDevice device)
    {
        try
        {
            device.performTask();
        }
        catch (DeviceOffException | LowBatteryException | ItemNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static void checkIfDeviceNull(SmartDevice device)
    {
        if (device == null)
        {
            throw new IllegalArgumentException("WARNING: Device is null!");
        }
    }
}