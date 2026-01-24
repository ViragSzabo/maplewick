package implementation.week14.home.devices;

import implementation.week14.home.exceptions.DeviceOffException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartLightTest
{
    private SmartLight smartLight;

    @BeforeEach
    void setUp()
    {
        this.smartLight = new SmartLight("Turbulence", 5, 75);
    }

    @Test
    void performTask_successfullyTurnsOn_isOn() throws DeviceOffException
    {
        // Assist
        this.smartLight.setOn(true);

        // Act
        this.smartLight.performTask();

        // Assert
        assertTrue(this.smartLight.isOn());
    }

    @Test
    void performTask_unSuccessfullyTurnsOn_isOnFalse() throws DeviceOffException
    {
        // Assert
        assertThrows(DeviceOffException.class, () -> this.smartLight.performTask());
    }
}