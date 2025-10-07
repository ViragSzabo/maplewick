package implementation.week9.EcoAdventurePlanner.Adventures;

public class Cycling extends Adventure {
    public Cycling(double distance, DIFFICULTYLEVEL level, AdventureType type) {
        super(distance, level, type);
    }

    @Override
    public double calculateCost() {
        return this.distance * 0.08;
    }

    @Override
    public double calculateCO2() {
        return this.distance * 5.0;
    }

    @Override
    public double calculateDuration() {
        return this.distance * 0.1;
    }

    @Override
    public double calculateEcoScore() {
        return 100 - ((calculateCO2() / distance) * 0.4 + calculateCost() * 1.2 + calculateDuration() * 0.3);
    }
}