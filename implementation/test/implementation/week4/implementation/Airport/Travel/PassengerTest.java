package implementation.week4.implementation.Airport.Travel;

import implementation.week4.implementation.Airport.Airplane.CommercialAirplane;
import implementation.week4.implementation.Airport.Airplane.PrivateAirplane;
import implementation.week4.implementation.Airport.Flight.Flight;
import implementation.week4.implementation.Airport.Flight.FlightBookingSystem;
import implementation.week4.implementation.Airport.Luggage.Luggage;
import implementation.week4.implementation.Airport.Luggage.LuggageType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
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
        booking1.addPassenger(passenger2);
        booking2.addPassenger(passenger3);
    }

    @Test
    void getName() {
        assertEquals("Alice", passenger1.getName());
        assertEquals("Bob", passenger2.getName());
        assertEquals("Charlie", passenger3.getName());
    }

    @Test
    void setName() {
        passenger1.setName("Olivia");
        passenger2.setName("Oliver");
        passenger3.setName("Emma");

        assertEquals("Olivia", passenger1.getName());
        assertEquals("Oliver", passenger2.getName());
        assertEquals("Emma", passenger3.getName());
    }

    @Test
    void getEmail() {
        assertEquals("alice@example.com", passenger1.getEmail());
        assertEquals("bob@example.com", passenger2.getEmail());
        assertEquals("charlie@example.com", passenger3.getEmail());
    }

    @Test
    void setEmail() {
        passenger1.setEmail("alice123@example.com");
        passenger2.setEmail("bobby@example.com");
        passenger3.setEmail("charlieeee@example.com");

        assertEquals("alice123@example.com", passenger1.getEmail());
        assertEquals("bobby@example.com", passenger2.getEmail());
        assertEquals("charlieeee@example.com", passenger3.getEmail());
    }

    @Test
    void getPhoneNumber() {
        assertEquals("1234567890", passenger1.getPhoneNumber());
        assertEquals("0987654321", passenger2.getPhoneNumber());
        assertEquals("5555555555", passenger3.getPhoneNumber());
    }

    @Test
    void setPhoneNumber() {
        passenger1.setPhoneNumber("+31 4 123 7890");
        passenger2.setPhoneNumber("+31 4 456 1234");
        passenger3.setPhoneNumber("+31 4 789 4567");

        assertEquals("+31 4 123 7890", passenger1.getPhoneNumber());
        assertEquals("+31 4 456 1234", passenger2.getPhoneNumber());
        assertEquals("+31 4 789 4567", passenger3.getPhoneNumber());
    }

    @Test
    void getLuggage() {
        assertEquals(LuggageType.CARRY_ON, passenger1.getLuggage().getType());
        assertEquals(LuggageType.CARRY_ON, passenger2.getLuggage().getType());
        assertEquals(LuggageType.HOLD, passenger3.getLuggage().getType());
    }

    @Test
    void setLuggage() {
        passenger1.setLuggage(new Luggage(20.0, LuggageType.HOLD));
        passenger2.setLuggage(new Luggage(30.0, LuggageType.HOLD));
        passenger3.setLuggage(new Luggage(19.0, LuggageType.CARRY_ON));

        assertEquals(LuggageType.HOLD, passenger1.getLuggage().getType());
        assertEquals(LuggageType.HOLD, passenger2.getLuggage().getType());
        assertEquals(LuggageType.CARRY_ON, passenger3.getLuggage().getType());
    }
}