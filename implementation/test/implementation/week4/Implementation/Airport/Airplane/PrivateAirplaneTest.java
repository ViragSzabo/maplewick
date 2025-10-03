package implementation.week4.Implementation.Airport.Airplane;

import implementation.week4.Implementation.Airport.Flight.Flight;
import implementation.week4.Implementation.Airport.Travel.Airport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PrivateAirplaneTest {
    Airport jfk;
    Airport mex;
    Airplane privatePlane;
    Flight flight;

    @BeforeEach
    void setUp() {
        this.jfk = new Airport("JFK");
        this.mex = new Airport("MEX");
        this.privatePlane = new PrivateAirplane("FVG453", 50000, 50);
        this.flight = new Flight(privatePlane, jfk, mex, LocalDateTime.of(2024, 10, 26, 12, 54));
    }

    @Test
    void getTotalSeats() {
        System.out.println(privatePlane.getCode() + " has " + privatePlane.getTotalSeats() + " seats.");
        assertEquals(50, privatePlane.getTotalSeats());
    }

    @Test
    void getFuelUsage() {
        System.out.println("The fuel usage for the distance: " + privatePlane.getFuelUsage(flight));
        assertEquals(65500.0, privatePlane.getFuelUsage(flight));
    }

    @Test
    void researveSeat() {
        System.out.println("Researve a seat is not required!");
        assertTrue(privatePlane.researveSeat(flight));
    }
}