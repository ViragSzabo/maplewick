package implementation.week14.galactic.ships;

import implementation.week14.galactic.enums.MissionType;
import implementation.week14.galactic.exceptions.InsufficientFuelException;
import implementation.week14.galactic.interfaces.WarpCapable;

public class Explorer extends Starship implements WarpCapable
{
    private static final int MIN_FUEL = 10;
    private static final int YEARLY_FUEL_CONSUMES = 5;

    private int scanRange;

    public Explorer(String callSign, int scanRange)
    {
        super(callSign);

        setScanRange(scanRange);
    }

    @Override
    public void performMission(MissionType mission)
    {
        if (mission == MissionType.EXPLORATION || mission == MissionType.PATROL)
        {
            setFuelLevel(getFuelLevel() - MIN_FUEL);
            System.out.println("Sector Scanned");
        }
    }

    @Override
    public void warpJump(int lightYears) throws InsufficientFuelException
    {
        double cost = lightYears * YEARLY_FUEL_CONSUMES;

        if (getFuelLevel() < MIN_FUEL)
        {
            throw new InsufficientFuelException("Not enough fuel!");
        }

        setFuelLevel(getFuelLevel() - cost);
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