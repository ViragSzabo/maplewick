package implementation.week11.MidnightLibrary.Books;

import implementation.week11.MidnightLibrary.BookGenres.BookGenre;

public class Diary extends Book {
    /** Constructor **/
    public Diary(String title, BookGenre genre) {
        super(title, genre);
    }

    @Override
    public void read() {
        minutesRead++;
        System.out.println(title + " sighs softly: Dear moon, I missed you tonight.");
    }
}