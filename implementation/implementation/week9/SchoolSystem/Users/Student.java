package implementation.week9.SchoolSystem.Users;

import implementation.week9.SchoolSystem.Subjects.*;

import java.util.List;
import java.util.Map;

public class Student extends User
{
    private List<Course> enrolledCourses;
    private List<Grade> grades;
    private Map<Course, List<Assignment>> assignments;

    public Student(String firstName, String lastName, String email, String password)
    {
        super(firstName, lastName, email, password);
    }

    public List<Course> getEnrolledCourses()
    {
        return this.enrolledCourses;
    }

    public List<Grade> viewGrades()
    {
        return this.grades;
    }

    public Map<Course, List<Assignment>> getAssignments()
    {
        return this.assignments;
    }

    public void enrolledCourse(Course course)
    {
        this.enrolledCourses.add(course);
    }

    public void addGrade(Grade grade)
    {
        this.grades.add(grade);
    }

    public boolean submitAssignment(Course course, Assignment assignment)
    {
        if (this.assignments.containsKey(course))
        {
            this.assignments.get(course).add(assignment);
            return true;
        }
        return false;
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