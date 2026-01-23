package implementation.week14.galactic.ships;

import implementation.week14.galactic.enums.MissionType;
import implementation.week14.galactic.exceptions.InsufficientFuelException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FighterTest
{
    private Fighter fighter;

    @BeforeEach
    void setUp()
    {
        this.fighter = new Fighter("Red Leader", 2);
    }

    @Test
    void performMission_checkFuelLevel_decrease20() throws InsufficientFuelException
    {
        // Act
        this.fighter.performMission(MissionType.BATTLE);

        // Assert
        assertEquals(80, this.fighter.getFuelLevel());
    }

    @Test
    void performMission_checkTorpedoCount_decrease1() throws InsufficientFuelException
    {
        // Act
        this.fighter.performMission(MissionType.BATTLE);

        // Assert
        assertEquals(1, this.fighter.getTorpedoCount());
    }

    @Test
    void performMission_checkWrongMission_throwException()
    {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> this.fighter.performMission(MissionType.EXPLORATION));
    }

    @Test
    void performMission_checkFuelLevelNotEnough_throwException() throws InsufficientFuelException
    {
        // Act
        this.fighter.setFuelLevel(1);

        // Assert
        assertThrows(InsufficientFuelException.class, () -> this.fighter.performMission(MissionType.BATTLE));
    }
}