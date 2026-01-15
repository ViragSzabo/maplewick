package implementation.week6.vegetablegarden.vegetable;

public class Kale extends Vegetable
{
    // static final variables!!

    public Kale()
    {
        super(0.0057, 0.032, 16, Colour.PINK);
    }

    @Override
    public void growth(int lux, int mm, int amountOfDays)
    {
        if (amountOfDays == 6 && mm > 40)
        {
            return;
        }

        super.generalGrowth(lux, mm);
    }
}