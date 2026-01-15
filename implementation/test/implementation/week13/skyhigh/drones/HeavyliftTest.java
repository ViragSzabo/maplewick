package implementation.week13.skyhigh.drones;

import implementation.week13.skyhigh.exceptions.CrashException;
import implementation.week13.skyhigh.services.DeliveryResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeavyLiftTest {

    private Heavylift heavyLift;

    @BeforeEach
    void setUp()
    {
        this.heavyLift = new Heavylift();
    }

    @Test
    void deliverPackage_consumesOnePercent_whenTimeUnder10Minutes() throws CrashException
    {
        // Arrange
        double weight = 50.0;
        double time = 9.0;

        // Act
        heavyLift.delivery(weight, time);

        // Assert
        assertEquals(4.5, heavyLift.getBatteryLevel());
    }

    @Test
    void deliverPackage_calculatesWearCorrectly() throws CrashException
    {
        // Arrange
        double weight = 50.0;
        double time = 20.0;

        // Act
        DeliveryResult result = heavyLift.delivery(weight, time);

        // Assert
        assertEquals(10.0, result.getWearPercentage(), 0.001);
    }
}