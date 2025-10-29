package implementation.week11.CelestialOrchestra.Celestial;

import implementation.week11.CelestialOrchestra.Enums.Tone;
import implementation.week11.CelestialOrchestra.Exceptions.OverchargeException;
import implementation.week11.CelestialOrchestra.Interfaces.Harmonic;

public class Comet extends CelestialBody implements Harmonic {

    /** Constructor */
    public Comet(String name, Tone tone) {
        super(name, tone);
    }

    /** Performing Methods */
    @Override
    public void perform() throws OverchargeException{
        charge(50);

        if(getEnergy() > 100) {
            throw new OverchargeException();
        } else {
            System.out.println("Streaking across the symphony.");
        }
    }

    @Override
    public void tuning() {
        System.out.println(this.name + " crackling unpredictably.");
    }
}