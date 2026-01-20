package implementation.week14.airport;

import java.util.ArrayList;
import java.util.List;

public class FlightSchedule
{
    private List<Aircraft> aircrafts;

    public FlightSchedule()
    {
        this.aircrafts = new ArrayList<>();
    }

    public List<Aircraft> getAircrafts()
    {
        return aircrafts;
    }

    public void addAircraft(Aircraft aircraft)
    {
        this.aircrafts.add(aircraft);
    }

    public void removeAircraft(Aircraft aircraft)
    {
        this.aircrafts.remove(aircraft);
    }

    public void printFlightStatus()
    {
        for (Aircraft aircraft : aircrafts)
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