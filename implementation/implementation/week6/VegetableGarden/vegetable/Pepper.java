package implementation.week6.VegetableGarden.vegetable;

import implementation.week6.VegetableGarden.market.Sellable;

public class Pepper extends Vegetable implements Sellable
{
    public Pepper()
    {
        super(0.000044, 0.0013, 7, Colour.GREEN);
    }
    @Override
    public void growth(int lux, int mm, int amountOfDays)
    {
        if(amountOfDays > 4 && mm > 31)
        {
            this.setStatus(Status.DESTROYED);
            return;
        }

        if(amountOfDays > 10 && mm > 25)
        {
            return;
        }

        super.generalGrowth(lux, mm);
    }

    @Override
    public boolean isSellable()
    {
        return this.getStatus() == Status.READY_TO_HARVEST && this.getSizeInCm() >= 15.0 && this.getSizeInCm() <= 21.0;
    }

    @Override
    public double getPrice()
    {
        return this.getSizeInCm() * 0.15;
    }
}