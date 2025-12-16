package implementation.week12.highcourt;

public class Client
{
    private String name;
    private double cash;

    public Client(String name, double cash)
    {
        this.setName(name);
        this.setCash(cash);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        if (name == null || name.isEmpty())
        {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        this.name = name;
    }

    public double getCash()
    {
        return this.cash;
    }

    public void setCash(double cash)
    {
        if (cash < 0)
        {
            throw new IllegalArgumentException("Cash cannot be negative");
        }

        this.cash = cash;
    }
}