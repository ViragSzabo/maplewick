package implementation.week8.NuclearPowerplant.Control;

import java.util.HashSet;

public class ControlRoom
{
    private final HashSet<Statusable> statuses;

    public ControlRoom()
    {
        this.statuses = new HashSet<>();
    }

    public void add(Statusable statusable)
    {
        if (statusable == null)
        {
            throw new IllegalArgumentException();
        }

        this.statuses.add(statusable);
    }

    public boolean isStable()
    {
        for (Statusable statusable : this.statuses)
        {
            if (statusable.getStatus() != Status.STABLE)
            {
                return false;
            }
        }

        return true;
    }
}