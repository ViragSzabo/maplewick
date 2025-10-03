package implementation.week7.SmartBBQ.Fridge;

import implementation.week7.SmartBBQ.Food.Vegetable;

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