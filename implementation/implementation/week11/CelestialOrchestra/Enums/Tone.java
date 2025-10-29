package implementation.week11.CelestialOrchestra.Enums;

public enum Tone {
    SOFT(5),
    BRIGHT(10),
    CHAOTIC(20);

    /** Attributes: unique power depending on the body's tone */
    private final int resonancePower;

    /** Constructor */
    Tone(int resonancePower) {
        this.resonancePower = resonancePower;
    }

    /** Get the resonance power for the type */
    public int getResonancePower() {
        return resonancePower;
    }
}