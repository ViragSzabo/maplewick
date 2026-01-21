package implementation.week14.menagerie.creatures;

import implementation.week14.menagerie.enums.Diet;

public abstract class Creature
{
    private static final int DEFAULT_ENERGY_LEVEL = 50;

    private String name;
    private int energyLevel; // 0 - 100
    private Diet diet;

    public Creature(String name, Diet diet)
    {
        setName(name);
        setDiet(diet);
        setEnergyLevel(DEFAULT_ENERGY_LEVEL);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if (name == null)
        {
            throw new IllegalArgumentException("Name cannot be null");
        }

        this.name = name;
    }

    public int getEnergyLevel()
    {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel)
    {
        if (energyLevel < 0 && energyLevel > 100)
        {
            throw new IllegalArgumentException("Energy level must be greater than 0 and less than 100.");
        }

        this.energyLevel = energyLevel;
    }

    public Diet getDiet()
    {
        return diet;
    }

    public void setDiet(Diet diet)
    {
        if (diet == null)
        {
            throw new IllegalArgumentException("Diet may not be null");
        }

        this.diet = diet;
    }
}