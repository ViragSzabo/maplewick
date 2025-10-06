package implementation.week9.EventPlanningAndTicketing.Tickets;

import implementation.week9.EventPlanningAndTicketing.Attendee;
import implementation.week9.EventPlanningAndTicketing.Events.MaplewickEvent;

public class MaplewickTicket implements Payable
{
    private int ticketId;
    private Attendee attendee;
    private MaplewickEvent event;
    private TicketType ticketType;
    private boolean paid;

    public MaplewickTicket(int ticketId, Attendee attendee, MaplewickEvent event, TicketType ticketType)
    {
        this.ticketId = ticketId;
        this.attendee = attendee;
        this.event = event;
        this.ticketType = ticketType;
        this.paid = false;
    }

    public int getTicketId()
    {
        return this.ticketId;
    }

    public Attendee getAttendee()
    {
        return this.attendee;
    }

    public MaplewickEvent getEvent()
    {
        return this.event;
    }

    public TicketType getTicketType()
    {
        return ticketType;
    }

    @Override
    public boolean isPaid()
    {
        return this.paid;
    }

    @Override
    public double getPrice() {
        return this.ticketType.getPrice();
    }

    @Override
    public void pay()
    {
        this.paid = true;
    }
}