package implementation.week14.airport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargoPlaneTest
{
    private CargoPlane cargoPlane;

    @BeforeEach
    void setUp()
    {
        this.cargoPlane = new CargoPlane("KL-1973", 5000, 1000, 5000);
    }

    @Test
    void fly_calculateFuelWithLoad_correctConsumption() throws InsufficientFuelException
    {
        // Arrange
        cargoPlane.setCurrentCargoLoad(50); // 50 kg
        int distance = 100; // 100 km

        // Act
        cargoPlane.fly(distance);

        // Assert
        assertEquals(300, cargoPlane.getCurrentFuel(), 0.1);
    }

    @Test
    void fly_notEnoughFuel_incorrectlyConsumption() throws InsufficientFuelException
    {
        // Arrange
        cargoPlane.setCurrentCargoLoad(100); // 100 kg
        cargoPlane.setCurrentFuel(50);

        // Act & Assert
        assertThrows(InsufficientFuelException.class, () -> cargoPlane.fly(100));
    }
}