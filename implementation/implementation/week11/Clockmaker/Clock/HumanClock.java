package implementation.week11.Clockmaker.Clock;

public class HumanClock extends Clock {

    /** Constructors */
    public HumanClock(String name, ClockType type, int health) {
        super(name, type, health);
    }

    @Override
    public void tick() {
        System.out.println("Human Clock");
    }

    @Override
    public String toString() {
        return getName() + " (" + getHealth() + ")";
    }
}