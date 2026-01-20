package implementation.week14.cybernetic;

public class LowBatteryException extends Exception
{
    public LowBatteryException(String message)
    {
        super(message);
    }
}