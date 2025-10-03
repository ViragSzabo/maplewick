package implementation.week9.SchoolSystem.Subjects;

import implementation.week9.SchoolSystem.Users.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Course
{
    private int id;
    private String title;
    private Teacher instructor;
    private List<Student> enrolledStudents;
    private List<Assignment> assignments;

    public Course(String title, Teacher instructor) {
        AtomicInteger counter = new AtomicInteger();
        this.id = counter.incrementAndGet();
        this.title = title;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public int getId()
    {
        return this.id;
    }

    public String getTitle()
    {
        return this.title;
    }

    public Teacher getInstructor()
    {
        return this.instructor;
    }

    public List<Student> getEnrolledStudents()
    {
        return this.enrolledStudents;
    }

    public List<Assignment> getAssignments()
    {
        return this.assignments;
    }

    public void addEnrolledStudent(Student student)
    {
        this.enrolledStudents.add(student);
    }

    public void addAssignment(Assignment assignment)
    {
        this.assignments.add(assignment);
    }

    public void removeEnrolledStudent(Student student)
    {
        this.enrolledStudents.remove(student);
    }

    public void removeAssignment(Assignment assignment) {
        this.assignments.remove(assignment);
    }
}