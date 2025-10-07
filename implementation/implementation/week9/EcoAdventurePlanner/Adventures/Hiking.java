package implementation.week9.EcoAdventurePlanner.Adventures;

public class Hiking extends Adventure {
    public Hiking(double distance, DIFFICULTYLEVEL level, AdventureType type) {
        super(distance, level, type);
    }

    @Override
    public double calculateCost() {
        return this.distance * 0.05;
    }

    @Override
    public double calculateCO2() {
        return this.distance;
    }

    @Override
    public double calculateDuration() {
        return this.distance * 0.25;
    }

    @Override
    public double calculateEcoScore() {
        return 100 - ((calculateCO2() / distance) * 0.3 + calculateCost() + calculateDuration() * 0.2);
    }
}