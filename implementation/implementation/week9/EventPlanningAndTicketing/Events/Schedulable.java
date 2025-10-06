package implementation.week9.EventPlanningAndTicketing.Events;

import java.time.LocalDate;

public interface Schedulable
{
    public LocalDate getDate();
    public void reschedule(LocalDate reschedule);
}