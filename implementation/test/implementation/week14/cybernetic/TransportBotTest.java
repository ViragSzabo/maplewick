package implementation.week14.cybernetic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportBotTest
{
    private TransportBot bot;

    @BeforeEach
    void setUp()
    {
        this.bot = new TransportBot("SE-1", 50, 25);
    }

    @Test
    public void checkDeliver_Within10KM_Succeed() throws LowBatteryException
    {
        this.bot.performTask();
        assertEquals(80, this.bot.getBatteryLevel());
    }

    @Test
    public void checkDeliver_WithCurrentLoad_UnSuccessful() throws LowBatteryException
    {
        this.bot.setCurrentLoad(1);
        assertThrows(LowBatteryException.class, () -> this.bot.performTask());
    }
}