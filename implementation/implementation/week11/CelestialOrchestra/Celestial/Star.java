package implementation.week11.CelestialOrchestra.Celestial;

import implementation.week11.CelestialOrchestra.Enums.Tone;
import implementation.week11.CelestialOrchestra.Exceptions.OverchargeException;
import implementation.week11.CelestialOrchestra.Interfaces.Harmonic;
import implementation.week11.CelestialOrchestra.Interfaces.Rebellious;

public class Star extends CelestialBody implements Rebellious, Harmonic {

    /** Constructor */
    public Star(String name, Tone tone) {
        super(name, tone);
    }

    /** Performing Methods */
    @Override
    public void perform() throws OverchargeException {
        charge(30);

        if (getEnergy() > 80) {
            throw new OverchargeException();
        } else {
            System.out.println("Shimmering with radiant brilliance.");
        }
    }

    @Override
    public boolean resisting() {
        return true;
    }

    @Override
    public void tuning() {
        System.out.println(this.name + " adjusts its solar rhythm.");
    }
}