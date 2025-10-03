package implementation.week2.Implementation.UserValidation;

import implementation.week2.Implementation.UserValidation.User.User;
import implementation.week2.Implementation.UserValidation.User.UserStorage;
import implementation.week2.Implementation.UserValidation.User.UserValidator;
import implementation.week2.Implementation.UserValidation.Validation.AgeValidation;
import implementation.week2.Implementation.UserValidation.Validation.EmailValidation;
import implementation.week2.Implementation.UserValidation.Validation.PasswordValidation;
import implementation.week2.Implementation.UserValidation.Validation.ValidationException;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Example {
    public static void main(String[] args)
    {
        try {
            // Set up the validation rules
            List<ValidationRule> rules = new ArrayList<>();
            rules.add(new PasswordValidation(false, true,
                    true, true, true));
            rules.add(new AgeValidation(18));
            rules.add(new EmailValidation());

            // Set up a storage, validator and a user
            UserStorage storage = new UserStorage();
            UserValidator validator = new UserValidator(storage);
            User user = new User("nick-ul", "Circle123*",
                    "nick.texas@gmail.com", new Date(97, 9, 14));

            // Check if the user is valid
            validator.validate(user);
            System.out.println("User is validated!");
        }
        catch (ValidationException e)
        {
            System.out.println(e.getMessage());
        }
    }
}