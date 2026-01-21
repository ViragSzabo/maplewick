package implementation.week14.menagerie.creatures;

import implementation.week14.menagerie.exceptions.CreatureExhaustedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoenixTest
{
    private Phoenix phoenix;

    @BeforeEach
    void setUp()
    {
        this.phoenix = new Phoenix("Paula");
    }

    @Test
    void ignite_performMagic_correctly() throws CreatureExhaustedException
    {
        // Act & Assert
        this.phoenix.setEnergyLevel(100);
        this.phoenix.performMagic();
        assertEquals(50, this.phoenix.getEnergyLevel());
    }

    @Test
    void ignite_performMagic_incorrectly() throws CreatureExhaustedException
    {
        // Act & Assert
        this.phoenix.setEnergyLevel(99);
        assertThrows(CreatureExhaustedException.class, () -> this.phoenix.performMagic());
    }

    @Test
    void ignite_performMagic_rebirthCountMovesUp() throws CreatureExhaustedException
    {
        // Act & Assert
        this.phoenix.setEnergyLevel(100);
        this.phoenix.performMagic();
        assertEquals(1, this.phoenix.getRebirthCount());
    }
}