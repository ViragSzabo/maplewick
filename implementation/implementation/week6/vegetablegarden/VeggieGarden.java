package implementation.week6.vegetablegarden;

import implementation.week6.vegetablegarden.garden.*;
import implementation.week6.vegetablegarden.greenhouse.*;
import implementation.week6.vegetablegarden.vegetable.*;

import java.util.HashSet;

public class VeggieGarden
{
    public static void main(String[] args)
    {
        Garden garden = new Garden();
        Greenhouse greenhouse = new Greenhouse();

        try
        {
            // Plant some vegetables
            garden.addVegetable(new Asparagus());
            garden.addVegetable(new Pepper());

            // Make the sun shine and rain over 10 days
            for (int i = 0; i < 10; i++)
            {
                int sunshine = WeatherGenerator.getLux();
                int rain = WeatherGenerator.getMm();
                greenhouse.run();

                System.out.println("Day " + (i + 1) + ": Sunshine = " + sunshine + " lux, Rain = " + rain + " mm");
            }

            // Harvest all ready vegetables
            HashSet<Vegetable> harvest = garden.getReadyForHarvest();
            System.out.println("Vegetables ready to harvest: " + harvest.size());

            for (Vegetable v : harvest)
            {
                System.out.println(v.getClass().getSimpleName() + " is ready with size " + v.getRipeLength() + " cm");
            }

            // Test too many vegetables exception
            for (int i = 0; i < 28; i++)
            {
                garden.addVegetable(new Kale());
            }

        }
        catch (TooManyVegetablesException e)
        {
            System.out.println(e.getMessage());
        }
    }
}