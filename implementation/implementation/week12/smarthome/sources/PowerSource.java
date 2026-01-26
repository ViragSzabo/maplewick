package implementation.week12.smarthome.sources;

import implementation.week12.smarthome.HouseholdResult;
import implementation.week12.smarthome.Weather;
import implementation.week12.smarthome.exception.BlackoutException;

public abstract class PowerSource
{
    private String id;

    public PowerSource(String id)
    {
        this.setId(id);
    }

    public String getId()
    {
        return this.id;
    }

    public void setId(String id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException("Id cannot be null");
        }

        this.id = id;
    }

    public abstract HouseholdResult run(Weather weather) throws BlackoutException;
}