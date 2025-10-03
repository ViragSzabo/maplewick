package implementation.week2.Implementation.UserValidation.Validation;

import implementation.week2.Implementation.UserValidation.User.User;
import implementation.week2.Implementation.UserValidation.ValidationRule;

public class PasswordValidation implements ValidationRule
{
    private final boolean allowSpaces;
    private final boolean requireSpecialCharacters;
    private final boolean requireNumbers;
    private final boolean requireLowercase;
    private final boolean requireUppercase;

    public PasswordValidation(boolean allowSpaces, boolean requireSpecialCharacters,
                              boolean requireNumbers, boolean requireLowercase, boolean requireUppercase)
    {
        this.allowSpaces = allowSpaces;
        this.requireSpecialCharacters = requireSpecialCharacters;
        this.requireNumbers = requireNumbers;
        this.requireLowercase = requireLowercase;
        this.requireUppercase = requireUppercase;
    }

    /**
     * Check if the user has a valid password
     *
     * @param user that is being investigated
     * @throws ValidationException if the password if not being secured, valid
     */
    @Override
    public void isValid(User user) throws ValidationException
    {
        String password = user.getPassword();

        if(!allowSpaces && password.contains(" "))
        {
            throw new ValidationException("Password cannot contain spaces.");
        }

        if (requireSpecialCharacters && !password.matches(".*[!@#$%^&*].*"))
        {
            throw new ValidationException("Password must contain a special character.");
        }

        if (requireNumbers && !password.matches(".*\\d.*"))
        {
            throw new ValidationException("Password must contain a number.");
        }

        if (requireLowercase && !password.matches(".*[a-z].*"))
        {
            throw new ValidationException("Password must contain a lowercase letter.");
        }

        if (requireUppercase && !password.matches(".*[A-Z].*"))
        {
            throw new ValidationException("Password must contain an uppercase letter.");
        }

    }
}