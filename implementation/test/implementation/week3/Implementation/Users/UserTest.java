package implementation.week3.Implementation.Users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user1;
    User user2;
    User user3;
    User user4;

    @BeforeEach
    void setUp() {
        this.user1 = new User("Alice", "alice@example.com", LocalDate.of(2005, 5, 15));
        this.user2 = new User("Bob", "bob@wrong-email", LocalDate.of(2010, 2, 20));
        this.user3 = new User("Charlie", "charlie@example.com", LocalDate.of(1985, 10, 5));
        this.user4 = new User("Dave", "dave@example.com", LocalDate.of(2007, 8, 8));
    }

    @Test
    public void testGetAge() {
        assertEquals(19, user1.getAge());
        assertEquals(14, user2.getAge());
        assertEquals(39, user3.getAge());
        assertEquals(17, user4.getAge());
    }
}