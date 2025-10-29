package implementation.week11.CelestialOrchestra;

import implementation.week11.CelestialOrchestra.Celestial.CelestialBody;
import implementation.week11.CelestialOrchestra.Exceptions.OverchargeException;
import implementation.week11.CelestialOrchestra.Exceptions.ResonanceDistributionException;

import java.util.ArrayList;
import java.util.List;

public class Conductor {
    private List<CelestialBody> bodies;

    public Conductor() {
        this.bodies = new ArrayList<CelestialBody>();
    }
    /** Getters & Setters */
    public List<CelestialBody> getCurrentOrchestra() {
        return this.bodies;
    }

    public void refreshOrchestra(List<CelestialBody> bodies) {
        this.bodies = bodies;
    }

    /** Methods */
    public void addBody(CelestialBody b) {
        this.bodies.add(b);
    }

    public void removeBody(CelestialBody b) {
        this.bodies.remove(b);
    }

    public void orchestrate() throws OverchargeException {
        for (CelestialBody b : bodies) {
            b.charge(10);
            try {
                b.perform();
            } catch (OverchargeException e) {
                throw new OverchargeException();
            }
        }
    }

    public void orchestrateResonance() throws ResonanceDistributionException {
        for (CelestialBody source : bodies) {
            for (CelestialBody target : bodies) {
                if (source != target) {
                    try {
                        target.reactTo(source);
                    } catch (ResonanceDistributionException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }
}