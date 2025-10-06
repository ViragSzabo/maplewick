package test.implementation.week9.EventPlanningAndTicketing.Tickets;

import implementation.week9.EventPlanningAndTicketing.Attendee;
import implementation.week9.EventPlanningAndTicketing.Events.EventTypes;
import implementation.week9.EventPlanningAndTicketing.Events.MaplewickEvent;
import implementation.week9.EventPlanningAndTicketing.Tickets.MaplewickTicket;
import implementation.week9.EventPlanningAndTicketing.Tickets.Student;
import implementation.week9.EventPlanningAndTicketing.Tickets.TicketType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MaplewickTicketTest {
    private Attendee attendee;
    private MaplewickTicket ticket;
    private MaplewickEvent event;
    private TicketType student = new Student("Student", 50.0);

    @BeforeEach
    void setUp()
    {
        this.attendee = new Attendee("Ophelia");
        this.event = new MaplewickEvent("Fall Celebration", 1, "Main Hall", EventTypes.FESTIVAL, LocalDate.of(2025,10,28), 100);
        this.ticket = new MaplewickTicket(1, attendee, event, student);
    }

    @Test
    void getTicketId() {
        assertEquals(1, ticket.getTicketId());
        assertNotEquals(0, ticket.getTicketId());
    }

    @Test
    void getAttendee() {
        assertEquals(attendee, ticket.getAttendee());
        assertEquals(attendee.getName(), ticket.getAttendee().getName());
    }

    @Test
    void getEvent() {
        assertEquals(event, ticket.getEvent());
        assertEquals(event.getEventName(), ticket.getEvent().getEventName());
    }

    @Test
    void getTicketType() {
        assertEquals(student.getPrice(), ticket.getTicketType().getPrice());
        assertFalse(ticket.getTicketType().isEarlyAccess());
    }

    @Test
    void pay() {
        assertFalse(ticket.isPaid());
        ticket.pay();
        assertTrue(ticket.isPaid());
    }
}