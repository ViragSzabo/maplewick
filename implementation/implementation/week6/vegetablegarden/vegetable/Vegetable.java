package implementation.week6.vegetablegarden.vegetable;

public abstract class Vegetable
{
    private double sizeInCm;
    private double cmPerLux;
    private double cmPerMilimeter;
    private int ripeLength;
    private Colour colour;
    private Status status;

    /** Constructor */
    public Vegetable(double cmPerLux, double cmPerMilimeter, int ripeLength, Colour colour)
    {
        this.sizeInCm = 0;

        setCmPerLux(cmPerLux);
        setCmPerMilimeter(cmPerMilimeter);
        setRipeLength(ripeLength);
        setColour(colour);

        this.status = Status.GROWING;
    }

    public double getSizeInCm()
    {
        return sizeInCm;
    }

    public double getCmPerLux()
    {
        return cmPerLux;
    }

    public void setCmPerLux(double cmPerLux)
    {
        if (cmPerLux < 0.0)
        {
            throw new IllegalArgumentException("cmPerLux cannot be less than 0");
        }

        this.cmPerLux = cmPerLux;
    }

    public double getCmPerMilimeter()
    {
        return this.cmPerMilimeter;
    }

    public void setCmPerMilimeter(double cmPerMilimeter)
    {
        if (cmPerMilimeter < 0.0)
        {
            throw new IllegalArgumentException("cmPerMilimeter cannot be less than 0");
        }

        this.cmPerMilimeter = cmPerMilimeter;
    }

    public int getRipeLength()
    {
        return this.ripeLength;
    }

    public void setRipeLength(int ripeLength)
    {
        if (ripeLength < 0)
        {
            throw new IllegalArgumentException("Ripe length cannot be less than 0");
        }

        this.ripeLength = ripeLength;
    }

    public Colour getColor()
    {
        return this.colour;
    }

    public void setColour(Colour colour)
    {
        if (colour == null)
        {
            throw new IllegalArgumentException("Colour cannot be null");
        }

        this.colour = colour;
    }

    public Status getStatus()
    {
        return this.status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    protected void addSizeInCm(double sizeInCm)
    {
        this.sizeInCm += sizeInCm;

        if (this.getSizeInCm() >= this.getRipeLength())
        {
            this.setStatus(Status.READY_TO_HARVEST);
        }
    }

    protected void generalGrowth(int lux, int mm)
    {
        double growthFactor = (lux * this.getCmPerLux()) / (mm * this.getCmPerMilimeter());
        this.addSizeInCm(growthFactor);
    }

    public abstract void growth(int lux, int mm, int amountOfDays);
}