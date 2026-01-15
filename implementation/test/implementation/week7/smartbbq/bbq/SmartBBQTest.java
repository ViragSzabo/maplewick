package implementation.week7.smartbbq.bbq;

import implementation.week7.smartbbq.fridge.Fridge;
import implementation.week7.smartbbq.fridge.FridgeIsEmptyException;
import implementation.week7.smartbbq.fridge.NoMoreFoodException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartBBQTest
{
    private Fridge fridge;

    @BeforeEach
    void setUp()
    {
        this.fridge = Fridge.getInstance();
        fridge.clear();
    }

    @Test
    public void testGetNextMeat_SearchForMeat_Null() throws FridgeIsEmptyException, NoMoreFoodException
    {

    }
}