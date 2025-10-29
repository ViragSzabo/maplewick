package implementation.week11.CelestialOrchestra.Celestial;

import implementation.week11.CelestialOrchestra.Enums.Tone;
import implementation.week11.CelestialOrchestra.Exceptions.OverchargeException;
import implementation.week11.CelestialOrchestra.Exceptions.ResonanceDistributionException;
import implementation.week11.CelestialOrchestra.Interfaces.Harmonic;
import implementation.week11.CelestialOrchestra.Interfaces.Rebellious;
import implementation.week11.CelestialOrchestra.Interfaces.Resonant;

public class Star extends CelestialBody implements Rebellious, Harmonic, Resonant {

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

    @Override
    public void reactTo(CelestialBody source) throws ResonanceDistributionException {
        System.out.println(this.name + " amplifies the tone of " + source.getName());
        charge(source.getTone().getResonancePower() / 2);
    }
}