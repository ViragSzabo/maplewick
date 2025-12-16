package implementation.week4.implementation.Hotel.Hotel;

import implementation.week4.implementation.Hotel.Guests.Booking;
import implementation.week4.implementation.Hotel.Rooms.Room;

import java.util.ArrayList;
import java.util.List;

public class HotelBookingSystem
{
    private List<Booking> bookings;
    private List<Room> rooms;
    private Receptionist receptionist;

    public HotelBookingSystem()
    {
        bookings = new ArrayList<>();
        rooms = new ArrayList<>();
        receptionist = new Receptionist();
    }

    public List<Booking> getBookings()
    {
        return bookings;
    }

    public void setBookings(List<Booking> bookings)
    {
        this.bookings = bookings;
    }

    public List<Room> getRooms()
    {
        return rooms;
    }

    public void setRooms(List<Room> rooms)
    {
        this.rooms = rooms;
    }

    public Receptionist getReceptionist()
    {
        return receptionist;
    }

    public void setReceptionist(Receptionist receptionist)
    {
        this.receptionist = receptionist;
    }

    public void addRoom(Room room)
    {
        rooms.add(room);
    }

    /**
     * Create a new booking
     * @param booking is the requested booking
     */
    public void createBooking(Booking booking)
    {
        bookings.add(booking);
        booking.confirmBooking();
        receptionist.checkIn(booking.getGuest(), booking);
        receptionist.processPayment(booking);
    }

    /**
     * View all the bookings that has been made
     * @return a list of the bookings
     */
    public List<Booking> viewReservations()
    {
        for (Booking booking : bookings) {
            receptionist.checkIn(booking.getGuest(), booking);
        }
        return bookings;
    }
}