package implementation.week4.Implementation.Hotel.Rooms;

public class Normal extends Room
{
    public Normal(double area)
    {
        super(area);
        this.pricePerNight = 10;
    }

    @Override
    public double calculatePrice()
    {
        return area * pricePerNight;
    }
}