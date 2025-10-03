package implementation.week3.Implementation.Conditions;

import implementation.week2.Implementation.Hospital_Part2.CodeBlackException;
import implementation.week3.Implementation.Apps.App;
import implementation.week3.Implementation.Users.User;

public class Validation
{
    public boolean checkValidationForDownload(User user, App app) throws CodeBlackException
    {
        if(app.isContainsNudity() && user.getAge() < 18)
        {
            return false;
        }
        else
        {
            return !app.isContainsViolence() || user.getAge() >= 16;
        }
    }

    public String checkEmailForValidation(String email)
    {
        return email.contains("@") ? email : null;
    }
}