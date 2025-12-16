package implementation.week7.smartbbq.food;

public abstract class Vegetable extends Food
{
    protected double moistPercentage;
    protected double moistFactor;

    public Vegetable(double moistFactor, double browningFactor)
    {
        super(browningFactor);
        this.moistPercentage = 100.0;
        this.moistFactor = moistFactor;
    }

    public double getMoistPercentage()
    {
        return this.moistPercentage;
    }

    public void decreaseMoistPercentage(double difference)
    {
        if(this.moistPercentage - difference < 0.0)
        {
            this.moistPercentage = 0.0;
            return;
        }
        this.moistPercentage -= difference;
    }

    @Override
    public void grill(double temperature)
    {
        this.setCurrentBrownPercentage(this.getBrowningFactor() * temperature);
        this.decreaseMoistPercentage(this.moistFactor * temperature);
    }
}