package implementation.week7.SmartBBQ.Fridge;

public class FridgeIsEmptyException extends Exception
{
    public FridgeIsEmptyException()
    {
        super("The fridge is empty...");
    }
}