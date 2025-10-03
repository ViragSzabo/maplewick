package implementation.week2.Implementation.UserValidation.User;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class UserStorageTest {
    User user;
    UserStorage userStorage;

    @BeforeEach
    void setUp() {
        user = new User("Boo", "atteezz20.", "boo.seventeen@gmail.com", new Date(1994, Calendar.MAY,2));
        userStorage = new UserStorage();
    }

    @Test
    void getUsernames() {
        assertEquals(0, userStorage.getUsernames().size());
    }

    @Test
    void setUsernames() {
        HashSet set = new HashSet();
        userStorage.setUsernames(set);
        assertEquals(0, userStorage.getUsernames().size());
    }

    @Test
    void addUser() {
        userStorage.addUser(user);
        assertEquals(1, userStorage.getUsernames().size());
    }
}