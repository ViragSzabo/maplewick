package implementation.week7.SmartBBQ.Fridge;

public class NoMoreFoodException extends Exception
{
    public NoMoreFoodException(String type)
    {
        super("No more food of type, " + type +"!");
    }
}