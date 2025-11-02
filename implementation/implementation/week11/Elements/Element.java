package implementation.week11.Elements;

public enum Element {
    FIRE(15),
    WATER(10),
    EARTH(12),
    AIR(8);

    private final int boost;

    Element(int boost) {
        this.boost = boost;
    }

    public int getBoost() {
        return boost;
    }
}