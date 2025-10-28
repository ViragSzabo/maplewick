package implementation.week11.Books;

public class Novel extends Book {
    /** Constructor **/
    public Novel(String title) {
        super(title);
    }

    @Override
    public void read() {
        minutesRead++;
        System.out.println("Reading " + minutesRead + " minutes");
        System.out.println(title + " whispers: Once upon a midnight dream...");
    }
}