package implementation.week4.Implementation.Hotel.Guests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuestTest {
    Guest guest;

    @BeforeEach
    void setUp() {
        this.guest = new Guest("John Doe", "123 Main St", "john@example.com", "+123456789");
    }

    @Test
    void register() {
        guest.register();
        assertEquals("John Doe", guest.getName());
        assertEquals("123 Main St", guest.getAddress());
        assertEquals("john@example.com", guest.getEmail());
        assertEquals("+123456789", guest.getPhoneNumber());
    }
}