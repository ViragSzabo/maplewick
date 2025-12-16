package implementation.week7.smartbbq.bbq;

import implementation.week7.smartbbq.fridge.*;
import implementation.week7.smartbbq.food.Meat;
import implementation.week7.smartbbq.measures.Thermometer;

public class BBQ
{
    public static void main(String[] args) throws NoMoreFoodException, FridgeIsEmptyException
    {
        SmartBBQ bbq = new SmartBBQ();
        Thermometer thermometer = new Thermometer();
        Meat meat;

        // Add food to fridge
        Fridge.getInstance().addFood(new Hamburger());
        Fridge.getInstance().addFood(new Sausage());
        Fridge.getInstance().addFood(new Corn());
        Fridge.getInstance().addFood(new BellPepper());

        try
        {
            meat = Fridge.getInstance().getNextMeat();
            bbq.addFood(meat);
            bbq.addFood(Fridge.getInstance().getNextMeat());
            bbq.turnOn(180);

            thermometer.measure(meat);
            bbq.setTemperature(200);
            thermometer.measure(meat);
        }
        catch (NoMoreFoodException | FridgeIsEmptyException e)
        {
            System.out.println(e.getMessage());
        }
    }
}