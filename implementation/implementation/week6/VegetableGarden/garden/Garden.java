package implementation.week6.VegetableGarden.garden;

import implementation.week6.VegetableGarden.vegetable.*;
import implementation.week6.VegetableGarden.market.*;

import java.util.HashSet;

public class Garden {
    private static final int MAX_VEGETABLES = 27;
    private final HashSet<Vegetable> vegetables;
    private final Market market;

    public Garden()
    {
        this.vegetables = new HashSet<>();
        this.market = new Market();
    }

    public HashSet<Vegetable> getVegetables()
    {
        return this.vegetables;
    }

    public void addVegetable(Vegetable vegetable) throws TooManyVegetablesException
    {
        if(this.vegetables.size() < MAX_VEGETABLES)
        {
            this.vegetables.add(vegetable);
        }
        else
        {
            throw new TooManyVegetablesException();
        }

        if(vegetable instanceof Sellable)
        {
            this.market.addSellables((Sellable) vegetable);
        }
    }

    public HashSet<Vegetable> getReadyForHarvest()
    {
        HashSet<Vegetable> readyForHarvest = new HashSet<>();

        for(Vegetable vegetable : this.vegetables)
        {
            if(vegetable.getStatus() == Status.READY_TO_HARVEST)
            {
                readyForHarvest.add(vegetable);
            }
        }

        return readyForHarvest;
    }
}