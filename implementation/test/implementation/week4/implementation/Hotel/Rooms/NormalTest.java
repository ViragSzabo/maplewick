package implementation.week4.implementation.Hotel.Rooms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalTest {
    Normal room;

    @BeforeEach
    void setUp() {
        this.room = new Normal(20);
    }

    @Test
    void calculatePrice() {
        double expectedPrice = 20 * 10; // €10 per night per area
        assertEquals(expectedPrice, room.calculatePrice());
    }
}