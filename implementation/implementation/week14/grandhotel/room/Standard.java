package implementation.week14.grandhotel.room;

public class Standard extends Room
{
    private static final int HAS_VIEW_PERCENTAGE = 10;
    private static final int CLEANLINESS_DROP_PER_USE = 20;

    public Standard(int roomNumber, double basePrice, boolean hasView, int guests)
    {
        super(roomNumber, basePrice, hasView, guests);
    }

    @Override
    public double calculateBill(int nights)
    {
        if (isHasView())
        {
            this.setBasePrice(this.getBasePrice() * HAS_VIEW_PERCENTAGE);
        }

        setCleanlinessScore(this.getCleanlinessScore() - (CLEANLINESS_DROP_PER_USE * nights));

        return this.getBasePrice();
    }
}