package implementation.week9.SchoolSystem.Users;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class User
{
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;

    public User(String firstName, String lastName, String email, String password)
    {
        AtomicInteger counter = new AtomicInteger();
        this.id = counter.incrementAndGet();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = String.valueOf(password.hashCode());
    }
    public int getId()
    {
        return id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public abstract void login();
    public abstract void logout();
}