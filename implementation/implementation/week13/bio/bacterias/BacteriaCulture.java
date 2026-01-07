package implementation.week13.bio.bacterias;

import implementation.week13.bio.main.FermentationResult;
import implementation.week13.bio.status.ContaminationException;

public abstract class BacteriaCulture
{
    private static final double INITIAL_VITALITY_PERCENTAGE = 100.0;

    private double vitalityPercentage;

    public BacteriaCulture()
    {
        this.vitalityPercentage = INITIAL_VITALITY_PERCENTAGE;
    }

    public double getVitalityPercentage()
    {
        return this.vitalityPercentage;
    }

    public abstract FermentationResult ferment(double sugarGrams, int timeSeconds) throws ContaminationException;

    // HELPER: Safe decrease to prevent going below 0.
    protected void decreaseVitality(double amount)
    {
        this.vitalityPercentage -= amount;

        if (this.vitalityPercentage < 0)
        {
            this.vitalityPercentage = 0;
        }
    }
}