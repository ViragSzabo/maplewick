package implementation.week7.smartbbq.fridge;

import implementation.week7.smartbbq.food.Vegetable;

public class BellPepper extends Vegetable
{
    public BellPepper()
    {
        super(0.1, 0.03);
    }

    @Override
    public String toString()
    {
        return "Bell Pepper";
    }
}