package implementation.week9.EcoFriendlyTravelPlanner.Vehicles;

public class Train extends TravelOption
{
    public Train(double distance)
    {
        super(distance);
    }

    @Override
    public double calculateCost() {
        return this.distance * 0.15;
    }

    @Override
    public double calculateCO2() {
        return this.distance * 14.0;
    }

    @Override
    public double calculateTime() {
        return this.distance * 0.04;
    }

    @Override
    public String getName()
    {
        return "Train";
    }

    @Override
    public double getEcoScore() {
        return 100 - ((calculateCO2() / getDistance()) / 3 + calculateCost() * 1.5 + calculateTime() * 0.5);
    }
}