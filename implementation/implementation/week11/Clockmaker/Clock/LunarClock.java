package implementation.week11.Clockmaker.Clock;

public class LunarClock extends Clock {

    /** Constructors */
    public LunarClock(String name, ClockType type, int health) {
        super(name, type, health);
    }

    @Override
    public void tick() {
        System.out.println("Lunar Clock");
    }

    @Override
    public String toString() {
        return getName() + " (" + getHealth() + ")";
    }
}