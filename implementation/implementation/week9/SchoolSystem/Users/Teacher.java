package implementation.week9.SchoolSystem.Users;

import implementation.week9.SchoolSystem.Subjects.*;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    private List<Course> taughtCourses;

    public Teacher(String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, password);
        this.taughtCourses = new ArrayList<>();
    }

    public List<Course> getTaughtCourses()
    {
        return taughtCourses;
    }

    public void assignGrade(Student student, Assignment assignment, Grade grade) {


    }

    public void createAssignment(Course course, Assignment assignment)
    {
        if(taughtCourses.contains(course))
        {

        }
    }

    public void viewStudentSubmissions(Student student)
    {
        System.out.println(student.getFullName() + "'s submissions: " + student.getAssignments());
    }

    @Override
    public void login()
    {

    }

    @Override
    public void logout()
    {

    }
}