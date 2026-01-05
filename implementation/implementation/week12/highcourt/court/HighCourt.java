package implementation.week12.highcourt.court;

import java.util.HashSet;

public class HighCourt
{
    private HashSet<Writ> writs;

    public HighCourt()
    {
        this.writs = new HashSet<>();
    }

    public HashSet<Writ> getWrists()
    {
        return this.writs;
    }

    public void addWrit(Writ writ)
    {
        if (writ == null)
        {
            throw new IllegalArgumentException("Writ cannot be null");
        }

        this.writs.add(writ);
    }

    public void removeWrit(Writ writ)
    {
        if (writ == null)
        {
            throw new IllegalArgumentException("Writ cannot be null");
        }

        this.writs.remove(writ);
    }

    public double getTotalDebts()
    {
        double totalDebt = 0;

        for (Writ writ : this.writs)
        {
            totalDebt += writ.getOutstandingDebt();
        }

        return totalDebt;
    }
}