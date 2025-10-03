package implementation.week2.Implementation.UserValidation;

import implementation.week2.Implementation.UserValidation.User.User;
import implementation.week2.Implementation.UserValidation.Validation.ValidationException;

public interface ValidationRule
{
    /**
     * The method of the interface
     *
     * @param user that being under investigation
     * @throws ValidationException if the user is not valid
     */
    void isValid(User user) throws ValidationException;
}