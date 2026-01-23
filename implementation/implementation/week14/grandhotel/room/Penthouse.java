package implementation.week14.grandhotel.room;

public class Penthouse extends Room
{
    private double jacuzziTemp;

    public Penthouse(int roomNumber, double basePrice, boolean hasView, int numberOfGuests, double jacuzziTemp)
    {
        super(roomNumber, basePrice, hasView, numberOfGuests);

        setJacuzziTemp(jacuzziTemp);
    }

    @Override
    public double calculateBill(int nights)
    {
        setCleanlinessScore(getCleanlinessScore() - (50 * nights));

        return (getBasePrice() * 3);
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