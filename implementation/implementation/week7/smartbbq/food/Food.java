package implementation.week7.smartbbq.food;

import implementation.week7.smartbbq.measures.Measurable;

public abstract class Food implements Measurable
{
    private double currentTemperature;
    private double currentBrownPercentage;
    private double browningFactor;

    public Food(double browningFactor) {
        this.currentBrownPercentage = 0.0;
        this.browningFactor = browningFactor;
    }

    public double getCurrentTemperature()
    {
        return this.currentTemperature;
    }

    public double getCurrentBrownPercentage()
    {
        return this.currentBrownPercentage;
    }

    void setCurrentBrownPercentage(double percentage)
    {
        this.currentBrownPercentage = percentage;
    }

    public double getBrowningFactor()
    {
        return this.browningFactor;
    }

    @Override
    public double getTemperature()
    {
        return this.currentTemperature;
    }

    public abstract void grill(double temperature);
}