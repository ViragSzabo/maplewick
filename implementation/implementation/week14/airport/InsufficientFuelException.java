package implementation.week14.airport;

public class InsufficientFuelException extends Exception
{
    public InsufficientFuelException(String message)
    {
        super(message);
    }
}