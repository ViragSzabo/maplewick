package implementation.week9.EcoFriendlyTravelPlanner.Vehicles;

public class ElectricCar extends TravelOption
{
    public ElectricCar(double distance)
    {
        super(distance);
    }

    @Override
    public double calculateCost() {
        return this.distance * 0.10;
    }

    @Override
    public double calculateCO2() {
        return this.distance * 20.0;
    }

    @Override
    public double calculateTime() {
        return this.distance * 0.065;
    }

    @Override
    public String getName()
    {
        return "ElectricCar";
    }

    @Override
    public double getEcoScore() {
        return 100 - ((calculateCO2() / getDistance()) / 2 + calculateCost()); // greener weighting
    }
}