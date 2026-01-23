package implementation.week14.grandhotel.room;

public class Standard extends Room
{
    private static final double HAS_VIEW_PERCENTAGE = 10.0;
    private static final int CLEANLINESS_DROP_PER_USE = 20;

    public Standard(int roomNumber, double basePrice, boolean hasView, int numberOfGuests)
    {
        super(roomNumber, basePrice, hasView, numberOfGuests);
    }

    @Override
    public double calculateBill(int nights)
    {
        if (hasView())
        {
            this.setBasePrice(this.getBasePrice() * (HAS_VIEW_PERCENTAGE / 100));
        }

        setCleanlinessScore(this.getCleanlinessScore() - (CLEANLINESS_DROP_PER_USE * nights));

        return this.getBasePrice();
    }
}