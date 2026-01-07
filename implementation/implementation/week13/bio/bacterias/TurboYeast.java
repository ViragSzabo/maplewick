package implementation.week13.bio.bacterias;

import implementation.week13.bio.main.FermentationResult;
import implementation.week13.bio.status.ContaminationException;

public class TurboYeast extends BacteriaCulture
{
    private static final double SUGAR_INPUT = 100.0;
    private static final double CRITICAL_TIME_LIMIT = 80.0;
    private static final double CRITICAL_SUGAR_LIMIT = 500.0;
    private static final double MIN_VITALITY_PERCENTAGE = 5.0;
    private static final double ETHANOL_WASTE_HIGH_PERCENTAGE = 4.0;
    private static final double ETHANOL_WASTE_LOW_PERCENTAGE = 2.0;
    private static final double ETHANOL_VITALITY_HIGH_PERCENTAGE = 0.5;
    private static final double DECREASE_VITALITY_PERCENTAGE = 0.5;

    @Override
    public FermentationResult ferment(double sugarMg, int timeSeconds) throws ContaminationException
    {
        // 1. Exception Checks
        checkException(sugarMg, timeSeconds);

        // 2. Vitality Update
        decreaseVitality(DECREASE_VITALITY_PERCENTAGE * timeSeconds);

        // 3. Production Logic
        double ethanol = calculateEthanolProduction(sugarMg, timeSeconds);
        double waste = calculateWasteProduction(sugarMg, timeSeconds);

        return new FermentationResult(waste, ethanol);
    }

    // HELPER: To check if it does throw an exception
    private void checkException(double sugar, int time) throws ContaminationException
    {
        if (time > CRITICAL_TIME_LIMIT && sugar > CRITICAL_SUGAR_LIMIT)
        {
            throw new ContaminationException("TurboYeast unstable: High time and sugar input!");
        }

        if (getVitalityPercentage() < MIN_VITALITY_PERCENTAGE)
        {
            throw new ContaminationException("TurboYeast died: Vitality too low!");
        }
    }

    // HELPER: To calculate the production logic of ethanol
    private double calculateEthanolProduction(double sugar, int time)
    {
        if (sugar > SUGAR_INPUT)
        {
            return sugar * time * ETHANOL_VITALITY_HIGH_PERCENTAGE;
        }
        else
        {
            return sugar * Math.sqrt(time);
        }
    }

    // HELPER: To calculate the production logic of waste
    private double calculateWasteProduction(double sugar, int time)
    {
        if (sugar > SUGAR_INPUT)
        {
            return time / ETHANOL_WASTE_HIGH_PERCENTAGE;
        }
        else
        {
            return time / ETHANOL_WASTE_LOW_PERCENTAGE;
        }
    }
}