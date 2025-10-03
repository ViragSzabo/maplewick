package implementation.week7.SmartBBQ.BBQ;

import implementation.week7.SmartBBQ.Fridge.*;
import implementation.week7.SmartBBQ.Food.Meat;
import implementation.week7.SmartBBQ.Food.Vegetable;
import implementation.week7.SmartBBQ.Measures.Thermometer;

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