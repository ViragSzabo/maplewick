package implementation.week4.Implementation.Hotel.Hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HousekeepingTest {
    Housekeeping housekeeping;

    @BeforeEach
    void setUp() {
        this.housekeeping = new Housekeeping();
    }

    @Test
    void getActivityList() {
        housekeeping.addActivity("Eat");
        housekeeping.addActivity("Drink");
        housekeeping.addActivity("Hiking");
        assertEquals(3, housekeeping.getActivityList().size());
    }

    @Test
    void setActivityList() {
        housekeeping.setActivityList(new ArrayList<String>());
        assertEquals(0, housekeeping.getActivityList().size());
    }

    @Test
    void addActivity() {
        housekeeping.addActivity("Test");
        assertEquals(1, housekeeping.getActivityList().size());
    }
}