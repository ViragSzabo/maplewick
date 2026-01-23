package implementation.week14.grandhotel.room;

public class Suite extends Room
{
    private int size; //m2

    public Suite(int roomNumber, double basePrice, boolean hasView, int numberOfGuests, int size)
    {
        super(roomNumber, basePrice, hasView, numberOfGuests);

        setSize(size);
    }

    @Override
    public double calculateBill(int nights)
    {
        setCleanlinessScore(getCleanlinessScore() - (10 * nights));

        if (getNumberOfGuests() > 2)
        {
            int extra = getNumberOfGuests() - 2;
            return ((getBasePrice() + (this.size * 2))  * nights) + (extra * 50);
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