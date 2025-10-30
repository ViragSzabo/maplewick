package implementation.week11.Clockmaker.Clock;

import implementation.week11.Clockmaker.Interface.Repairable;
import implementation.week11.Clockmaker.Interface.SyncException;
import implementation.week11.Clockmaker.Interface.Synchronizable;

public abstract class Clock implements Repairable, Synchronizable {

    /** Attributes */
    private String name;
    private ClockType type;
    private int health;

    /** Constructors */
    public Clock(String name, ClockType type, int health) {
        this.name = name;
        this.type = type;
        this.health = health;
    }

    /** Getters & Setters */
    public String getName() {
        return name;
    }

    public ClockType getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(ClockType type) {
        this.type = type;
    }

    public abstract void tick();

    public boolean isBroken() {
        return health <= 0;
    }

    @Override
    public void repair() {
        health += 1;
    }

    @Override
    public void synchronize(Clock other) throws SyncException {
        System.out.println("Synchronizing " + name + " with " + other.getHealth() + " health");
        this.health += other.getHealth();
    }
}