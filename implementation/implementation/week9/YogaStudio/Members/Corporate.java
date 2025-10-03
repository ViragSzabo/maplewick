package implementation.week9.YogaStudio.Members;

import implementation.week9.YogaStudio.Classes.YogaClass;
import implementation.week9.YogaStudio.Enums.Membership;

public class Corporate extends Member {
    public Corporate(String firstName, String lastName) {
        super(firstName, lastName, Membership.CORPORATE);
    }

    @Override
    public void attendClass(YogaClass yogaClass) {
        System.out.println(this.getFullName() + " is attending at the " + yogaClass.getName());
    }
}