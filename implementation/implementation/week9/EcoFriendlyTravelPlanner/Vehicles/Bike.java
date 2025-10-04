package implementation.week9.EcoFriendlyTravelPlanner.Vehicles;

public class Bike extends TravelOption
{
    public Bike(double distance)
    {
        super(distance);
    }

    @Override
    public double calculateCost() {
        return this.distance * 0.02;
    }

    @Override
    public double calculateCO2() {
        return this.distance * 0.0;
    }

    @Override
    public double calculateTime() {
        return this.distance * 0.2;
    }

    @Override
    public String getName()
    {
        return "Bike";
    }

    @Override
    public double getEcoScore() {
        return 100 - (calculateCost() * 2 + (calculateCO2() / getDistance()) / 3 + calculateTime() * 0.8);
    }
}