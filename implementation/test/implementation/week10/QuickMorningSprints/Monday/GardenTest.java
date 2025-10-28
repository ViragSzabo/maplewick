package implementation.week10.QuickMorningSprints.Monday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GardenTest {
    Plant rose;
    Plant basilicum;
    Garden garden;

    @BeforeEach
    void setUp() {
        this.rose = new Plant("Rose", 2, 6);
        this.basilicum = new Plant("Basilicum", 3, 6);
        this.garden = new Garden();
    }

    @Test
    void getPlants() {
        assertTrue(this.garden.getPlants().isEmpty());
    }

    @Test
    void addPlant() {
        garden.addPlant(this.rose);
        garden.addPlant(this.basilicum);
        assertEquals(2, garden.getPlants().size());
    }

    @Test
    void removePlant() {
        garden.addPlant(this.rose);
        garden.addPlant(this.basilicum);
        assertEquals(2, garden.getPlants().size());

        garden.removePlant(this.basilicum);
        assertEquals(1, garden.getPlants().size());

        garden.removePlant(this.rose);
        assertEquals(0, garden.getPlants().size());
    }

    @Test
    void waterAll() {
        garden.addPlant(this.rose);
        garden.addPlant(this.basilicum);
        garden.waterAll();
        garden.harvest();

        assertTrue(garden.getPlants().get(0).isHarvestable());
        assertTrue(garden.getPlants().get(1).isHarvestable());
    }
}