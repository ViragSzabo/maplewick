package implementation.week11.CelestialOrchestra.Celestial;

import implementation.week11.CelestialOrchestra.Enums.Tone;
import implementation.week11.CelestialOrchestra.Exceptions.OverchargeException;
import implementation.week11.CelestialOrchestra.Interfaces.Resonant;

public abstract class CelestialBody implements Resonant {
    /** Protected Attributes */
    protected String name;
    protected Tone tone;
    private int energy;

    /** Constructor */
    public CelestialBody(String name, Tone tone) {
        this.name = name;
        this.tone = tone;
        this.energy = 0;
    }

    /** Getters & Setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tone getTone() {
        return tone;
    }

    public void setTone(Tone tone) {
        this.tone = tone;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /** Performing Methods */
    public abstract void perform() throws OverchargeException;

    public void charge(int amount) {
        this.energy += amount;
    }
}