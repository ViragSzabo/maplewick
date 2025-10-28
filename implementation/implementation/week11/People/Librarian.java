package implementation.week11.People;

import implementation.week11.Books.Book;
import implementation.week11.Books.Spellbook;
import implementation.week11.Exceptions.WhisperTooLoudException;

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
            } catch (WhisperTooLoudException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}