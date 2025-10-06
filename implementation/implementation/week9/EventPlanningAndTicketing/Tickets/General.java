package implementation.week9.EventPlanningAndTicketing.Tickets;

public class General extends TicketType
{
    public General(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public boolean isEarlyAccess() { return false; }
}