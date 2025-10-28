package implementation.week10.QuickMorningSprints.Tuesday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrillTest {
    Grill g;

    @BeforeEach
    void setUp() {
        this.g = new Grill(25);
    }

    @Test
    void getTemperature() {
        assertEquals(25, g.getTemperature());

        g.setTemperature(75);
        assertEquals(75, g.getTemperature());
    }

    @Test
    void increaseTemperature() {
        try {
            g.increaseTemperature(5);
            assertEquals(30, g.getTemperature());
        } catch (WARNING e) {
            System.err.println(e.getMessage());
        }
    }
}