package implementation.week9.SchoolSystem.Users;

import implementation.week9.SchoolSystem.Subjects.Course;

import java.util.ArrayList;
import java.util.List;

public class Admin
{
    private final List<User> users;
    private final List<Course> courses;

    public Admin()
    {
        this.users = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public List<User> getUsers()
    {
        return users;
    }

    public List<Course> getCourses()
    {
        return courses;
    }

    public void addUser(User user)
    {
        this.users.add(user);
    }

    public void addCourse(Course course)
    {
        this.courses.add(course);
    }

    public void removeUser(User user)
    {
        this.users.remove(user);
    }

    public void removeCourse(Course course)
    {
        this.courses.remove(course);
    }
}