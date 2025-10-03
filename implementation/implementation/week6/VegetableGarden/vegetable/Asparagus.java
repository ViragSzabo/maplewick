package implementation.week6.VegetableGarden.vegetable;

import implementation.week6.VegetableGarden.market.Sellable;

public class Asparagus  extends Vegetable implements Sellable
{
    public Asparagus()
    {
        super(0.000027, 0.0049, 20, Colour.ORANGE);
    }

    @Override
    public void growth(int lux, int mm, int amountOfDays)
    {
        if(amountOfDays == 10 && mm < 14)
        {
            this.setStatus(Status.DESTROYED);
            return;
        }

        super.generalGrowth(lux, mm);
    }

    @Override
    public boolean isSellable()
    {
        return this.getStatus() == Status.READY_TO_HARVEST && this.getSizeInCm() <= 29.0;
    }

    @Override
    public double getPrice()
    {
        return this.getSizeInCm() * 0.12;
    }
}