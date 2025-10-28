package implementation.week10.QuickMorningSprints.Monday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlantTest {
    Plant rose;
    Plant basilicum;

    @BeforeEach
    void setUp() {
        this.rose = new Plant("Rose", 2, 0);
        this.basilicum = new Plant("Basilicum", 3, 0);
    }

    @Test
    void isHarvestable() {
        assertFalse(this.rose.isHarvestable());
        assertFalse(this.basilicum.isHarvestable());
    }

    @Test
    void setHarvestable() {
        this.rose.setHarvestable(true);
        this.basilicum.setHarvestable(true);
        assertTrue(this.rose.isHarvestable());
        assertTrue(this.basilicum.isHarvestable());
    }

    @Test
    void getDaysSincePlanted() {
        assertEquals(0, this.rose.getDaysSincePlanted());
        assertEquals(0, this.basilicum.getDaysSincePlanted());
    }

    @Test
    void setDaysSincePlanted() {
        this.rose.setDaysSincePlanted(2);
        this.basilicum.setDaysSincePlanted(2);
        assertEquals(2, this.rose.getDaysSincePlanted());
        assertEquals(2, this.basilicum.getDaysSincePlanted());
    }

    @Test
    void getGrowthRate() {
        assertEquals(2, this.rose.getGrowthRate());
        assertEquals(3, this.basilicum.getGrowthRate());
    }

    @Test
    void setGrowthRate() {
        this.rose.setGrowthRate(1);
        this.basilicum.setGrowthRate(2);
        assertEquals(1, this.rose.getGrowthRate());
        assertEquals(2, this.basilicum.getGrowthRate());
    }

    @Test
    void getName() {
        assertEquals("Rose", this.rose.getName());
        assertEquals("Basilicum", this.basilicum.getName());
    }

    @Test
    void setName() {
        this.rose.setName("Rosemary");
        this.basilicum.setName("Basilicummy");
        assertEquals("Rosemary", this.rose.getName());
        assertEquals("Basilicummy", this.basilicum.getName());
    }
}