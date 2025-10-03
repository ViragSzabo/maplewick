package implementation.week4.Implementation.Hotel.Rooms;

public abstract class Room
{
    protected double area;
    protected double pricePerNight;

    public Room(double area)
    {
        this.area = area;
    }

    public abstract double calculatePrice();
}