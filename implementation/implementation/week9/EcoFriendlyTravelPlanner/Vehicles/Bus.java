package implementation.week9.EcoFriendlyTravelPlanner.Vehicles;

public class Bus extends TravelOption
{
    public Bus(double distance)
    {
        super(distance);
    }

    @Override
    public double calculateCost() {
        return this.distance * 0.10;
    }

    @Override
    public double calculateCO2() {
        return this.distance * 80.0;
    }

    @Override
    public double calculateTime() {
        return this.distance * 0.07;
    }

    @Override
    public String getName()
    {
        return "Bus";
    }

    @Override
    public double getEcoScore() {
        return 100 - ((calculateCO2() / getDistance()) / 3 + calculateCost() * 1.5);
    }
}