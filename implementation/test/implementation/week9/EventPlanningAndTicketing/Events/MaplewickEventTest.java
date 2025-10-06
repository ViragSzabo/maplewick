package test.implementation.week9.EventPlanningAndTicketing.Events;

import implementation.week9.EventPlanningAndTicketing.Attendee;
import implementation.week9.EventPlanningAndTicketing.Events.EventTypes;
import implementation.week9.EventPlanningAndTicketing.Events.MaplewickEvent;
import implementation.week9.EventPlanningAndTicketing.Tickets.MaplewickTicket;
import implementation.week9.EventPlanningAndTicketing.Tickets.TicketType;
import implementation.week9.EventPlanningAndTicketing.Tickets.VIP;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MaplewickEventTest {
    private Attendee attendee;
    private MaplewickTicket ticket;
    private MaplewickEvent event;
    private TicketType VIP;

    @BeforeEach
    void setUp() {
        this.VIP = new VIP("VIP", 50.0);
        this.attendee = new Attendee("Ophelia");
        this.event = new MaplewickEvent("Fall Celebration", 1, "Main Hall", EventTypes.FESTIVAL, LocalDate.of(2025,10,28), 100);
        this.ticket = new MaplewickTicket(1, attendee, event, VIP);
    }

    @Test
    void getCurrentTickets() {
        assertTrue(event.getCurrentTickets().isEmpty());
        assertEquals(0, event.getCurrentTickets().size());
    }

    @Test
    void addTicket() {
        event.addTicket(ticket);
        assertTrue(event.getCurrentTickets().contains(ticket));
        assertEquals(1, event.getCurrentTickets().size());
    }

    @Test
    void showEventInfo() {
        event.addTicket(ticket);
        event.showEventInfo();
        assertEquals("Fall Celebration", event.getEventName());
        assertEquals(1, event.getEventId());
        assertEquals("Main Hall", event.getEventLocation());
        assertEquals(EventTypes.FESTIVAL, event.getEventType());
        assertEquals(LocalDate.of(2025,10,28), event.getEventDate());
        assertEquals(100, event.getMAX_CAPACITY());
    }
}