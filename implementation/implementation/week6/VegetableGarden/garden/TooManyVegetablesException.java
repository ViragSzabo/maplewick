package implementation.week6.VegetableGarden.garden;

public class TooManyVegetablesException extends Exception
{
    public TooManyVegetablesException() {
        super("There are too many vegetables in the garden! The garden is full!");
    }
}