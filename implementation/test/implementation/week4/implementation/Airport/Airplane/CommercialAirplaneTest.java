package implementation.week4.implementation.Airport.Airplane;

import implementation.week4.implementation.Airport.Flight.Flight;
import implementation.week4.implementation.Airport.Travel.Airport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CommercialAirplaneTest {
    Airport jfk;
    Airport mex;
    Airplane commercialPlane;
    Flight flight;

    @BeforeEach
    void setUp() {
        this.jfk = new Airport("JFK");
        this.mex = new Airport("MEX");
        this.commercialPlane = new CommercialAirplane("FVG453", 50000, 25, 25);
        this.flight = new Flight(commercialPlane, jfk, mex, LocalDateTime.of(2024, 10, 26, 12, 54));
    }

    @Test
    void getTotalSeats() {
        System.out.println(commercialPlane.getCode() + " has " + commercialPlane.getTotalSeats() + " seats.");
        assertEquals(50, commercialPlane.getTotalSeats());
    }

    @Test
    void getFuelUsage() {
        System.out.println("The fuel usage for the distance: " + commercialPlane.getFuelUsage(flight));
        assertEquals(93250.0, commercialPlane.getFuelUsage(flight));
    }

    @Test
    void researveSeat() {
        System.out.println("A business or/and economy is researved: " + commercialPlane.researveSeat(flight));
        assertTrue(commercialPlane.researveSeat(flight));
    }
}