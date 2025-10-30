package implementation.week11.Clockmaker.Clock;

import implementation.week11.Clockmaker.Interface.SyncException;
import implementation.week11.Clockmaker.Interface.Synchronizable;

public class MechanicalClock extends Clock implements Synchronizable {

    /** Constructors */
    public MechanicalClock(String name, ClockType type, int health) {
        super(name, type, health);
    }

    @Override
    public void tick() {
        System.out.println("Mechanical Clock");
    }

    @Override
    public String toString() {
        return getName() + " (" + getHealth() + ")";
    }

    @Override
    public void synchronize(Clock other) throws SyncException {
        if (getHealth() <= 0) {
            throw new SyncException();
        }
        setHealth(getHealth() + other.getHealth() / 2);
    }
}