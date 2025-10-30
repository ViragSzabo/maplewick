package implementation.week11.Clockmaker.Interface;

import implementation.week11.Clockmaker.Clock.Clock;

public interface Synchronizable {
    public void synchronize(Clock other) throws SyncException;
}