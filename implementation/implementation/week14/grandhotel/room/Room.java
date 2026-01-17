package implementation.week14.grandhotel.room;

public abstract class Room
{
    private static final int INITIAL_CLEANLINESS_SCORE = 100;

    private int roomNumber;
    private double basePrice;
    private int cleanlinessScore;
    private boolean hasView;
    private int guests;
    private boolean booked;

    public Room(int roomNumber, double basePrice, boolean hasView, int guests)
    {
        setRoomNumber(roomNumber);
        setBasePrice(basePrice);
        setHasView(hasView);
        setGuests(guests);
        this.cleanlinessScore = INITIAL_CLEANLINESS_SCORE;
        this.booked = false;
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public int getCleanlinessScore()
    {
        return cleanlinessScore;
    }

    public void setCleanlinessScore(int cleanlinessScore)
    {
        this.cleanlinessScore = cleanlinessScore;
    }

    public double getBasePrice()
    {
        return basePrice;
    }

    public void setBasePrice(double basePrice)
    {
        this.basePrice = basePrice;
    }

    public boolean isHasView()
    {
        return hasView;
    }

    public void setHasView(boolean hasView)
    {
        this.hasView = hasView;
    }

    public int getGuests()
    {
        return this.guests;
    }

    public void setGuests(int guests)
    {
        this.guests = guests;
    }

    public boolean isBooked()
    {
        return booked;
    }

    public void setBooked(boolean booked)
    {
        this.booked = booked;
    }

    public void checkIn() throws RoomDirtyException
    {
        if (cleanlinessScore < 50)
        {
            throw new RoomDirtyException("Cleanliness score is lower than 50. Booking is not possible!");
        }

        setBooked(true);
    }

    public abstract double calculateBill(int nights);

    public void cleanRoom()
    {
        setCleanlinessScore(100);
    }
}