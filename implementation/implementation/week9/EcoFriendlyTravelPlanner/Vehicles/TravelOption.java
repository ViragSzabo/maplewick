package implementation.week9.EcoFriendlyTravelPlanner.Vehicles;

public abstract class TravelOption
{
    protected final double distance; // km - immutability & subclasses to get access directly

    public TravelOption(double distance)
    {
        this.distance = distance;
    }

    public double getDistance()
    {
        return distance;
    }

    public abstract double calculateCost();

    public abstract double calculateCO2();

    public abstract double calculateTime();

    public abstract String getName();

    public abstract double getEcoScore();

    @Override
    public String toString() {
        return getName() +
                " — Distance: " + distance + " km, " +
                "Cost: €" + calculateCost() +
                ", CO₂: " + calculateCO2() + "g, " +
                "Time: " + calculateTime() + "h";
    }
}