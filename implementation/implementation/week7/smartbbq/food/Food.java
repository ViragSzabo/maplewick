package implementation.week7.smartbbq.food;

import implementation.week7.smartbbq.measures.Measurable;

public abstract class Food implements Measurable
{
    private static final double INITIAL_FRIDGE_TEMPERATURE = 8.0;

    private double currentTemperature;
    private double currentBrownPercentage;
    private double browningFactor;

    public Food(double browningFactor)
    {
        this.currentBrownPercentage = 0.0;
        setBrowningFactor(browningFactor);
        this.currentTemperature = INITIAL_FRIDGE_TEMPERATURE;
    }

    public double getCurrentBrownPercentage()
    {
        return this.currentBrownPercentage;
    }

    void setCurrentBrownPercentage(double percentage)
    {
        if (percentage < 0.0)
        {
            throw new IllegalArgumentException("Percentage must be a positive number");
        }

        this.currentBrownPercentage = percentage;
    }

    public double getBrowningFactor()
    {
        return this.browningFactor;
    }

    public void setBrowningFactor(double factor)
    {
        if (factor < 0.0)
        {
            throw new IllegalArgumentException("Factor must be a positive number");
        }

        this.browningFactor = factor;
    }

    public void increaseTemp()
    {
        this.currentTemperature += 0.5;
    }

    @Override
    public double getTemperature()
    {
        return this.currentTemperature;
    }

    public abstract void grill(double temperature);
}