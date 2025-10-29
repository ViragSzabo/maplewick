package implementation.week11.CelestialOrchestra.Exceptions;

public class OverchargeException extends Exception {
    public OverchargeException() {
        super("WARNING! It is getting overcharged!");
    }
}