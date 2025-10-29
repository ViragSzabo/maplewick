package implementation.week11.MidnightLibrary.Books;

import implementation.week11.MidnightLibrary.BookGenres.BookGenre;

public class Novel extends Book {
    /** Constructor **/
    public Novel(String title, BookGenre genre) {
        super(title, genre);
    }

    @Override
    public void read() {
        minutesRead++;
        System.out.println("Reading " + minutesRead + " minutes");
        System.out.println(title + " whispers: Once upon a midnight dream...");
    }
}