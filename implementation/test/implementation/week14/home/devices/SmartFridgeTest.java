package implementation.week14.home.devices;

import implementation.week14.home.enums.Content;
import implementation.week14.home.exceptions.ItemNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartFridgeTest
{
    private SmartFridge fridge;

    @BeforeEach
    void setUp()
    {
        this.fridge = new SmartFridge("Arthur", 25);
    }

    @Test
    void testPerformTask_WithSandwich_Successfully() throws ItemNotFoundException
    {
        // Assist
        this.fridge.addContent(Content.SANDWICH);

        // Act
        this.fridge.performTask();

        // Assert
        assertFalse(this.fridge.getContents().contains(Content.SANDWICH));
    }

    @Test
    void testPerformTask_WithNoContent_ThrowsException() throws ItemNotFoundException
    {
        // Act & Assert
        assertThrows(ItemNotFoundException.class, () -> this.fridge.performTask());
    }
}