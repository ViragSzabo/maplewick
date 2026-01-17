package implementation.week14.grandhotel.room;

public class Penthouse extends Room
{
    private double jacuzziTemp;

    public Penthouse(int roomNumber, double basePrice, boolean hasView, int guests)
    {
        super(roomNumber, basePrice, hasView, guests);

        setJacuzziTemp(10);
    }

    @Override
    public double calculateBill(int nights)
    {
        return (getBasePrice() * 3) - (50 * nights);
    }

    public double getJacuzziTemp()
    {
        return jacuzziTemp;
    }

    public void setJacuzziTemp(double jacuzziTemp)
    {
        this.jacuzziTemp = jacuzziTemp;
    }
}