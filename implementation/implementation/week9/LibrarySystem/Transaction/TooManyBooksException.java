package implementation.week9.LibrarySystem.Transaction;

public class TooManyBooksException extends Exception
{
    public TooManyBooksException(String message)
    {
        super(message);
    }
}
