package implementation.week11.CelestialOrchestra.Interfaces;

import implementation.week11.CelestialOrchestra.Celestial.CelestialBody;
import implementation.week11.CelestialOrchestra.Exceptions.ResonanceDistributionException;

public interface Resonant {
    public void reactTo(CelestialBody source) throws ResonanceDistributionException;
}