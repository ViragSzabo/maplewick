package implementation.week7.smartbbq.bbq;

import implementation.week7.smartbbq.food.Food;
import implementation.week7.smartbbq.fridge.*;
import implementation.week7.smartbbq.food.Meat;
import implementation.week7.smartbbq.measures.Result;
import implementation.week7.smartbbq.measures.Thermometer;

public class BBQ
{
    public static void main(String[] args) throws NoMoreFoodException, FridgeIsEmptyException
    {
        // 1. Make a SmartBBQ
        SmartBBQ bbq = new SmartBBQ();
        Thermometer thermometer = new Thermometer();
        Fridge fridge = Fridge.getInstance();

        try
        {
            // 2. Put three corn cobs and two bell peppers in the fridge
            fridge.addFood(new Corn());
            fridge.addFood(new Corn());
            fridge.addFood(new Corn());
            fridge.addFood(new BellPepper());
            fridge.addFood(new BellPepper());

            // 3. Put two hamburgers and three sausages in the fridge
            fridge.addFood(new Hamburger());
            fridge.addFood(new Hamburger());
            fridge.addFood(new Sausage());
            fridge.addFood(new Sausage());
            fridge.addFood(new Sausage());

            // 4. Put three pieces of meat on the SmartBBQ
            System.out.println("Moving meat from Fridge to BBQ...");
            bbq.addFood(fridge.getNextMeat());
            bbq.addFood(fridge.getNextMeat());
            bbq.addFood(fridge.getNextMeat());

            // 5. Turn on the SmartBBQ with a temperature of 180 degrees
            System.out.println("Turning on BBQ to 180 degrees...");
            bbq.turnOn(180);

            // Let it cook for a moment (simulation)
            Thread.sleep(2000);

            // 6. Measure the temperature of a piece of meat
            Food firstMeat = bbq.getFood().get(0);
            Result res1 = thermometer.measure(firstMeat);
            System.out.println("First Measurement: " + res1.getTemp() + " (" + res1.getTempClass() + ")");

            // 7. Increase the temperature to 200 degrees
            System.out.println("Increasing heat to 200 degrees...");
            bbq.setTemperature(200);

            // Let it cook for a moment
            Thread.sleep(2000);

            // 8. Measure the temperature of the meat again
            Result res2 = thermometer.measure(firstMeat);
            System.out.println("Second Measurement: " + res2.getTemp() + " (" + res2.getTempClass() + ")");

            // Stop the timer
            bbq.turnOff();
        }
        catch (NoMoreFoodException | FridgeIsEmptyException | InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}