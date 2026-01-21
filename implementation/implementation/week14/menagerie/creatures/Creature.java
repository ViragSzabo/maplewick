package implementation.week14.menagerie.creatures;

import implementation.week14.menagerie.enums.Diet;
import implementation.week14.menagerie.exceptions.CreatureExhaustedException;
import implementation.week14.menagerie.interfaces.Visible;

public abstract class Creature implements Visible
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

    public void eat(Diet foodType)
    {
        boolean canEat = false;

        // 1. Omnivore Diet
        if (this.diet == Diet.OMNIVORE)
        {
            if (foodType != Diet.MAGIC_EATER)
            {
                canEat = true;
            }
        }

        // 2. Normal Diet
        else if (this.diet == foodType)
        {
            canEat = true;
        }

        // 3. Execution
        if (!canEat)
        {
            throw new IllegalArgumentException("Yuck!");
        }

        // 4. Common Logic
        if (this.energyLevel >= 100)
        {
            throw new IllegalArgumentException("Full!");
        }

        setEnergyLevel(Math.min(100, energyLevel + 20));
        System.out.println(this.name + " eats " + foodType);
    }

    public abstract void performMagic() throws CreatureExhaustedException;

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
        if (energyLevel < 0 || energyLevel > 100)
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