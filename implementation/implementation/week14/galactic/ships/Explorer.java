package implementation.week14.galactic.ships;

import implementation.week14.galactic.enums.MissionType;
import implementation.week14.galactic.interfaces.WarpCapable;

public class Explorer extends Starship implements WarpCapable
{
    private int scanRange;

    public Explorer(String callSign, int scanRange)
    {
        super(callSign);

        setScanRange(scanRange);
    }

    @Override
    public MissionType performMission(MissionType mission)
    {
        return null;
    }

    @Override
    public void warpJump(int lightYears)
    {

    }

    public int getScanRange()
    {
        return this.scanRange;
    }

    public void setScanRange(int scanRange)
    {
        if (scanRange < 0)
        {
            throw new IllegalArgumentException("scanRange cannot be less than 0");
        }

        this.scanRange = scanRange;
    }
}