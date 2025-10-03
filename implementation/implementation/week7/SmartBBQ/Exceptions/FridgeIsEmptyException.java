package implementation.week7.SmartBBQ.Exceptions;

public class FridgeIsEmptyException extends Exception
{
    public FridgeIsEmptyException(String message)
    {
        super(message);
    }
}