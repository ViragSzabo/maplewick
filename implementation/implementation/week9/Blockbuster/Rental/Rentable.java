package implementation.week9.Blockbuster.Rental;

public interface Rentable {
    double calculateRentalPrice();
    void showDetails();
    default void playTrailer() {
        System.out.println("\uD83C\uDFA5 Playing a trailer...");
    }
}