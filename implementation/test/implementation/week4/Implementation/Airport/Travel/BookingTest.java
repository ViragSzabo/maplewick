package implementation.week4.Implementation.Airport.Travel;

import implementation.week4.Implementation.Airport.Airplane.CommercialAirplane;
import implementation.week4.Implementation.Airport.Airplane.PrivateAirplane;
import implementation.week4.Implementation.Airport.Flight.Flight;
import implementation.week4.Implementation.Airport.Flight.FlightBookingSystem;
import implementation.week4.Implementation.Airport.Luggage.Luggage;
import implementation.week4.Implementation.Airport.Luggage.LuggageType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {
    private final FlightBookingSystem bookingSystem = new FlightBookingSystem();
    private Flight flight1;
    private Flight flight2;
    private Booking booking1;
    private Booking booking2;
    private PrivateAirplane privatePlane;
    private CommercialAirplane commercialPlane;
    private Airport jfk;
    private Airport amx;
    private Airport mex;
    private Airport lax;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    @BeforeEach
    void setUp() {
        flight1 = new Flight(privatePlane, jfk, mex, LocalDateTime.of(2023, 9, 26, 12, 54));
        flight2 = new Flight(commercialPlane, amx, lax, LocalDateTime.of(2023, 10, 1, 15, 30));

        bookingSystem.addFlight(flight1);
        bookingSystem.addFlight(flight2);

        privatePlane = new PrivateAirplane("PVT123", 5000, 10);
        commercialPlane = new CommercialAirplane("COM456", 15000, 100, 20);

        passenger1 = new Passenger("Alice", "alice@example.com", "1234567890");
        passenger1.setLuggage(new Luggage(15.0, LuggageType.CARRY_ON));
        passenger1.setLuggage(new Luggage(25.0, LuggageType.HOLD));

        passenger2 = new Passenger("Bob", "bob@example.com", "0987654321");

        passenger3 = new Passenger("Charlie", "charlie@example.com", "5555555555");
        passenger3.setLuggage(new Luggage(20.0, LuggageType.HOLD));

        jfk = new Airport("JFK");
        amx = new Airport("AMX");
        mex = new Airport("MEX");
        lax = new Airport("LAX");

        jfk.addDistance(amx.getCode(), 5848);
        jfk.addDistance(mex.getCode(), 3366);
        jfk.addDistance(lax.getCode(), 3975);
        amx.addDistance(mex.getCode(), 9206);
        amx.addDistance(lax.getCode(), 8956);
        mex.addDistance(lax.getCode(), 2500);

        booking1 = new Booking(flight1);
        booking2 = new Booking(flight2);

        booking1.addPassenger(passenger1);
    }

    @Test
    void getFlight() {
        assertEquals(flight1, booking1.getFlight());
    }

    @Test
    void getPassenger() {
        assertEquals(passenger1, booking1.getPassenger().get(0));
    }

    @Test
    void addPassenger() {
        booking2.addPassenger(passenger3);
        System.out.println(booking2.getPassenger().get(0).getName());

        assertEquals(passenger3.getName(), booking2.getPassenger().get(0).getName());
    }

    @Test
    void getBookingStatus() {
        assertEquals(BookStatus.CONFIRMED, booking1.getBookingStatus());
    }

    @Test
    void cancelBooking() {
        booking1.cancelBooking();
        assertEquals(BookStatus.CANCELLED, booking1.getBookingStatus());
    }
}