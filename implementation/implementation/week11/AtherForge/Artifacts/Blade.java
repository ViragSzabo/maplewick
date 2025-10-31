package implementation.week11.AtherForge.Artifacts;

import implementation.week11.AtherForge.Exceptions.AetherBurstException;
import implementation.week11.AtherForge.Linking.Linkable;
import implementation.week11.AtherForge.Exceptions.SyncErrorException;

public class Blade extends Artifact implements Linkable {
    /** Constructor */
    public Blade(String name, Element element, int chargeLevel) {
        super(name, element, chargeLevel);
    }

    @Override
    public void awaken() {
        try {
            this.infuse(10);
        } catch (SyncErrorException | AetherBurstException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Awakened blade");
    }

    @Override
    public void link(Artifact other) {
        // Charge both artifacts' chargeLevel by half of the other's power
        try {
            this.infuse(other.getElement().getBasePower() / 3);
            other.infuse(this.getElement().getBasePower() / 3);
        } catch (SyncErrorException | AetherBurstException e) {
            throw new RuntimeException(e);
        }
    }
}