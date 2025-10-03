package implementation.week4.Implementation.Hotel.Hotel;

import implementation.week4.Implementation.Hotel.Guests.Booking;
import implementation.week4.Implementation.Hotel.Guests.Guest;
import implementation.week4.Implementation.Hotel.Rooms.Normal;
import implementation.week4.Implementation.Hotel.Rooms.Suite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HotelBookingSystemTest {
    private HotelBookingSystem hotelBookingSystem;
    private Guest guest;
    private Booking booking;

    @BeforeEach
    void setUp() {
        hotelBookingSystem = new HotelBookingSystem();
        hotelBookingSystem.addRoom(new Normal(20));
        hotelBookingSystem.addRoom(new Suite(30, true));
        guest = new Guest("John Doe", "123 Main St", "john@example.com", "+123456789");
        booking = new Booking(
                guest, hotelBookingSystem.getRooms().get(1),
                LocalDate.of(2024, 11, 20),
                LocalDate.of(2024, 11, 24),
                true, 2,
                1, 1);
    }

    @Test
    void createBooking() {
        hotelBookingSystem.createBooking(booking);
        assertEquals(1, hotelBookingSystem.getBookings().size());
    }

    @Test
    void viewReservations() {
        hotelBookingSystem.createBooking(booking);
        assertEquals(1, hotelBookingSystem.viewReservations().size());
    }
}