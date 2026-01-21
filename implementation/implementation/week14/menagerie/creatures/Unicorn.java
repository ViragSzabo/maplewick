package implementation.week14.menagerie.creatures;

import implementation.week14.menagerie.enums.Diet;
import implementation.week14.menagerie.interfaces.Visible;

public class Unicorn extends Creature implements Visible
{
    private boolean isPure;

    public Unicorn(String name, Diet diet, boolean isPure)
    {
        super(name, Diet.HERBIVORE);
        setPure(isPure);
    }

    public void purifyWater()
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