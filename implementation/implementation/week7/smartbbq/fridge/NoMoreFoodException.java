package implementation.week7.smartbbq.fridge;

public class NoMoreFoodException extends Exception
{
    public NoMoreFoodException(String message)
    {
        super(message);
    }
}