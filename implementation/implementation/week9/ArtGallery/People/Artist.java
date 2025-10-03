package implementation.week9.ArtGallery.People;

import implementation.week9.ArtGallery.Enums.*;

import java.time.LocalDate;

public class Artist extends Person
{
    public Artist(String firstName, String lastName, String email, Gender gender, LocalDate birthDate)
    {
        super(firstName, lastName, email, gender, birthDate);
    }

    @Override
    public String getDescription()
    {
        return "Artist: " + getFullName();
    }
}