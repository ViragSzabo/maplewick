package implementation.week2.Implementation.UserValidation.User;

import implementation.week2.Implementation.UserValidation.Validation.ValidationException;
import implementation.week2.Implementation.UserValidation.ValidationRule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTest {
    User user;
    UserStorage userStorage;
    UserValidator validator;
    ValidationRule validationRule;

    @BeforeEach
    void setUp() {
        this.user = new User("Boo", "atteezz20.", "boo.seventeen@gmail.com", new Date(1994, Calendar.MAY,2));
        this.userStorage = new UserStorage();
        this.validator = new UserValidator(userStorage);
        this.validationRule = new ValidationRule() {
            @Override
            public void isValid(User user) throws ValidationException {
            }
        };
    }

    @Test
    void getValidationRuleList() {
        assertEquals(0, validator.getValidationRuleList().size());
    }

    @Test
    void getUserStorage() {
        assertEquals(userStorage, validator.getUserStorage());
    }

    @Test
    void validate() {
        try {
            assertTrue(validator.validate(user));
        } catch (ValidationException e) {
            throw new RuntimeException(e);
        }
    }
}