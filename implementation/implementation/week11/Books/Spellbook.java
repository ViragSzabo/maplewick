package implementation.week11.Books;

import implementation.week11.Exceptions.WhisperTooLoudException;
import implementation.week11.Interfaces.Cursed;

public class Spellbook extends Book implements Cursed {
    /** Constructor **/
    public Spellbook(String title) {
        super(title);
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