package implementation.week11.AtherForge;

import implementation.week11.AtherForge.Artifacts.Artifact;
import implementation.week11.AtherForge.Exceptions.AetherBurstException;
import implementation.week11.AtherForge.Exceptions.SyncErrorException;
import implementation.week11.AtherForge.Linking.Linkable;

import java.util.ArrayList;
import java.util.List;

public class ForgeMaster {
    private List<Artifact> artifacts;

    public ForgeMaster() {
        this.artifacts = new ArrayList<Artifact>();
    }

    /** Getters, Setters, Add and Remove Methods */
    public List<Artifact> getArtifacts() {
        return this.artifacts;
    }

    public void setArtifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    public void addArtifact(Artifact artifact) {
        this.artifacts.add(artifact);
    }

    public void removeArtifact(Artifact artifact) {
        this.artifacts.remove(artifact);
    }

    /** Simulate the artifacts */
    public void simulate() {
        for (Artifact artifact : this.artifacts) {
            try {
                artifact.awaken();

                // only link artifacts that implement linkable
                if (artifact instanceof Linkable linkable) {
                    for (Artifact other : this.artifacts) {
                        if (artifact != other && artifact.getName().compareTo(other.getName()) < 0) {
                            linkable.link(other); // avoid self-linking and duplicate linking
                        }
                    }
                }
            } catch (AetherBurstException | SyncErrorException e) {
                throw new RuntimeException(e);
            }
        }
    }
}