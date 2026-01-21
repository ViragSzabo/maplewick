package implementation.week14.menagerie.creatures;

import implementation.week14.menagerie.enums.Diet;
import implementation.week14.menagerie.exceptions.CreatureExhaustedException;
import implementation.week14.menagerie.interfaces.Visible;

public class Dragon extends Creature implements Visible
{
    private static final int ENERGY_COST = 20;

    private int firePower;

    public Dragon(String name, int firePower)
    {
        super(name, Diet.CARNIVORE);
        setFirePower(firePower);
    }

    @Override
    public void performMagic() throws CreatureExhaustedException
    {
        if (getEnergyLevel() < ENERGY_COST)
        {
            throw new CreatureExhaustedException("Creature too exhausted.");
        }

        breathFire();
        System.out.println(this.getName() + " breathes fire.");
    }

    @Override
    public void interactWithVisitors()
    {
        System.out.println(this.getName() + " is interacting with the visitors.");
    }

    private void breathFire()
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