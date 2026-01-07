package implementation.week8.NuclearPowerplant.Control;

import java.util.HashSet;
import java.util.Set;

public class ControlRoom
{
    private final Set<Statusable> monitoredComponents;

    public ControlRoom()
    {
        this.monitoredComponents = new HashSet<>();
    }

    public void add(Statusable statusable)
    {
        if (statusable == null)
        {
            throw new IllegalArgumentException("Cannot monitor null component");
        }

        this.monitoredComponents.add(statusable);
    }

    public boolean isStable()
    {
        for (Statusable statusable : this.monitoredComponents)
        {
            if (statusable.getStatus() != Status.STABLE)
            {
                return false;
            }
        }

        return true;
    }
}