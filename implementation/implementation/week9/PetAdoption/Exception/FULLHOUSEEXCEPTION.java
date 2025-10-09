package implementation.week9.PetAdoption.Exception;

public class FULLHOUSEEXCEPTION extends Exception {
    public FULLHOUSEEXCEPTION() {
        super("The shelter is full! No more pets can be added.");
    }
}