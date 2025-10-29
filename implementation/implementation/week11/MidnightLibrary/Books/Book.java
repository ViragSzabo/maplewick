package implementation.week11.MidnightLibrary.Books;

import implementation.week11.MidnightLibrary.BookGenres.BookGenre;
import implementation.week11.MidnightLibrary.Exceptions.WhisperTooLoudException;

public abstract class Book {
    /** Attributes **/
    protected String title;
    protected int minutesRead;
    protected BookGenre genre;

    /** Constructor **/
    public Book(String title, BookGenre genre) {
        this.title = title;
        this.minutesRead = 0;
        this.genre = genre;
    }

    /** Getters & Setters **/
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinutesRead() {
        return this.minutesRead;
    }

    public void setMinutesRead(int minutesRead) {
        this.minutesRead = minutesRead;
    }

    public BookGenre getGenre() {
        return this.genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }

    public abstract void read() throws WhisperTooLoudException;
}