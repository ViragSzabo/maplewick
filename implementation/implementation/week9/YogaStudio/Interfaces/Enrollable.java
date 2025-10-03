package implementation.week9.YogaStudio.Interfaces;

import implementation.week9.YogaStudio.Classes.YogaClass;

public interface Enrollable {
    boolean enrollFor(YogaClass yogaClass);
    boolean cancel(YogaClass yogaClass);
}