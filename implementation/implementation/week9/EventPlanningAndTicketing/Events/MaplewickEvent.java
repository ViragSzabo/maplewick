package implementation.week9.EventPlanningAndTicketing.Events;

import implementation.week9.EventPlanningAndTicketing.Attendee;
import implementation.week9.EventPlanningAndTicketing.Tickets.MaplewickTicket;

import java.time.LocalDate;
import java.util.HashSet;

public class MaplewickEvent implements Bookable, Schedulable
{
    private int eventId;
    private String eventName;
    private String eventLocation;
    private EventTypes eventType;
    private LocalDate eventDate;
    private int MAX_CAPACITY;
    private HashSet<MaplewickTicket> tickets;

    public MaplewickEvent(String eventName, int eventId, String eventLocation, EventTypes eventType, LocalDate eventDate, int MAX_CAPACITY)
    {
        this.eventName = eventName;
        this.eventId = eventId;
        this.eventLocation = eventLocation;
        this.eventType = eventType;
        this.eventDate = eventDate;
        this.MAX_CAPACITY = MAX_CAPACITY;
        this.tickets = new HashSet<>();
    }

    public int getEventId()
    {
        return this.eventId;
    }

    public String getEventName()
    {
        return this.eventName;
    }

    public String getEventLocation()
    {
        return this.eventLocation;
    }

    public int getMAX_CAPACITY()
    {
        return this.MAX_CAPACITY;
    }

    public EventTypes getEventType()
    {
        return this.eventType;
    }

    public HashSet<MaplewickTicket> getCurrentTickets()
    {
        return this.tickets;
    }

    public void addTicket(MaplewickTicket t)
    {
        this.tickets.add(t);
    }

    public void showEventInfo()
    {
        System.out.println("🎟️ " + eventName + " — Tickets Sold: " + tickets.size() + "/" + MAX_CAPACITY);
    }

    @Override
    public void book() throws SOLDOUTEXCEPTION {
        if(tickets.size() >= MAX_CAPACITY)
        {
            throw new SOLDOUTEXCEPTION();
        }
        System.out.println("Successfully booked for: " + eventName);
    }

    @Override
    public void cancel() {
        System.out.println("Sorry to hear about the cancellation of " + eventName);
    }

    @Override
    public int getRemainingSeats() {
        return MAX_CAPACITY - tickets.size();
    }

    @Override
    public boolean isBookedBy(Attendee attendee) {
        for(MaplewickTicket ticket : tickets)
        {
            if(ticket.getAttendee().equals(attendee))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public LocalDate getDate()
    {
        return this.eventDate;
    }

    @Override
    public void reschedule(LocalDate reschedule)
    {
        this.eventDate = reschedule;
        System.out.println(this.getEventName() + " is rescheduled for: " + reschedule);
    }
}