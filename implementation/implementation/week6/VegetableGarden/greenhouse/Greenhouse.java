package implementation.week6.VegetableGarden.greenhouse;

import implementation.week6.VegetableGarden.garden.Garden;
import implementation.week6.VegetableGarden.vegetable.Vegetable;

public class Greenhouse extends Garden
{
    public void run()
    {
        int lux = WeatherGenerator.getLux();
        int mm = WeatherGenerator.getMm();

        for(Vegetable vegetable : this.getVegetables())
        {
            vegetable.growth(lux, mm, 1);
        }
    }
}