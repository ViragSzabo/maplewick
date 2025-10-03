package implementation.week9.ArtGallery.People;

import implementation.week9.ArtGallery.Artwork;
import implementation.week9.ArtGallery.Enums.Gender;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Buyer extends Person
{
    private final HashMap<Artwork, LocalDateTime> ownedArts;

    public Buyer(String firstName, String lastName, String email, Gender gender, LocalDate birthDate) {
        super(firstName, lastName, email, gender, birthDate);
        this.ownedArts = new HashMap<>();
    }

    @Override
    public String getDescription()
    {
        return "Buyer" + getFullName();
    }

    public HashMap<Artwork, LocalDateTime> getOwnedArts()
    {
        return ownedArts;
    }

    public void buyArt(Artwork artwork)
    {
        ownedArts.put(artwork, LocalDateTime.now());
    }
}