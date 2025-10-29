package implementation.week11.MidnightLibrary.Books;

import implementation.week11.MidnightLibrary.BookGenres.BookGenre;
import implementation.week11.MidnightLibrary.Exceptions.WhisperTooLoudException;
import implementation.week11.MidnightLibrary.Interfaces.Cursed;

public class Spellbook extends Book implements Cursed {
    /** Constructor **/
    public Spellbook(String title, BookGenre genre) {
        super(title, genre);
    }

    @Override
    public void read() throws WhisperTooLoudException {
        minutesRead++;
        if (minutesRead > 3) {
            throw new WhisperTooLoudException();
        } else {
            System.out.println(title + " hums arcane words...");
        }
    }

    @Override
    public boolean isCursed() {
        return true;
    }
}