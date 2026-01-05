package implementation.week8.NuclearPowerplant.Fuel;

import implementation.week8.NuclearPowerplant.Reactor.SplitResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StendaaniumTest
{
    private Stendaanium stendaanium;

    @BeforeEach
    void setUp()
    {
        this.stendaanium = new Stendaanium();
    }

    @Test
    void split_decreaseRemainPercentage_whenTempIsAvgOrHigh()
    {
        int time = 10;
        int temp = 100;

        double before = stendaanium.getPercentageLeft();

        try
        {
            stendaanium.split(time, temp);
        }
        catch (MeltdownException e)
        {
            throw new RuntimeException(e);
        }

        double expectedDecrease = 0.00007 * temp * time + 0.0004;
        double after = stendaanium.getPercentageLeft();

        assertEquals(before - expectedDecrease, after, 0.00001);
    }

    @Test
    void split_doesNotDecreaseRemainPercentage_whenTempIsLow()
    {
        int time = 10;
        int temp = 40;

        double before = stendaanium.getPercentageLeft();

        try
        {
            stendaanium.split(time, temp);
        }
        catch (MeltdownException e)
        {
            throw new RuntimeException(e);
        }

        double after = stendaanium.getPercentageLeft();

        assertEquals(before, after);
    }
}