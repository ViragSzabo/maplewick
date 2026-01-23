package implementation.week14.grandhotel.room;

public abstract class Room
{
    private static final int INITIAL_CLEANLINESS_SCORE = 100;

    private int roomNumber;
    private double basePrice;
    private int cleanlinessScore;
    private boolean hasView;
    private int numberOfGuests;
    private boolean booked;

    public Room(int roomNumber, double basePrice, boolean hasView, int numberOfGuests)
    {
        setRoomNumber(roomNumber);
        setBasePrice(basePrice);
        setHasView(hasView);
        setNumberOfGuests(numberOfGuests);
        this.cleanlinessScore = INITIAL_CLEANLINESS_SCORE;
        this.booked = false;
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber)
    {
        if (roomNumber < 0)
        {
            throw new IllegalArgumentException("Room number cannot be negative");
        }

        this.roomNumber = roomNumber;
    }

    public int getCleanlinessScore()
    {
        return this.cleanlinessScore;
    }

    public void setCleanlinessScore(int cleanlinessScore)
    {
        this.cleanlinessScore = cleanlinessScore;
    }

    public double getBasePrice()
    {
        return this.basePrice;
    }

    public void setBasePrice(double basePrice)
    {
        this.basePrice = basePrice;
    }

    public boolean hasView()
    {
        return this.hasView;
    }

    public void setHasView(boolean hasView)
    {
        this.hasView = hasView;
    }

    public int getNumberOfGuests()
    {
        return this.numberOfGuests;
    }

    public void setNumberOfGuests(int guests)
    {
        this.numberOfGuests = guests;
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
        setCleanlinessScore(INITIAL_CLEANLINESS_SCORE);
    }
}