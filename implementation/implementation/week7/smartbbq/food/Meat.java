package implementation.week7.smartbbq.food;

public abstract class Meat extends Food
{
    private double currentCookedPercentage;
    private double cookedFactor;
    private MeatType type;

    public Meat(MeatType type, double cookedFactor, double browningFactor)
    {
        super(browningFactor);
        this.currentCookedPercentage = 0.0;
        this.cookedFactor = cookedFactor;
        this.type = type;
    }

    public double getCurrentCookedPercentage()
    {
        return currentCookedPercentage;
    }

    public MeatType getType()
    {
        return this.type;
    }

    @Override
    public void grill(double temperature)
    {
        this.setCurrentBrownPercentage(this.getCurrentBrownPercentage() + this.getBrowningFactor() * (temperature / 100));
        this.currentCookedPercentage += (1 / (this.cookedFactor * Math.PI) * temperature);
    }
}