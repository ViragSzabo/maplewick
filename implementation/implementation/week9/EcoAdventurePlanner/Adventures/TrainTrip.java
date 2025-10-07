package implementation.week9.EcoAdventurePlanner.Adventures;

public class TrainTrip extends Adventure {
    public TrainTrip(double distance, DIFFICULTYLEVEL level, AdventureType type) {
        super(distance, level, type);
    }

    @Override
    public double calculateCost() {
        return this.distance * 0.20;
    }

    @Override
    public double calculateCO2() {
        return this.distance * 35.0;
    }

    @Override
    public double calculateDuration() {
        return this.distance * 0.02;
    }

    @Override
    public double calculateEcoScore() {
        return 100 - ((calculateCO2() / distance) * 0.8 + calculateCost() * 2.0 + calculateDuration() * 0.1);
    }
}