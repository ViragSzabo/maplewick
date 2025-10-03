package implementation.week4.Implementation.Airport.Luggage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuggageTest {
    private Luggage luggage1;
    private Luggage luggage2;

    @BeforeEach
    void setUp() {
        this.luggage1 = new Luggage(15.0, LuggageType.CARRY_ON);
        this.luggage2 = new Luggage(25.0, LuggageType.HOLD);
    }

    @Test
    void getWeight() {
        System.out.println("Luggage 1: " + luggage1.getWeight());
        System.out.println("Luggage 2: " + luggage2.getWeight());

        assertEquals(15.0, this.luggage1.getWeight(), 0);
        assertEquals(25.0, this.luggage2.getWeight(), 0);
    }

    @Test
    void getType() {
        System.out.println("Luggage 1: " + luggage1.getType());
        System.out.println("Luggage 2: " + luggage2.getType());

        assertEquals(LuggageType.CARRY_ON, this.luggage1.getType());
        assertEquals(LuggageType.HOLD, this.luggage2.getType());
    }

    @Test
    void setWeight() {
        System.out.println("Luggage 1: " + luggage1.getWeight());
        System.out.println("Luggage 2: " + luggage2.getWeight());

        this.luggage1.setWeight(25.0);
        assertEquals(25.0, this.luggage1.getWeight(), 0);

        this.luggage2.setWeight(15.0);
        assertEquals(15.0, this.luggage2.getWeight(), 0);

        System.out.println("Luggage 1: " + luggage1.getWeight());
        System.out.println("Luggage 2: " + luggage2.getWeight());
    }

    @Test
    void setType() {
        System.out.println("Luggage 1: " + luggage1.getType());
        System.out.println("Luggage 2: " + luggage2.getType());

        this.luggage2.setType(LuggageType.CARRY_ON);
        assertEquals(LuggageType.CARRY_ON, this.luggage2.getType());

        this.luggage1.setType(LuggageType.HOLD);
        assertEquals(LuggageType.HOLD, this.luggage1.getType());

        System.out.println("Luggage 1: " + luggage1.getType());
        System.out.println("Luggage 2: " + luggage2.getType());
    }
}