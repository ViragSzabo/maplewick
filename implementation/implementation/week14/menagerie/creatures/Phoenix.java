package implementation.week14.menagerie.creatures;

import implementation.week14.menagerie.enums.Diet;
import implementation.week14.menagerie.exceptions.CreatureExhaustedException;
import implementation.week14.menagerie.interfaces.Visible;

public class Phoenix extends Creature implements Visible
{
    private static final int ENERGY_COST = 100;

    private int rebirthCount;

    public Phoenix(String name, Diet diet)
    {
        super(name, Diet.MAGIC_EATER);
    }

    @Override
    public void eat(Diet foodType)
    {
        if (foodType != Diet.MAGIC_EATER)
        {
            throw new IllegalArgumentException("Yuck!");
        }
        else if (getEnergyLevel() == 100)
        {
            throw new IllegalArgumentException(getName() + " is full.");
        }

        setEnergyLevel(getEnergyLevel() + 20);
    }

    @Override
    public void performMagic() throws CreatureExhaustedException
    {
        if (getEnergyLevel() < ENERGY_COST)
        {
            throw new CreatureExhaustedException("Creature too exhausted.");
        }

        ignite();
        System.out.println(this.getName() + " ignites.");
    }

    private void ignite()
    {
        if (getEnergyLevel() != ENERGY_COST)
        {
            throw new IllegalArgumentException("Ignite is not possible yet.");
        }

        setEnergyLevel(getEnergyLevel() - 100);
        rebirthCount++;
        setEnergyLevel(50);
    }

    @Override
    public void interactWithVisitors()
    {
        System.out.println(this.getName() + " flashes with blinding light.");
    }

    public int getRebirthCount()
    {
        return rebirthCount;
    }
}