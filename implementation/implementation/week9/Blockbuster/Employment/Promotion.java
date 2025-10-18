package implementation.week9.Blockbuster.Employment;

public enum Promotion {
    AUTUMN_FEST("🍁 Autumn Fest Discount - 10% off!"),
    SPOOKY_NIGHT("🎃 Halloween Special Screening");

    private final String message;
    Promotion(String message) { this.message = message; }
    public String getMessage() { return message; }
}