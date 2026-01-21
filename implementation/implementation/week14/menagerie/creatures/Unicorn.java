package implementation.week14.menagerie.creatures;

import implementation.week14.menagerie.enums.Diet;
import implementation.week14.menagerie.exceptions.CreatureExhaustedException;
import implementation.week14.menagerie.interfaces.Visible;

public class Unicorn extends Creature implements Visible
{
    private static final int ENERGY_COST = 5;

    private boolean isPure;

    public Unicorn(String name, boolean isPure)
    {
        super(name, Diet.HERBIVORE);
        setPure(isPure);
    }

    @Override
    public void performMagic() throws CreatureExhaustedException
    {
        if (getEnergyLevel() < ENERGY_COST)
        {
            throw new CreatureExhaustedException("Creature too exhausted.");
        }

        purifyWater();
        System.out.println(this.getName() + " purifies water.");
    }

    private void purifyWater()
    {
        setEnergyLevel(getEnergyLevel() - 5);
    }

    @Override
    public void interactWithVisitors()
    {
        System.out.println(this.getName() + " bows politely.");
    }

    public boolean isPure()
    {
        return isPure;
    }

    public void setPure(boolean pure)
    {
        isPure = pure;
    }
}