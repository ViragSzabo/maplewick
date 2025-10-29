package implementation.week11.CelestialOrchestra.Celestial;

import implementation.week11.CelestialOrchestra.Enums.Tone;
import implementation.week11.CelestialOrchestra.Interfaces.Harmonic;

public class Moon extends CelestialBody implements Harmonic {

    /** Constructor */
    public Moon(String name, Tone tone) {
        super(name, tone);
    }

    /** Performing Methods */
    @Override
    public void perform() {
        charge(10);
        System.out.println("Humming in silver tones.");
    }

    @Override
    public void tuning() {
        System.out.println(this.name + " adjusts to the tide's rhythm.");
    }
}