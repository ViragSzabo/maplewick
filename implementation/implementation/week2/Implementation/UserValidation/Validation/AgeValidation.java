package implementation.week2.Implementation.UserValidation.Validation;

import implementation.week2.Implementation.UserValidation.User.User;
import implementation.week2.Implementation.UserValidation.ValidationRule;

import java.util.Calendar;

public class AgeValidation implements ValidationRule
{
    private final int minAge;

    /**
     * Constructor of the age validation
     * @param minAge is an int
     */
    public AgeValidation(int minAge)
    {
        this.minAge = minAge;
    }

    /**
     * Determining when the user is valid
     *
     * @param user is the user being checked
     * @throws ValidationException if the requirements are not being met
     */
    @Override
    public void isValid(User user) throws ValidationException
    {
        Calendar today = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(user.getDateOfBirth());

        int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        if(today.get(Calendar.MONTH) > birthDate.get(Calendar.MONTH))
        {
            age--;
        }
        if(age < minAge)
        {
            throw new ValidationException("Age must be between " + minAge + " and " + age + ".");
        }
    }
}