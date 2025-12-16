package implementation.week4.implementation.Airport.Flight;

import implementation.week4.implementation.Airport.Airplane.PrivateAirplane;
import implementation.week4.implementation.Airport.Luggage.Luggage;
import implementation.week4.implementation.Airport.Luggage.LuggageType;
import implementation.week4.implementation.Airport.Travel.Airport;
import implementation.week4.implementation.Airport.Travel.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FlightBookingSystemTest {
    private Airport jfk;
    private Airport mex;
    private FlightBookingSystem bookingSystem;
    private Flight flight1;
    private PrivateAirplane privatePlane;
    private Passenger passenger1;
    private Passenger passenger2;

    @BeforeEach
    void setUp() {
        jfk = new Airport("JFK");
        mex = new Airport("MEX");

        privatePlane = new PrivateAirplane("PVT123", 10000, 5);
        flight1 = new Flight(privatePlane, jfk, mex, LocalDateTime.of(2024, 12, 25, 10, 30));

        bookingSystem = new FlightBookingSystem();
        bookingSystem.addFlight(flight1);

        passenger1 = new Passenger("Alice", "alice@example.com", "1234567890");
        passenger1.setLuggage(new Luggage(15.0, LuggageType.CARRY_ON));

        passenger2 = new Passenger("Bob", "bob@example.com", "0987654321");
        passenger2.setLuggage(new Luggage(20.0, LuggageType.CARRY_ON));
    }

    @Test
    void searchAvailableFlights() {
        bookingSystem.searchAvailableFlights(jfk);
        System.out.println("Available flights: " +  bookingSystem.getFlights().size());
        assertEquals(1, bookingSystem.getFlights().size());
    }
}