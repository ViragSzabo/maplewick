package implementation.week14.grandhotel.room;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuiteTest
{
    private Suite suite;
    private Suite suite2;

    @BeforeEach
    void setUp()
    {
        this.suite = new Suite(10, 50, true, 2, 100);
        this.suite2 = new Suite(10, 50, true, 5, 100);
    }

    @Test
    void calculateBill_checkFor2NightsFor2_expected500()
    {
        assertEquals(500, suite.calculateBill(2));
    }

    @Test
    void calculateBill_checkFor0NightsFor2_expected0()
    {
        assertEquals(0, suite.calculateBill(0));
    }

    @Test
    void calculateBill_checkFor5NightsFor2_expected1250()
    {
        assertEquals(1250, suite.calculateBill(5));
    }

    @Test
    void calculateBill_checkFor2NightsFor5_expected650()
    {
        assertEquals(650, suite2.calculateBill(2));
    }

    @Test
    void cleanRoom_checkCleanliness_100()
    {
        suite2.setBooked(true);
        suite2.calculateBill(2);
        suite2.setBooked(false);
        suite2.cleanRoom();

        assertEquals(100, suite2.getCleanlinessScore());
    }
}