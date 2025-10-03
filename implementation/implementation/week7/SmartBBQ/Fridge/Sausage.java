package implementation.week7.SmartBBQ.Fridge;

import implementation.week7.SmartBBQ.Food.Meat;
import implementation.week7.SmartBBQ.Food.MeatType;

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