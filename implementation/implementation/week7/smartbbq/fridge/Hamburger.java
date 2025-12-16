package implementation.week7.smartbbq.fridge;

import implementation.week7.smartbbq.food.Meat;
import implementation.week7.smartbbq.food.MeatType;

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