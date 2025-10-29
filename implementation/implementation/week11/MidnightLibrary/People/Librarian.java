package implementation.week11.MidnightLibrary.People;

import implementation.week11.MidnightLibrary.BookGenres.BookGenre;
import implementation.week11.MidnightLibrary.Books.Book;
import implementation.week11.MidnightLibrary.Exceptions.WhisperTooLoudException;

import java.util.ArrayList;
import java.util.List;

public class Librarian {
    /** Attributes **/
    private List<Book> books;

    /** Constructor **/
    public Librarian() {
        books = new ArrayList<Book>();
    }

    /** Getters & Setters **/
    public List<Book> getBooks() {
        return this.books;
    }

    public List<Book> setBooks(List<Book> books) {
        return this.books = books;
    }

    /** Add & Remove **/
    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public void readALlBooks() {
        for (Book b : this.books) {
            try {
                b.read();
                System.out.println("---");
            } catch (WhisperTooLoudException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void getFantasyBooks() {
        for (Book b : this.books) {
            if (b.getGenre().equals(BookGenre.FANTASY)) {
                System.out.println(b.getTitle() + ": " + b.getMinutesRead() + " minutes read");
            }
        }
    }
}