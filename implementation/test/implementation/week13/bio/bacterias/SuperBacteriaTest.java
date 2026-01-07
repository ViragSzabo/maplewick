package implementation.week13.bio.bacterias;

import implementation.week13.bio.main.FermentationResult;
import implementation.week13.bio.status.ContaminationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperBacteriaTest
{
    private SuperBacteria superB;

    @BeforeEach
    void setUp()
    {
        this.superB = new SuperBacteria();
    }

    @Test
    void ferment_doesNotDecreaseVitality_whenSugarBelow50() throws ContaminationException
    {
        // Arrange
        double sugar = 49.0;
        int time = 100;

        // Act & Assert
        assertThrows(ContaminationException.class, () -> superB.ferment(sugar, time));
    }

    @Test
    void ferment_calculatesCorrectOutput_ethanol2500() throws ContaminationException
    {
        // Arrange
        double sugar = 100.0;
        int time = 10;

        // Act
        FermentationResult result = superB.ferment(sugar, time);

        // Assert
        assertEquals(5000.0, result.rawEthanolMl(), 0.001);
    }

    @Test
    void ferment_calculatesCorrectOutput_waste200() throws ContaminationException
    {
        // Arrange
        double sugar = 100.0;
        int time = 10;

        // Act
        FermentationResult result = superB.ferment(sugar, time);

        // Assert
        assertEquals(200.0, result.toxicWasteMg(), 0.001);
    }

    @Test
    void ferment_throwsException_whenSugarAbove100()
    {
        // Arrange
        double sugar = 1001.0;
        int time = 10;

        // Act & Assert
        assertThrows(ContaminationException.class, () -> superB.ferment(sugar, time));
    }
}