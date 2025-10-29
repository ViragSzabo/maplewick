package implementation.week11.CelestialOrchestra;

import implementation.week11.CelestialOrchestra.Celestial.*;
import implementation.week11.CelestialOrchestra.Enums.Tone;
import implementation.week11.CelestialOrchestra.Exceptions.OverchargeException;

public class CelestialFestival {
    public static void main(String[] args) throws OverchargeException {
        Conductor c = new Conductor();

        c.addBody(new Star("Sol", Tone.BRIGHT));
        c.addBody(new Moon("Lun", Tone.SOFT));
        c.addBody(new Comet("Eru", Tone.CHAOTIC));

        for(int night = 1; night <= 4; night++) {
            System.out.println("Night " + night + " begins...");
            try {
                c.orchestrate();
            } catch (OverchargeException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Night " + night + " ends...");
        }
    }
}