package implementation.week9.EventPlanningAndTicketing.Events;

public class SOLDOUTEXCEPTION extends Exception
{
    public SOLDOUTEXCEPTION()
    {
        super("❌ Sorry, this event is sold out!");
    }
}