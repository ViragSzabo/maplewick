package implementation.week14.grandhotel.room;

public class Suite extends Room
{
    private int size; //m2

    public Suite(int roomNumber, double basePrice, boolean hasView, int guests)
    {
        super(roomNumber, basePrice, hasView, guests);

        this.size = 100;
    }

    @Override
    public double calculateBill(int nights)
    {
        setCleanlinessScore(getCleanlinessScore() - (10 * nights));

        if (getGuests() > 2)
        {
            int extra = getGuests() - 2;
            return (getBasePrice() + (extra * 50));
        }
        else
        {
            return (getBasePrice() + (this.size * 2)) * nights;
        }
    }

    public int getSize()
    {
        return size;
    }

    private void setSize(int size)
    {
        if (size < 0)
        {
            throw new IllegalArgumentException("Size cannot be negative");
        }

        this.size = size;
    }
}