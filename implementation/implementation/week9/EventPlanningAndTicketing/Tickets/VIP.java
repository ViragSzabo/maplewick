package implementation.week9.EventPlanningAndTicketing.Tickets;

public class VIP extends TicketType
{
    public VIP(String name, double basePrice) {
        super(name, basePrice * 2);
    }

    @Override
    public boolean isEarlyAccess() { return true; }
}