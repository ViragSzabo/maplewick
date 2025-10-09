package implementation.week9.PetAdoption.Exception;

public class NOTFOUND extends Exception {
    public NOTFOUND() {
        super("The pet is not available!");
    }
}