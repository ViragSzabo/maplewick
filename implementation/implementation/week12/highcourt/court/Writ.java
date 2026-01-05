package implementation.week12.highcourt.court;

import implementation.week12.highcourt.Client;
import implementation.week12.highcourt.inventory.Good;
import implementation.week12.highcourt.strategies.StrategyResult;

import java.util.HashSet;

public class Writ
{
    private Client client;
    // private StrategyResult strategyResult; created in a method as a result of something
    private double outstandingDebt;
    private HashSet<Good> goodsToSeized;

    public Writ(Client client, double outstandingDebt)
    {
        this.setClient(client);
        this.setOutstandingDebt(outstandingDebt);
    }

    public Client getClient()
    {
        return client;
    }

    public void setClient(Client client)
    {
        if (client == null)
        {
            throw new NullPointerException("client is null");
        }

        this.client = client;
    }

    public double getOutstandingDebt()
    {
        return outstandingDebt;
    }

    public void setOutstandingDebt(double outstandingDebt)
    {
        if (outstandingDebt < 0)
        {
            throw new IllegalArgumentException("outstandingDebt is negative");
        }

        this.outstandingDebt = outstandingDebt;
    }

    // Getters, add and remove from the hashset
}