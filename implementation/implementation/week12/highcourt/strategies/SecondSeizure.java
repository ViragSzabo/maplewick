package implementation.week12.highcourt.strategies;

import implementation.week12.highcourt.court.Writ;
import implementation.week12.highcourt.exception.CouldNotClearWritException;

public class SecondSeizure extends Strategy
{
    public SecondSeizure(String name, Writ writ)
    {
        super(name, writ);
    }

    @Override
    public StrategyResult getStrategyResult() throws CouldNotClearWritException
    {
        // Step 1: Setup
        double currentDebt = this.getWrit().getOutstandingDebt();

        StrategyResult strategyResult = new StrategyResult(0);

        // Step 2: Pay off debts by cash
        if (currentDebt > 0)
        {
            double cashTaken = payOffDebtsByCash(currentDebt);
            strategyResult.setCashToBeCollected(cashTaken);
            currentDebt -= cashTaken;
        }

        // Step 3: Pay off debts by goods
        currentDebt -= payOffDebtsByGoods(strategyResult);

        if (currentDebt != 0)
        {
            throw new CouldNotClearWritException("Couldn't clear debt");
        }

        return strategyResult;
    }
}