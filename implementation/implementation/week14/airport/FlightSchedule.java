package implementation.week14.airport;

import java.util.ArrayList;
import java.util.List;

public class FlightSchedule
{
    private List<Aircraft> aircraft;

    public FlightSchedule()
    {
        this.aircraft = new ArrayList<>();
    }

    public List<Aircraft> getAircrafts()
    {
        return this.aircraft;
    }

    public void addAircraft(Aircraft aircraft)
    {
        this.aircraft.add(aircraft);
    }

    public void removeAircraft(Aircraft aircraft)
    {
        this.aircraft.remove(aircraft);
    }

    public void printFlightStatus()
    {
        for (Aircraft aircraft : aircraft)
        {
            if (aircraft instanceof Maintenance)
            {
                boolean safe = ((Maintenance) aircraft).performCheck();
                System.out.println("Flight Status: " + safe);
            }
            else
            {
                System.out.println(aircraft.getCallSign() + ": No Maintenance Check Available.");
            }
        }
    }
}