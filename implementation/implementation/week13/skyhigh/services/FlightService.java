package implementation.week13.skyhigh.services;

import implementation.week13.skyhigh.exceptions.CrashException;

public interface FlightService
{
    void calculateFlightPhysics(double weight, double time) throws CrashException;
}