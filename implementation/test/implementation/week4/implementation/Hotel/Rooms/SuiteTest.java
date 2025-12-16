package implementation.week4.implementation.Hotel.Rooms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuiteTest {
    Suite jacuzziSuite;
    Suite suite;

    @BeforeEach
    void setUp() {
        this.jacuzziSuite = new Suite(30, true); // Suite with jacuzzi
        this.suite = new Suite(30, false);;
    }

    @Test
    void calculatePriceWithJacuzzi() {
        double expectedPrice = (30 * 15) + 50; // €15 per night per area + €50 for jacuzzi
        assertEquals(expectedPrice, suite.calculatePrice());
    }

    @Test
    void calculatePriceWithoutJacuzzi() {
        double expectedPrice = 30 * 15; // €15 per night per area
        assertEquals(expectedPrice, suite.calculatePrice());
    }
}