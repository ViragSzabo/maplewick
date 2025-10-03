package implementation.week4.Implementation.Airport.Travel;

import implementation.week4.Implementation.Airport.Flight.Flight;
import implementation.week4.Implementation.Airport.Luggage.Luggage;

import java.util.ArrayList;
import java.util.List;

public class Booking
{
    private Flight flight;
    private final List<Passenger> passengers;
    private BookStatus bookingStatus;
    private final List<Luggage> luggages;

    public Booking(Flight flight)
    {
        this.flight = flight;
        this.passengers = new ArrayList<>();
        this.bookingStatus = BookStatus.CONFIRMED;
        this.luggages = new ArrayList<>();
    }

    public Flight getFlight()
    {
        return flight;
    }

    public void setFlight(Flight flight)
    {
        this.flight = flight;
    }

    public List<Passenger> getPassenger()
    {
        return this.passengers;
    }

    public void addPassenger(Passenger passenger)
    {
        this.passengers.add(passenger);
    }

    public List<Luggage> getLuggages()
    {
        return luggages;
    }

    public void addLuggage(Luggage luggage)
    {
        this.luggages.add(luggage);
    }

    public void removeLuggage(Luggage luggage)
    {
        this.luggages.remove(luggage);
    }

    public BookStatus getBookingStatus()
    {
        return this.bookingStatus;
    }

    /**
     * The ability to cancel a booking
     * Change the status of your booking
     */
    public void cancelBooking()
    {
        this.bookingStatus = BookStatus.CANCELLED;
    }
}