package implementation.week7.SmartBBQ.Fridge;

import implementation.week7.SmartBBQ.Food.Vegetable;

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