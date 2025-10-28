package implementation.week10.QuickMorningSprints.Wednesday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NuclearPowerPlantTest {
    NuclearPowerPlant plant;
    FissionReactor reactor1;
    FusionReactor reactor2;

    @BeforeEach
    void setUp() {
        this.plant = new NuclearPowerPlant();
        this.reactor1 = new FissionReactor();
        this.reactor2 = new FusionReactor();
    }

    @Test
    void getReactors() {
        this.plant.addReactor(this.reactor1);
        this.plant.addReactor(this.reactor2);
        assertEquals(2, this.plant.getReactors().size());
    }
}