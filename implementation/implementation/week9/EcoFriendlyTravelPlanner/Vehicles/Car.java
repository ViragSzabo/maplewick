package implementation.week9.EcoFriendlyTravelPlanner.Vehicles;

public class Car extends TravelOption
{
    public Car(double distance)
    {
        super(distance);
    }

    @Override
    public double calculateCost() {
        return this.distance * 0.25;
    }

    @Override
    public double calculateCO2() {
        return this.distance * 120.0;
    }

    @Override
    public double calculateTime() {
        return this.distance * 0.06;
    }

    @Override
    public String getName()
    {
        return "Car";
    }

    @Override
    public double getEcoScore() {
        return 100 - ((calculateCO2() / getDistance()) / 2 + calculateCost() * 2); // heuristic eco score
    }
}