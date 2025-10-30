package implementation.week11.Clockmaker.Clock;

import implementation.week11.Clockmaker.Interface.SyncException;
import implementation.week11.Clockmaker.Interface.Synchronizable;

public class DreamClock extends Clock implements Synchronizable {

    /** Constructors */
    public DreamClock(String name, ClockType type, int health) {
        super(name, type, health);
    }

    @Override
    public void tick() {
        System.out.println("Dream Clock");
    }

    @Override
    public String toString() {
        return getName() + " (" + getHealth() + ")";
    }

    @Override
    public void synchronize(Clock other) throws SyncException {
        if (other.getHealth() < 3) {
            throw new SyncException();
        }
        setHealth(getHealth() + 1);
        System.out.println(getName() + " syncs softly with " + other.getName());
    }
}