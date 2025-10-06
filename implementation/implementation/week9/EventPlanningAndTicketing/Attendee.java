package implementation.week9.EventPlanningAndTicketing;

import implementation.week9.EventPlanningAndTicketing.Events.MaplewickEvent;
import implementation.week9.EventPlanningAndTicketing.Events.SOLDOUTEXCEPTION;
import implementation.week9.EventPlanningAndTicketing.Tickets.General;
import implementation.week9.EventPlanningAndTicketing.Tickets.MaplewickTicket;
import implementation.week9.EventPlanningAndTicketing.Tickets.TicketType;

import java.util.HashSet;

public class Attendee
{
    private String name;
    private HashSet<MaplewickTicket> tickets;

    public Attendee(String name)
    {
        this.name = name;
        this.tickets = new HashSet<>();
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String changed)
    {
        this.name = changed;
    }

    public HashSet<MaplewickTicket> getTickets()
    {
        return this.tickets;
    }

    public void cancelEvent(MaplewickEvent e)
    {
        this.tickets.removeIf(ticket -> ticket.getEvent().equals(e));
    }

    public void buyTicket(MaplewickEvent e) throws SOLDOUTEXCEPTION
    {
        MaplewickTicket newTicket = new MaplewickTicket(
                e.getCurrentTickets().size()+1,
                this, e, new General("General", 50.0));
        this.tickets.add(newTicket);
        e.addTicket(newTicket);

        if (e.getCurrentTickets().size() >= e.getMAX_CAPACITY())
        {
            throw new SOLDOUTEXCEPTION();
        }
    }
}