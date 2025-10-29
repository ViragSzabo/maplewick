package implementation.week11.MidnightLibrary;

import implementation.week11.MidnightLibrary.BookGenres.BookGenre;
import implementation.week11.MidnightLibrary.Books.Diary;
import implementation.week11.MidnightLibrary.Books.Novel;
import implementation.week11.MidnightLibrary.Books.Spellbook;
import implementation.week11.MidnightLibrary.People.Librarian;

public class MidnightLibrary {
    public static void main(String[] args) {
        /* Create a librarian **/
        Librarian librarian = new Librarian();

        /* Add books **/
        librarian.addBook(new Novel("The Midnight Club", BookGenre.MYSTERY));
        librarian.addBook(new Diary("Luna's Journal", BookGenre.CLASSIC));
        librarian.addBook(new Spellbook("The Whispering Grimoire", BookGenre.FANTASY));

        for (int night = 1; night <= 5; night++) {
            System.out.println("Night " + night + ": falls over the library...");
            librarian.readALlBooks();
        }

        librarian.getFantasyBooks();
    }
}