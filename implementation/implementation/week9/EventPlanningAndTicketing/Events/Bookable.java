package implementation.week9.EventPlanningAndTicketing.Events;

import implementation.week9.EventPlanningAndTicketing.Attendee;

public interface Bookable
{
    public void book() throws SOLDOUTEXCEPTION;
    public void cancel();
    public int getRemainingSeats();
    public boolean isBookedBy(Attendee attendee);
}