package implementation.week12.highcourt.strategies;

import implementation.week12.highcourt.court.Writ;
import implementation.week12.highcourt.exception.CouldNotClearWritException;
import implementation.week12.highcourt.inventory.Good;

import java.time.LocalDate;
import java.util.HashSet;

public abstract class Strategy
{
    private String name;
    private Writ writ;

    public Strategy(String name, Writ writ)
    {
        this.setName(name);
        this.setWrit(writ);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if (name == null || name.isEmpty())
        {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        this.name = name;
    }

    public Writ getWrit()
    {
        return writ;
    }

    public void setWrit(Writ writ)
    {
        if (writ == null)
        {
            throw new IllegalArgumentException("Writ cannot be null");
        }

        this.writ = writ;
    }

    public abstract StrategyResult getStrategyResult() throws CouldNotClearWritException;

    public double payOffDebtsByGoods(StrategyResult strategyResult)
    {
        double totalValueSeized = 0.0;
        int currentYear = LocalDate.now().getYear();
        String description = "Seizure by High Court";

        HashSet<Good> goodsToSeize = this.getWrit().getStrategyResult().getGoodsToBeSeized();

        if (goodsToSeize != null)
        {
            for (Good good : goodsToSeize)
            {
                double value = good.getValue(LocalDate.ofEpochDay(currentYear));
                totalValueSeized += value;
                strategyResult.addGoodsToBeSeized(good);
            }
        }

        return totalValueSeized;
    }

    public double payOffDebtsByCash(double remainingDebt)
    {
        double availableCash = this.getWrit().getClient().getCash();
        double cashToTake = 0.0;

        if (availableCash >= remainingDebt)
        {
            cashToTake = remainingDebt;
        }
        else
        {
            cashToTake = availableCash;
        }

        return cashToTake;
    }
}