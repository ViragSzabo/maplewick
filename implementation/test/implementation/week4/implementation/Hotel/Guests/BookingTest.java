package implementation.week4.implementation.Hotel.Guests;

import implementation.week4.implementation.Hotel.Hotel.HotelBookingSystem;
import implementation.week4.implementation.Hotel.Rooms.Normal;
import implementation.week4.implementation.Hotel.Rooms.Room;
import implementation.week4.implementation.Hotel.Rooms.Suite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {
    private HotelBookingSystem hotelBookingSystem;
    private Room normal;
    private Room suite;
    private Guest guest;
    private Booking booking;

    @BeforeEach
    void setUp() {
        this.hotelBookingSystem = new HotelBookingSystem();
        this.normal = new Normal(20);
        this.suite = new Suite(30, true);
        this.hotelBookingSystem.addRoom(normal);
        this.hotelBookingSystem.addRoom(suite);
        this.guest = new Guest("John Don", "123 Main St", "john@example.com", "+123456789");
        this.booking = new Booking(
                this.guest, this.hotelBookingSystem.getRooms().get(1),
                LocalDate.of(2024, 11, 20),
                LocalDate.of(2024, 11, 24),
                true, 2,
                1, 1);
    }

    @Test
    void getGuest() {
        assertEquals(guest, booking.getGuest());
    }

    @Test
    void setGuest() {
        Guest newGuest = new Guest("John Moe", "124 Main St", "john@example.com", "+123456789");
        booking.setGuest(newGuest);
        assertEquals(newGuest.getName(), booking.getGuest().getName());
    }

    @Test
    void getRoom() {
        assertEquals(suite, booking.getRoom());
    }

    @Test
    void setRoom() {
        Room suite = new Suite(30, true);
        booking.setRoom(suite);
        assertEquals(suite, booking.getRoom());
    }

    @Test
    void getArrivalDate() {
        assertEquals(LocalDate.of(2024, 11, 20), booking.getArrivalDate());
    }

    @Test
    void setArrivalDate() {
        LocalDate newDate = LocalDate.of(2024, 12, 28);
        booking.setArrivalDate(newDate);
        assertEquals(newDate, booking.getArrivalDate());
    }

    @Test
    void getDepartureDate() {
        assertEquals(LocalDate.of(2024, 11, 24), booking.getDepartureDate());
    }

    @Test
    void setDepartureDate() {
        LocalDate newDate = LocalDate.of(2024, 12, 20);
        booking.setDepartureDate(newDate);
        assertEquals(newDate, booking.getDepartureDate());
    }

    @Test
    void isBreakfastIncluded() {
        assertTrue(booking.isBreakfastIncluded());
    }

    @Test
    void setBreakfastIncluded() {
        booking.setBreakfastIncluded(true);
        assertTrue(booking.isBreakfastIncluded());
    }

    @Test
    void getChildrenCount() {
        assertEquals(2, booking.getChildrenCount());
    }

    @Test
    void setChildrenCount() {
        booking.setChildrenCount(3);
        assertEquals(3, booking.getChildrenCount());
    }

    @Test
    void getGuestsUnder18Count() {
        assertEquals(1, booking.getGuestsUnder18Count());
    }

    @Test
    void setGuestsUnder18Count() {
        booking.setGuestsUnder18Count(1);
        assertEquals(1, booking.getGuestsUnder18Count());
    }

    @Test
    void getAdultsCount() {
        assertEquals(1, booking.getAdultsCount());
    }

    @Test
    void setAdultsCount() {
        booking.setAdultsCount(1);
        assertEquals(1, booking.getAdultsCount());
    }

    @Test
    void calculateTotalPrice() {
        assertEquals(500.0, booking.calculateTotalPrice());
    }
}