package implementation.week9.YogaStudio.Members;

import implementation.week9.YogaStudio.Classes.YogaClass;
import implementation.week9.YogaStudio.Enums.Membership;

public class Standard extends Member {
    public Standard(String firstName, String lastName) {
        super(firstName, lastName, Membership.DAILY);
    }

    @Override
    public void attendClass(YogaClass yogaClass) {
        System.out.println(this.getFullName() + " is attending at the " + yogaClass.getName());
    }
}