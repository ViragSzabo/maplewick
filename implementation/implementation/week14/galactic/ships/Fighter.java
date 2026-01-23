package implementation.week14.galactic.ships;

import implementation.week14.galactic.enums.MissionType;

public class Fighter extends Starship
{
    private int torpedoCount;

    public Fighter(String callSign, int torpedoCount)
    {
        super(callSign);

        setTorpedoCount(torpedoCount);
    }

    @Override
    public MissionType performMission(MissionType mission)
    {
        return null;
    }

    public int getTorpedoCount()
    {
        return this.torpedoCount;
    }

    public void setTorpedoCount(int torpedoCount)
    {
        if (torpedoCount < 0)
        {
            throw new IllegalArgumentException("torpedoCount cannot be less than 0");
        }

        this.torpedoCount = torpedoCount;
    }
}