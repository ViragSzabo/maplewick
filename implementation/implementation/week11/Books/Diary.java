package implementation.week11.Books;

public class Diary extends Book {
    /** Constructor **/
    public Diary(String title) {
        super(title);
    }

    @Override
    public void read() {
        minutesRead++;
        System.out.println(title + " sighs softly: Dear moon, I missed you tonight.");
    }
}