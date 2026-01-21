package implementation.week14.menagerie.management;

import implementation.week14.menagerie.creatures.Creature;
import implementation.week14.menagerie.interfaces.Visible;

import java.util.ArrayList;
import java.util.List;

public class Sanctuary
{
    private List<Creature> creatures;

    public Sanctuary()
    {
        this.creatures = new ArrayList<>();
    }

    public void openToPublic()
    {
        for (Creature creature : creatures)
        {
            if (creature instanceof Visible)
            {
                creature.interactWithVisitors();
            }
            else
            {
                System.out.println(creature.getName() + ": [Restricted Area]");
            }
        }
    }

    public List<Creature> getCreatures()
    {
        return this.creatures;
    }

    public void addCreature(Creature creature)
    {
        this.creatures.add(creature);
    }

    public void removeCreature(Creature creature)
    {
        this.creatures.remove(creature);
    }
}