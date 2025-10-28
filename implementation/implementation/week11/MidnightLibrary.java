package implementation.week11;

import implementation.week11.Books.Diary;
import implementation.week11.Books.Novel;
import implementation.week11.Books.Spellbook;
import implementation.week11.People.Librarian;

public class MidnightLibrary {
    public static void main(String[] args) {
        /* Create a librarian **/
        Librarian librarian = new Librarian();

        /* Add books **/
        librarian.addBook(new Novel("The Midnight Club"));
        librarian.addBook(new Diary("Luna's Journal"));
        librarian.addBook(new Spellbook("The Whispering Grimoire"));

        for (int night = 1; night <= 5; night++) {
            System.out.println("Night " + night + ": falls over the library...");
            librarian.readALlBooks();
        }
    }
}