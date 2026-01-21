package implementation.week14.menagerie.creatures;

import implementation.week14.menagerie.enums.Diet;
import implementation.week14.menagerie.interfaces.Visible;

public class Phoenix extends Creature implements Visible
{
    private static final int FULL_ENERGY_TO_IGNITE = 100;
    private int rebirthCount;

    public Phoenix(String name, Diet diet)
    {
        super(name, Diet.MAGIC_EATER);
    }

    public void ignite()
    {
        if (getEnergyLevel() != FULL_ENERGY_TO_IGNITE)
        {
            throw new IllegalArgumentException("Ignitre is not possible yet.");
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