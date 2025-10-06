package test.implementation.week9.EventPlanningAndTicketing;

import implementation.week9.EventPlanningAndTicketing.Attendee;
import implementation.week9.EventPlanningAndTicketing.Events.EventTypes;
import implementation.week9.EventPlanningAndTicketing.Events.MaplewickEvent;
import implementation.week9.EventPlanningAndTicketing.Events.SOLDOUTEXCEPTION;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AttendeeTest {
    private Attendee attendee;
    private MaplewickEvent event;

    @BeforeEach
    void setUp() {
        this.attendee = new Attendee("Ophelia");
        this.event = new MaplewickEvent("Fall Celebration", 1, "Main Hall", EventTypes.FESTIVAL, LocalDate.of(2025,10,28), 100);
    }

    @Test
    void getName() {
        assertEquals("Ophelia", attendee.getName());
    }

    @Test
    void setName() {
        attendee.setName("Ophelia Taylor");
        assertEquals("Ophelia Taylor", attendee.getName());
    }

    @Test
    void getTickets() {
        assertTrue(attendee.getTickets().isEmpty());
    }

    @Test
    void cancelEvent() throws SOLDOUTEXCEPTION {
        attendee.buyTicket(event);
        attendee.cancelEvent(event);
        assertEquals(0, attendee.getTickets().size());
        assertTrue(attendee.getTickets().isEmpty());
    }

    @Test
    void buyTicket() throws SOLDOUTEXCEPTION {
        attendee.buyTicket(event);
        assertFalse(attendee.getTickets().isEmpty());
        assertEquals(1, attendee.getTickets().size());
    }
}