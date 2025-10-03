package implementation.week6.VegetableGarden.garden;

import implementation.week6.VegetableGarden.vegetable.Vegetable;

import java.util.HashSet;

public interface GardenBase
{
    public void addVegetable(Vegetable vegetable) throws TooManyVegetablesException;
    public HashSet<Vegetable> getReadyForHarvest();
}