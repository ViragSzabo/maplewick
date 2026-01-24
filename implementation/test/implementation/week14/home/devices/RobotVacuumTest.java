package implementation.week14.home.devices;

import implementation.week14.home.exceptions.LowBatteryException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotVacuumTest
{
    private RobotVacuum robotVacuum;

    @BeforeEach
    void setUp()
    {
        this.robotVacuum = new RobotVacuum("The Killa", 10, 50);
    }

    @Test
    void performTask_checkBatteryLevel_decrease15() throws LowBatteryException
    {
        // Act
        this.robotVacuum.performTask();

        // Assert
        assertEquals(35, this.robotVacuum.getBatteryLevel());
    }

    @Test
    void performTask_checkBatteryLevel_throwsException()
    {
        // Act & Assert
        this.robotVacuum.setBatteryLevel(10);
        assertThrows(LowBatteryException.class, () -> this.robotVacuum.performTask());
    }

    @Test
    void charge_checkBatteryLevel_increase5() throws LowBatteryException
    {
        // Act
        this.robotVacuum.setBatteryLevel(85);
        this.robotVacuum.charge(5);

        // Assert
        assertEquals(90, this.robotVacuum.getBatteryLevel());
    }

    @Test
    void charge_checkBatteryLevel_increaseWithNegative()
    {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> this.robotVacuum.charge(-2));
    }
}