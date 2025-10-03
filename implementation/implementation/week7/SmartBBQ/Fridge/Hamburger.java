package implementation.week7.SmartBBQ.Fridge;

import implementation.week7.SmartBBQ.Food.Meat;
import implementation.week7.SmartBBQ.Food.MeatType;

public class Hamburger extends Meat
{
    public Hamburger() {
        super(MeatType.COW, 100.0, 0.06);
    }

    @Override
    public String toString()
    {
        return "Hamburger";
    }
}