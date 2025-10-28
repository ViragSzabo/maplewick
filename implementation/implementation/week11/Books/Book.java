package implementation.week11.Books;

import implementation.week11.Exceptions.WhisperTooLoudException;

public abstract class Book {
    /** Attributes **/
    protected String title;
    protected int minutesRead;

    /** Constructor **/
    public Book(String title) {
        this.title = title;
        this.minutesRead = 0;
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

    public abstract void read() throws WhisperTooLoudException;
}