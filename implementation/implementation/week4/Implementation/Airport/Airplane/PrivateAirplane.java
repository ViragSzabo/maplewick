package implementation.week4.Implementation.Airport.Airplane;

import implementation.week4.Implementation.Airport.Flight.Flight;
import implementation.week4.Implementation.Airport.Luggage.Luggage;

public class PrivateAirplane extends Airplane {
    private final int numberOfSeats;

    public PrivateAirplane(String code, double fuelLevel, int numberOfSeats) {
        super(code, fuelLevel);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public int getTotalSeats() { return this.numberOfSeats; }

    @Override
    public double getFuelUsage(Flight flight) {
        double distance = 1000; //flight.getDepartureAirport().getDistance();
        int seatsTaken = flight.getPassengers().size();
        double luggageWeight = (
                flight.getBookings().stream()
                .flatMap(booking -> booking.getLuggages().stream())
                .mapToDouble(Luggage::getWeight).sum()
        );
        return numberOfSeats * 1.31 * distance + ((seatsTaken * 1.87) + (luggageWeight * 0.4));
    }

    @Override
    public boolean researveSeat(Flight flight) {
        return false;
    }
}