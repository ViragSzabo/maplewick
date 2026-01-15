package implementation.week7.smartbbq.fridge;

public class FridgeIsEmptyException extends Exception
{
    public FridgeIsEmptyException(String message)
    {
        super(message);
    }
}