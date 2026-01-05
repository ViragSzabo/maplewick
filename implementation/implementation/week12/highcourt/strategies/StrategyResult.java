package implementation.week12.highcourt.strategies;

import implementation.week12.highcourt.inventory.Good;

import java.util.HashSet;

public class StrategyResult
{
    private HashSet<Good> goodsToBeSeized;
    private double cashToBeCollected;

    public StrategyResult(double cashToBeCollected)
    {
        this.setCashToBeCollected(cashToBeCollected);
        this.goodsToBeSeized = new HashSet<>();
    }

    public HashSet<Good> getGoodsToBeSeized()
    {
        return goodsToBeSeized;
    }

    public void addGoodsToBeSeized(Good good)
    {
        // validation
        this.goodsToBeSeized.add(good);
    }

    public void removeGoodsToBeSeized(Good good)
    {
        // validation
        this.goodsToBeSeized.remove(good);
    }

    public double getCashToBeCollected()
    {
        return cashToBeCollected;
    }

    public void setCashToBeCollected(double cashToBeCollected)
    {
        if (cashToBeCollected < 0)
        {
            throw new IllegalArgumentException("CashToBeCollected cannot be negative");
        }

        this.cashToBeCollected = cashToBeCollected;
    }
}