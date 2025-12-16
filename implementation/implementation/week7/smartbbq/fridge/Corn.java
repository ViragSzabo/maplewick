package implementation.week7.smartbbq.fridge;

import implementation.week7.smartbbq.food.Vegetable;

public class Corn extends Vegetable
{
    public Corn()
    {
        super(0.05, 0.08);
    }

    @Override
    public String toString()
    {
        return "Corn";
    }
}