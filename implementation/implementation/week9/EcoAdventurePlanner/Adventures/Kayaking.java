package implementation.week9.EcoAdventurePlanner.Adventures;

public class Kayaking extends Adventure {
    public Kayaking(double distance, DIFFICULTYLEVEL level, AdventureType type) {
        super(distance, level, type);
    }

    @Override
    public double calculateCost() {
        return this.distance * 0.15;
    }

    @Override
    public double calculateCO2() {
        return this.distance * 10.0;
    }

    @Override
    public double calculateDuration() {
        return this.distance * 0.12;
    }

    @Override
    public double calculateEcoScore() {
        return 100 - ((calculateCO2() / distance) * 0.6 + calculateCost() * 1.5 + calculateDuration() * 0.4);
    }
}