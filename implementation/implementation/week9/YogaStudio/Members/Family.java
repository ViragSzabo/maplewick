package implementation.week9.YogaStudio.Members;

import implementation.week9.YogaStudio.Classes.YogaClass;
import implementation.week9.YogaStudio.Enums.Membership;

public class Family extends Member {
    public Family(String firstName, String lastName) {
        super(firstName, lastName, Membership.CLASS_PASS);
    }

    @Override
    public void attendClass(YogaClass yogaClass) {
        System.out.println(this.getFullName() + " is attending at the " + yogaClass.getName());
    }
}