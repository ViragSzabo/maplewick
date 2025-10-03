package implementation.week4.Implementation.Airport.Luggage;

public class Luggage
{
    private double weight;
    private LuggageType type;

    /**
     * Constructor of a Luggage
     * @param weight is a double
     * @param type is a carry on or a hold
     */
    public Luggage(double weight, LuggageType type)
    {
        this.weight = weight;
        this.type = type;
    }

    /**
     * Get the weight of the luggage
     * @return a double
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     * Get the type of the luggage
     * @return a carry-on or a hold
     */
    public LuggageType getType()
    {
        return type;
    }

    /**
     * Change the weight of the luggage
     * @param weight is the new double
     */
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    /**
     * Change the type of the luggage
     * @param type is the new type of the luggage
     */
    public void setType(LuggageType type)
    {
        this.type = type;
    }
}