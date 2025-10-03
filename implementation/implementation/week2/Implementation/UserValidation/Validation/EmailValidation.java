package implementation.week2.Implementation.UserValidation.Validation;

import implementation.week2.Implementation.UserValidation.User.User;
import implementation.week2.Implementation.UserValidation.ValidationRule;

import java.util.regex.Pattern;

public class EmailValidation implements ValidationRule
{
    private static final String EMAIL_PATTERN =
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    /**
     * The email address is being checked if it is valid
     *
     * @param user that is being under investigation if their email address is valid
     * @throws ValidationException if their email address is not being valid
     */
    @Override
    public void isValid(User user) throws ValidationException
    {
        if(!pattern.matcher(user.getEmail()).matches())
        {
            throw new ValidationException("Invalid email");
        }
    }
}