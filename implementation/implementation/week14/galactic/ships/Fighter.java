package implementation.week14.galactic.ships;

import implementation.week14.galactic.enums.MissionType;
import implementation.week14.galactic.exceptions.InsufficientFuelException;

public class Fighter extends Starship
{
    private int torpedoCount;

    public Fighter(String callSign, int torpedoCount)
    {
        super(callSign);

        setTorpedoCount(torpedoCount);
    }

    @Override
    public void performMission(MissionType mission) throws InsufficientFuelException
    {
        if (mission != MissionType.BATTLE)
        {
            throw new IllegalArgumentException("Battle Mission Cancelled");
        }

        if (getFuelLevel() < 20)
        {
            throw new InsufficientFuelException("Fuel level is not good enough!");
        }

        setTorpedoCount(getTorpedoCount() - 1);
        setFuelLevel(getFuelLevel() - 20);
        System.out.println("Fox One deployed!");
    }

    public int getTorpedoCount()
    {
        return this.torpedoCount;
    }

    public void setTorpedoCount(int torpedoCount)
    {
        if (torpedoCount < 0)
        {
            throw new IllegalArgumentException("Out of ammount of torpedo");
        }

        this.torpedoCount = torpedoCount;
    }
}