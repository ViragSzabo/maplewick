package implementation.week14.galactic;

import implementation.week14.galactic.enums.MissionType;
import implementation.week14.galactic.exceptions.IllegalCargoException;
import implementation.week14.galactic.exceptions.InsufficientFuelException;
import implementation.week14.galactic.ships.Starship;

import java.util.ArrayList;
import java.util.List;

public class Fleet
{
    private List<Starship> starships;

    public Fleet()
    {
        this.starships = new ArrayList<Starship>();
    }

    public void deployFleet(MissionType mission)
    {
        for (Starship s : this.starships)
        {
            try
            {
                s.performMission(mission);
            }
            catch (InsufficientFuelException | IllegalCargoException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public List<Starship> getStarships()
    {
        return this.starships;
    }

    public void addStarship(Starship ship)
    {
        this.starships.add(ship);
    }

    public void removeStarship(Starship ship)
    {
        this.starships.remove(ship);
    }
}