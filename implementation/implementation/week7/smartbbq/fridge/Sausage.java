package implementation.week7.smartbbq.fridge;

import implementation.week7.smartbbq.food.Meat;
import implementation.week7.smartbbq.food.MeatType;

public class Sausage extends Meat
{
    public Sausage()
    {
        super(MeatType.PIG, 80.0, 0.05);
    }

    @Override
    public String toString()
    {
        return "Sausage";
    }
}