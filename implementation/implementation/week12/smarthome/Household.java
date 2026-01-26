package implementation.week12.smarthome;

import implementation.week12.smarthome.sources.PowerSource;
import java.util.HashSet;

public class Household
{
    private HashSet<PowerSource> sources;

    public Household()
    {
        this.sources = new HashSet<>();
    }

    public HashSet<PowerSource> getSources()
    {
        return this.sources;
    }

    public void addSource(PowerSource source)
    {
        this.sources.add(source);
    }

    public void removeSource(PowerSource source)
    {
        if (!this.sources.contains(source))
        {
            throw new IllegalArgumentException("Source does not exist");
        }

        this.sources.remove(source);
    }
}