package implementation.week6.vegetablegarden.garden;

import implementation.week6.vegetablegarden.vegetable.Vegetable;

import java.util.HashSet;

public interface GardenBase
{
    void addVegetable(Vegetable vegetable) throws TooManyVegetablesException;
    HashSet<Vegetable> getReadyForHarvest();
}