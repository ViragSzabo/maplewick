package implementation.week9.EventPlanningAndTicketing.Tickets;

public abstract class TicketType
{
    private String name;
    private double price;

    public TicketType(String name, double basePrice)
    {
        this.name = name;
        this.price = basePrice;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public abstract boolean isEarlyAccess();

    @Override
    public String toString() {
        return getName() + " (€" + getPrice() + ")" +
                (isEarlyAccess() ? " - Early Access" : "");
    }
}