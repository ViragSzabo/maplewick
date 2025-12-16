package implementation.week12.highcourt.court;

import implementation.week12.highcourt.strategies.Strategy;

public class Order
{
    private Strategy strategy;

    public Order(Strategy strategy)
    {
        this.setStrategy(strategy);
    }

    public Strategy getStrategy()
    {
        return strategy;
    }

    public void setStrategy(Strategy strategy)
    {
        if (strategy == null)
        {
            throw new IllegalArgumentException("Strategy cannot be null");
        }

        this.strategy = strategy;
    }
}