package implementation.week9.EcoFriendlyTravelPlanner.Vehicles;

public class Walking extends TravelOption
{
    public Walking(double distance)
    {
        super(distance);
    }

    @Override
    public double calculateCost() {
        return this.distance * 0.00;
    }

    @Override
    public double calculateCO2() {
        return this.distance * 0.0;
    }

    @Override
    public double calculateTime() {
        return this.distance * 0.15;
    }

    @Override
    public String getName()
    {
        return "Walking";
    }

    @Override
    public double getEcoScore() {
        return 100.0;
    }
}