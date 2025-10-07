package implementation.week9.EcoAdventurePlanner;

public class FULLYBOOKEDEXCEPTION extends Exception {
    public FULLYBOOKEDEXCEPTION() {
        super("Sorry, it is fully booked!");
    }
}