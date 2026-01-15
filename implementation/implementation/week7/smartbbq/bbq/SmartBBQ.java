package implementation.week7.smartbbq.bbq;

import implementation.week7.smartbbq.food.*;
import implementation.week7.smartbbq.measures.Measurable;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class SmartBBQ extends TimerTask implements Measurable
{
    private static final int MAX_FOOD_PIECES = 6;
    private static final int MAX_TEMP = 250;

    private final ArrayList<Food> food;
    private double temperature;
    private Timer timer;

    public SmartBBQ()
    {
        this.food = new ArrayList<>();
        this.temperature = 0;
    }

    public double getTemperature()
    {
        return temperature;
    }

    public void setTemperature(double temp)
    {
        if (temp > MAX_TEMP)
        {
            throw new IllegalArgumentException("Temperature should be less than 250.");
        }

        this.temperature = temp;
    }

    public ArrayList<Food> getFood()
    {
        return food;
    }

    public void addFood(Food food)
    {
        if (this.food.size() > MAX_FOOD_PIECES)
        {
            throw new IllegalArgumentException("The fridge is full!");
        }

        this.food.add(food);
    }

    public void turnOn(double temp)
    {
        setTemperature(temp);
        checkTimer();
        this.timer = new Timer();
        this.timer.schedule(this, 0, 1000);
    }

    public void turnOff()
    {
        this.temperature = 0;
        checkTimer();
    }

    private void checkTimer()
    {
        if (this.timer != null)
        {
            this.timer.cancel();
            throw new IllegalArgumentException("The timer is cancelled!");
        }
    }

    @Override
    public void run()
    {
        for (Food food : food)
        {
            food.grill(this.temperature);
        }
    }
}