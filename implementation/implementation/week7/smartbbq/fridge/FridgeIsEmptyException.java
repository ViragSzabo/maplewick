package implementation.week7.smartbbq.fridge;

public class FridgeIsEmptyException extends Exception
{
    public FridgeIsEmptyException()
    {
        super("The fridge is empty...");
    }
}