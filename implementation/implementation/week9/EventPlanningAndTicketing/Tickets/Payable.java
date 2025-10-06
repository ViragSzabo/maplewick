package implementation.week9.EventPlanningAndTicketing.Tickets;

public interface Payable
{
    public double getPrice();
    public void pay();
    public boolean isPaid();
}