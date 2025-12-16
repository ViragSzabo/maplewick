package implementation.week4.implementation.Airport.Airplane;

import implementation.week4.implementation.Airport.Flight.Flight;

public abstract class Airplane {
    protected String code;
    protected double fuelLevel;

    public Airplane(String code, double fuelLevel) {
        this.code = code;
        this.fuelLevel = fuelLevel;
    }

    public String getCode() { return code; }
    public double getFuelLevel() { return fuelLevel; }
    public void setFuelLevel(double fuelLevel) { this.fuelLevel = fuelLevel; }
    public abstract int getTotalSeats();
    public abstract double getFuelUsage(Flight flight);
    public abstract boolean researveSeat(Flight flight);
}