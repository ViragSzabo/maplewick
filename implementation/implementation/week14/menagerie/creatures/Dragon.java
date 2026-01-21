package implementation.week14.menagerie.creatures;

import implementation.week14.menagerie.enums.Diet;
import implementation.week14.menagerie.interfaces.Visible;

public class Dragon extends Creature implements Visible
{
    private int firePower;

    public Dragon(String name, Diet diet, int firePower)
    {
        super(name, Diet.CARNIVORE);
        setFirePower(firePower);
    }

    @Override
    public void interactWithVisitors()
    {
        System.out.println(this.getName() + " is interacting with the visitors.");
    }

    public void breathFire()
    {
        setEnergyLevel(getEnergyLevel() - 20);
    }

    public int getFirePower()
    {
        return firePower;
    }

    public void setFirePower(int firePower)
    {
        if (firePower < 0)
        {
            throw new IllegalArgumentException("Fire power cannot be negative");
        }

        this.firePower = firePower;
    }
}