package implementation.week6.vegetablegarden.market;

import java.util.HashSet;

public class Market
{
    private final HashSet<Sellable> sellables;

    public Market()
    {
        this.sellables = new HashSet<>();
    }

    public HashSet<Sellable> getSellables()
    {
        return sellables;
    }

    public void addSellables(Sellable sellable)
    {
        this.sellables.add(sellable);
    }

    public double getProfit()
    {
        double profit = 0.0;

        for(Sellable sellable : sellables)
        {
            if(sellable.isSellable())
            {
                profit += sellable.getPrice();
            }
        }
        return profit;
    }
}