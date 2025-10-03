package implementation.week2.Implementation.UserValidation.Validation;

public class ValidationException extends Exception
{
    /**
     * The exception method for the validation checker
     * @param message if there is a validation error
     */
    public ValidationException(String message)
    {
        super(message);
    }
}