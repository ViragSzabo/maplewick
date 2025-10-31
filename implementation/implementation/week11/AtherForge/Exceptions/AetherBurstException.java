package implementation.week11.AtherForge.Exceptions;

public class AetherBurstException extends Exception {
    public AetherBurstException() {
        super("WARNING! The charging exceeds 120!");
    }
}