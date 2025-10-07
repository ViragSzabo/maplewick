package implementation.week9.EcoAdventurePlanner.Adventures;

public abstract class Adventure {
    protected double distance;
    protected DIFFICULTYLEVEL level;
    protected AdventureType type;

    public Adventure(double distance, DIFFICULTYLEVEL level, AdventureType type) {
        this.distance = distance;
        this.level = level;
        this.type = type;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public DIFFICULTYLEVEL getLevel() {
        return this.level;
    }

    public void setLevel(DIFFICULTYLEVEL level) {
        this.level = level;
    }

    public AdventureType getType() {
        return this.type;
    }

    public void setType(AdventureType type) { this.type = type; }

    public abstract double calculateCost();
    public abstract double calculateCO2();
    public abstract double calculateDuration();
    public abstract double calculateEcoScore();
}