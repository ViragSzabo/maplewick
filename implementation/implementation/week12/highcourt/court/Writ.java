package implementation.week12.highcourt.court;

import implementation.week12.highcourt.Client;
import implementation.week12.highcourt.strategies.StrategyResult;

public class Writ
{
    private Client client;
    private StrategyResult strategyResult;
    private double outstandingDebt;

    public Writ(Client client, StrategyResult strategyResult, double outstandingDebt)
    {
        this.setClient(client);
        this.setStrategyResult(strategyResult);
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
            throw new NullPointerException("cliet is null");
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

    public StrategyResult getStrategyResult()
    {
        return strategyResult;
    }

    public void setStrategyResult(StrategyResult strategyResult)
    {
        if (strategyResult == null)
        {
            throw new NullPointerException("strategy is null");
        }

        this.strategyResult = strategyResult;
    }
}