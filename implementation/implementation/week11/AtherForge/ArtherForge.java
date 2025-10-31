package implementation.week11.AtherForge;

import implementation.week11.AtherForge.Artifacts.*;

public class ArtherForge {
    public static void main(String[] args) {
        // Create the objects to work with
        ForgeMaster master = new ForgeMaster();
        Artifact orb = new Orb("orbie", Element.AIR, 1);
        Artifact tot = new Totem("totie", Element.WATER, 2);
        Artifact bla = new Blade("bladie", Element.FIRE, 3);

        // Add artifacts to the master
        master.addArtifact(orb);
        master.addArtifact(tot);
        master.addArtifact(bla);

        // Simulate the artifacts
        master.simulate();
    }
}