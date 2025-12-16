package implementation.week12.highcourt.court;

import java.util.HashSet;

public class HighCourt
{
    private HashSet<Writ> wrists;

    public HighCourt()
    {
        this.wrists = new HashSet<>();
    }

    public HashSet<Writ> getWrists()
    {
        return this.wrists;
    }

    public void addWrit(Writ writ)
    {
        if (writ == null)
        {
            throw new IllegalArgumentException("Writ cannot be null");
        }

        this.wrists.add(writ);
    }

    public void removeWrit(Writ writ)
    {
        if (writ == null)
        {
            throw new IllegalArgumentException("Writ cannot be null");
        }

        this.wrists.remove(writ);
    }

    public double getTotalDebts()
    {
        double totalDebt = 0;

        for (Writ writ : this.wrists)
        {
            totalDebt += writ.getOutstandingDebt();
        }

        return totalDebt;
    }
}