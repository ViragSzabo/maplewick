package implementation.week2.Implementation.UserValidation.User;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;

    @BeforeEach
    public void setUp() {
        user = new User("Boo", "atteezz20.", "boo.seventeen@gmail.com", new Date(1994,Calendar.MAY,2));
    }

    @Test
    public void testTestGetName() {
        assertEquals("Boo", user.getName());
    }

    @Test
    public void testTestSetName() {
        user.setName("BooBear");
        assertEquals("BooBear", user.getName());
    }

    @Test
    public void testGetPassword() {
        assertEquals("atteezz20.", user.getPassword());
    }

    @Test
    public void testSetPassword() {
        user.setPassword("atteezz29.");
        assertEquals("atteezz29.", user.getPassword());
    }

    @Test
    public void testGetEmail() {
        assertEquals("boo.seventeen@gmail.com", user.getEmail());
    }

    @Test
    public void testSetEmail() {
        user.setEmail("boo.seventeen7@gmail.com");
        assertEquals("boo.seventeen7@gmail.com", user.getEmail());
    }

    @Test
    public void testGetDateOfBirth() {
        assertEquals(new Date(1994, Calendar.MAY,2), user.getDateOfBirth());
    }

    @Test
    public void testSetDateOfBirth() {
        user.setDateOfBirth(new Date(1994, Calendar.JULY,2));
        assertEquals(new Date(1994, Calendar.JULY,2), user.getDateOfBirth());
    }
}