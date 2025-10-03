package implementation.week4.Implementation.Hotel.Guests;

import implementation.week4.Implementation.Hotel.Rooms.Room;

import java.time.LocalDate;

public class Booking
{
    private Guest guest;
    private Room room;
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private boolean breakfastIncluded;
    private int childrenCount;
    private int guestsUnder18Count;
    private int adultsCount;

    public Booking(
            Guest guest, Room room,
            LocalDate arrivalDate, LocalDate departureDate,
            boolean breakfastIncluded,
            int childrenCount, int guestsUnder18Count, int adultsCount)
    {
        this.guest = guest;
        this.room = room;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.breakfastIncluded = breakfastIncluded;
        this.childrenCount = childrenCount;
        this.guestsUnder18Count = guestsUnder18Count;
        this.adultsCount = adultsCount;
    }

    public Guest getGuest()
    {
        return guest;
    }

    public void setGuest(Guest guest)
    {
        this.guest = guest;
    }

    public Room getRoom()
    {
        return room;
    }

    public void setRoom(Room room)
    {
        this.room = room;
    }

    public LocalDate getArrivalDate()
    {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate)
    {
        this.arrivalDate = arrivalDate;
    }

    public LocalDate getDepartureDate()
    {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate)
    {
        this.departureDate = departureDate;
    }

    public boolean isBreakfastIncluded()
    {
        return breakfastIncluded;
    }

    public void setBreakfastIncluded(boolean breakfastIncluded)
    {
        this.breakfastIncluded = breakfastIncluded;
    }

    public int getChildrenCount()
    {
        return childrenCount;
    }

    public void setChildrenCount(int childrenCount)
    {
        this.childrenCount = childrenCount;
    }

    public int getGuestsUnder18Count()
    {
        return guestsUnder18Count;
    }

    public void setGuestsUnder18Count(int guestsUnder18Count)
    {
        this.guestsUnder18Count = guestsUnder18Count;
    }

    public int getAdultsCount()
    {
        return adultsCount;
    }

    public void setAdultsCount(int adultsCount)
    {
        this.adultsCount = adultsCount;
    }

    /**
     * Calculate the total price of the requested booking
     * @return a double
     */
    public double calculateTotalPrice() {
        double totalPrice = room.calculatePrice();

        if(breakfastIncluded) {
            totalPrice += (childrenCount <= 4 ? 0 : (childrenCount + guestsUnder18Count + adultsCount) * 15.95);
        }

        return totalPrice;
    }

    /** A confirmation message of the booking */
    public void confirmBooking() {
        System.out.println("Booking confirmed for: " + guest.getEmail());
    }
}