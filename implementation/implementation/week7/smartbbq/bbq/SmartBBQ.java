package implementation.week7.smartbbq.bbq;

import implementation.week7.smartbbq.food.*;
import implementation.week7.smartbbq.measures.Measurable;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class SmartBBQ extends TimerTask implements Measurable
{
    private final ArrayList<Food> food;
    private int temperature;
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

    public void setTemperature(int temperature)
    {
        this.temperature = temperature;
    }

    public ArrayList<Food> getFood()
    {
        return food;
    }

    public void addFood(Food food)
    {
        this.food.add(food);
    }

    public void turnOn(int temp)
    {
        this.temperature = temp;
        this.timer = new Timer();
        this.timer.schedule(this, 0, 1000);
    }

    public void turnOff()
    {
        this.temperature = 0;
        this.timer.cancel();
        this.timer = null;
    }

    @Override
    public void run()
    {
        for(Food food : food)
        {
            food.grill(this.temperature);
        }
    }
}