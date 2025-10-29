package implementation.week11.CelestialOrchestra;

import implementation.week11.CelestialOrchestra.Celestial.CelestialBody;
import implementation.week11.CelestialOrchestra.Celestial.Moon;
import implementation.week11.CelestialOrchestra.Enums.Tone;
import implementation.week11.CelestialOrchestra.Exceptions.OverchargeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConductorTest {
    Conductor c;
    CelestialBody moon;

    @BeforeEach
    void setUp() {
        this.c = new Conductor();
        this.moon = new Moon("MoonCake", Tone.SOFT);
    }

    @Test
    void addBody() {
        assertEquals(0, c.getCurrentOrchestra().size());
        c.addBody(moon);
        assertEquals(1, c.getCurrentOrchestra().size());
        assertTrue(c.getCurrentOrchestra().contains(moon));
        c.removeBody(moon);
        assertTrue(c.getCurrentOrchestra().isEmpty());
        assertFalse(c.getCurrentOrchestra().contains(moon));
    }

    @Test
    void orchestrate() {
        c.addBody(moon);
        assertTrue(c.getCurrentOrchestra().contains(moon));
        try {
            c.orchestrate();
        } catch (OverchargeException e) {
            throw new RuntimeException(e);
        }
    }
}