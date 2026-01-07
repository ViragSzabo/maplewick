package implementation.week13.bio.bacterias;

import implementation.week13.bio.main.FermentationResult;
import implementation.week13.bio.status.ContaminationException;

public class SuperBacteria extends BacteriaCulture
{
    private static final int SUGAR_MIN_LIMIT = 50;
    private static final int SUGAR_MAX_LIMIT = 1000;
    private static final double SUGAR_DECAY_LOGIC = 0.0002;
    private static final double TIME_DECAY_PERCENTAGE = 0.001;
    private static final int STANDARD_ETHANOL_PRODUCTION = 50;
    private static final int STANDARD_WASTE_PRODUCTION_DECAY = 5;

    @Override
    public FermentationResult ferment(double sugarGrams, int timeSeconds) throws ContaminationException {
        // 1. Exception Checks
        checkException(sugarGrams);

        // 2. Vitality Update
        updateVitality(sugarGrams, timeSeconds);

        // 3. Production Logic
        double ethanol = calculateStandardEthanolProduction(sugarGrams);
        double waste = calculateStandardWasteProduction(sugarGrams, timeSeconds);

        return new FermentationResult(waste, ethanol);
    }

    // HELPER: To check if it does throw an exception
    private void checkException(double sugar) throws ContaminationException
    {
        if (sugar > SUGAR_MAX_LIMIT)
        {
            throw new ContaminationException("SuperBacteria is unstable: Too much sugar!");
        }
    }

    // HELPER: To calculate and check if the vitality decrease or not
    private void updateVitality(double sugar, int time) throws ContaminationException
    {
        if (sugar < SUGAR_MIN_LIMIT)
        {
            throw new ContaminationException("Sugar is too low to decrease!");
        }
        else
        {
            decreaseVitality((SUGAR_DECAY_LOGIC * sugar * time) + TIME_DECAY_PERCENTAGE);
        }
    }

    // HELPER: To calculate the standard logic of ethanol
    private double calculateStandardEthanolProduction(double sugar)
    {
        return STANDARD_ETHANOL_PRODUCTION * sugar;
    }

    // HELPER: To calculate the standard logic of waste
    private double calculateStandardWasteProduction(double sugar, int time)
    {
        return (sugar * time) / STANDARD_WASTE_PRODUCTION_DECAY;
    }
}