package implementation.week11.CelestialOrchestra.Celestial;

import implementation.week11.CelestialOrchestra.Enums.Tone;
import implementation.week11.CelestialOrchestra.Exceptions.ResonanceDistributionException;
import implementation.week11.CelestialOrchestra.Interfaces.Harmonic;
import implementation.week11.CelestialOrchestra.Interfaces.Resonant;

public class Moon extends CelestialBody implements Harmonic, Resonant {

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

    @Override
    public void reactTo(CelestialBody source) throws ResonanceDistributionException {
        if (source.getTone() == Tone.CHAOTIC) {
            throw new ResonanceDistributionException();
        } else {
            charge(source.getTone().getResonancePower());
            System.out.println(this.name + " flickers with excitement.");
        }
    }
}