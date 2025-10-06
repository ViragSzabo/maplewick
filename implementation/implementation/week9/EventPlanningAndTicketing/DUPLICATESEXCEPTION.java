package implementation.week9.EventPlanningAndTicketing;

public class DUPLICATESEXCEPTION extends Exception
{
    public DUPLICATESEXCEPTION()
    {
        super("This attendee already has a ticket!");
    }
}