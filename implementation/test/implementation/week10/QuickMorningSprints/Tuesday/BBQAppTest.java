package implementation.week10.QuickMorningSprints.Tuesday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BBQAppTest {
    BBQApp app;

    @BeforeEach
    void setUp() {
        this.app = new BBQApp(new Grill(25));
    }

    @Test
    void getGrill() {
        assertEquals(25, this.app.getGrill().getTemperature());
    }
}