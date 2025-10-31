package implementation.week11.AtherForge.Linking;

import implementation.week11.AtherForge.Artifacts.Artifact;
import implementation.week11.AtherForge.Exceptions.AetherBurstException;
import implementation.week11.AtherForge.Exceptions.SyncErrorException;

public interface Linkable {
    public void link(Artifact other) throws SyncErrorException, AetherBurstException;
}