package implementation.week4.Implementation.Hotel;

import implementation.week4.Implementation.Hotel.Guests.Booking;
import implementation.week4.Implementation.Hotel.Guests.Guest;
import implementation.week4.Implementation.Hotel.Hotel.HotelBookingSystem;
import implementation.week4.Implementation.Hotel.Rooms.Normal;
import implementation.week4.Implementation.Hotel.Rooms.Suite;

import java.time.LocalDate;

public class HotelExample
{
    public static void main(String[] args)
    {
        HotelBookingSystem hotelBookingSystem = new HotelBookingSystem();

        hotelBookingSystem.addRoom(new Normal(20));
        hotelBookingSystem.addRoom(new Suite(30, true));

        Guest guest = new Guest("John Doe", "123 Main St",
                "john@example.com", "+123456789");

        Booking booking = new Booking(
                guest, hotelBookingSystem.getRooms().get(1),
                LocalDate.of(2024, 11, 20),
                LocalDate.of(2024, 11, 24),
                true, 2,
                1, 1);

        hotelBookingSystem.createBooking(booking);
    }
}