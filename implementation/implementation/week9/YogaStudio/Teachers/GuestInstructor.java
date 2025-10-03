package implementation.week9.YogaStudio.Teachers;

import implementation.week9.YogaStudio.Classes.YogaClass;
import implementation.week9.YogaStudio.Enums.Specialization;

public class GuestInstructor extends Instructor {
    public GuestInstructor(String firstName, String lastName, Specialization specialization) {
        super(firstName, lastName, specialization);
    }

    @Override
    public void teach(YogaClass yogaClass) {
        System.out.println(this.getFullName() + " is teaching " + yogaClass.getName());
    }
}