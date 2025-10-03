package implementation.week7.SmartBBQ.Fridge;

import implementation.week7.SmartBBQ.Food.Food;
import implementation.week7.SmartBBQ.Food.Meat;
import implementation.week7.SmartBBQ.Food.Vegetable;
import implementation.week7.SmartBBQ.Measures.Measurable;

import java.util.ArrayList;

public class Fridge implements Measurable
{
    private static Fridge instance;
    private final ArrayList<Food> foods;
    private double temperature;

    private Fridge() {
        this.foods = new ArrayList<>();
        temperature = 8.0;
    }

    public static Fridge getInstance()
    {
        if (instance == null)
        {
            instance = new Fridge();
        }
        return instance;
    }

    @Override
    public double getTemperature() {
        return this.temperature;
    }

    public ArrayList<Food> getFoods()
    {
        return this.foods;
    }

    public void addFood(Food food)
    {
        this.foods.add(food);
    }

    public Meat getNextMeat() throws FridgeIsEmptyException, NoMoreFoodException
    {
        return (Meat) getNextItem(Types.MEAT);
    }

    public Vegetable getNextVegetable() throws FridgeIsEmptyException, NoMoreFoodException
    {
        return (Vegetable) getNextItem(Types.VEGETABLE);
    }

    public Food getNextItem(Types type) throws FridgeIsEmptyException, NoMoreFoodException
    {
        if (!this.foods.isEmpty())
        {
            for(int i = 0; i < this.foods.size(); i++)
            {
                Food food = this.foods.get(i);
                switch (type)
                {
                    case VEGETABLE:
                        if(food instanceof Vegetable)
                        {
                            return this.foods.remove(i);
                        }
                        break;
                    case MEAT:
                        if(food instanceof Meat)
                        {
                            return this.foods.remove(i);
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        else {
            throw new FridgeIsEmptyException();
        }
        throw new NoMoreFoodException(type.name());
    }

    public void clear()
    {
        this.foods.clear();
    }
}