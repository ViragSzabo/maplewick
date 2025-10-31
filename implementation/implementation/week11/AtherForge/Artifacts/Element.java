package implementation.week11.AtherForge.Artifacts;

public enum Element {
    AIR(10),
    FIRE(20),
    EARTH(15),
    WATER(12);

    private final int basePower;

    Element(int base) {
        this.basePower = base;
    }

    public int getBasePower() {
        return basePower;
    }
}