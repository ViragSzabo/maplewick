package implementation.week11.AtherForge.Artifacts;

import implementation.week11.AtherForge.Exceptions.AetherBurstException;
import implementation.week11.AtherForge.Linking.Linkable;
import implementation.week11.AtherForge.Exceptions.SyncErrorException;

public class Totem extends Artifact implements Linkable {
    /** Constructor */
    public Totem(String name, Element element, int chargeLevel) {
        super(name, element, chargeLevel);
    }

    @Override
    public void awaken() {
        try {
            this.infuse(15);
        } catch (SyncErrorException | AetherBurstException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Totem awaken");
    }

    @Override
    public void link(Artifact other) {
        // Charge both artifacts' chargeLevel by half of the other's power
        try {
            this.infuse(other.getElement().getBasePower());
            other.infuse(this.getElement().getBasePower());
        } catch (SyncErrorException | AetherBurstException e) {
            throw new RuntimeException(e);
        }
    }
}