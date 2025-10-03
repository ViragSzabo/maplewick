package implementation.week9.ArtGallery.People;

import java.time.LocalDate;
import java.time.Period;
import implementation.week9.ArtGallery.Enums.*;

public abstract class Person
{
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private LocalDate birthDate;

    public Person(String firstName, String lastName, String email, Gender gender, LocalDate birthDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Gender getGender()
    {
        return gender;
    }

    public void setGender(Gender gender)
    {
        this.gender = gender;
    }

    public LocalDate getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate)
    {
        this.birthDate = birthDate;
    }

    public int getAge()
    {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public abstract String getDescription();
}