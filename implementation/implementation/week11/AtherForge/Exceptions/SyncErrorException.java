package implementation.week11.AtherForge.Exceptions;

public class SyncErrorException extends Exception {
    public SyncErrorException() {
        super("Sync is instable!");
    }
}