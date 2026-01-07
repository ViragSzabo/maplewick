package implementation.week13.bio;

import implementation.week13.bio.status.Monitorable;
import implementation.week13.bio.status.Status;

import java.util.HashSet;
import java.util.Set;

public class CentralMonitor
{
    private final Set<Monitorable> components;

    public CentralMonitor()
    {
        this.components = new HashSet<>();
    }

    public Set<Monitorable> getComponents()
    {
        return this.components;
    }

    public void addComponent(Monitorable monitorable)
    {
        this.components.add(monitorable);
    }

    public boolean isRefineryStable()
    {
        for (Monitorable monitorable : this.components)
        {
            if (monitorable.checkSystem() != Status.OK)
            {
                return false;
            }
        }

        return true;
    }
}