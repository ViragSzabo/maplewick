package implementation.week11.Clockmaker;

import implementation.week11.Clockmaker.Clock.*;
import implementation.week11.Clockmaker.Interface.SyncException;

public class Clockmaker {
    public static void main(String[] args) throws SyncException {
        ClockManager c = new ClockManager();

        LunarClock lun = new LunarClock("lu", ClockType.LUNAR, 3);
        HumanClock hum = new HumanClock("hu", ClockType.HUMAN, 4);
        DreamClock dre = new DreamClock("dr", ClockType.DREAM, 2);
        MechanicalClock mec = new MechanicalClock("me", ClockType.MECHANICAL, 1);

        c.add(lun);
        c.add(hum);
        c.add(dre);
        c.add(mec);

        c.simulateDay();
    }
}