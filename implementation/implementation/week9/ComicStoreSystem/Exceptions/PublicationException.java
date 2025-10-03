package implementation.week9.ComicStoreSystem.Exceptions;

public class PublicationException extends Exception {
    private final String message;

    public PublicationException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}