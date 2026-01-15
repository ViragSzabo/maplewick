package implementation.week7.smartbbq.food;

public abstract class Vegetable extends Food
{
    protected double moistPercentage;
    protected double moistFactor;

    public Vegetable(double moistFactor, double browningFactor)
    {
        super(browningFactor);

        this.moistPercentage = 100.0;
        setMoistFactor(moistFactor);
    }

    public double getMoistPercentage()
    {
        return this.moistPercentage;
    }

    public double getMoistFactor()
    {
        return this.moistFactor;
    }

    public void setMoistFactor(double moistFactor)
    {
        if (moistFactor < 0.0)
        {
            throw new IllegalArgumentException("Cooked factor must be a positive number");
        }

        this.moistFactor = moistFactor;
    }

    public void decreaseMoistPercentage(double difference)
    {
        if (this.moistPercentage - difference < 0.0)
        {
            this.moistPercentage = 0.0;
            return;
        }

        this.moistPercentage -= difference;
    }

    @Override
    public void grill(double temperature)
    {
        this.increaseTemp();
        this.setCurrentBrownPercentage(this.getBrowningFactor() * temperature);
        this.decreaseMoistPercentage(this.moistFactor * temperature);
    }
}