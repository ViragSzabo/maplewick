package implementation.week14.cybernetic;

public class SurgeonBot extends Robot
{
    private double precision; // 0 - 100

    public SurgeonBot(String serialNumber, double precision)
    {
        super(serialNumber);
        setPrecision(precision);
    }

    @Override
    public void performTask()
    {
        operate(5);
        System.out.println("Standard surgery");
    }

    private void operate(int difficulty)
    {

    }

    public double getPrecision()
    {
        return precision;
    }

    public void setPrecision(double precision)
    {
        if (precision < 0)
        {
            throw new IllegalArgumentException("Precision must be a positive number");
        }

        this.precision = precision;
    }
}