package implementation.week9.EventPlanningAndTicketing.Tickets;

public class Student extends TicketType implements Discountable
{
    public Student(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public boolean isEarlyAccess() { return false; }

    @Override
    public double getDiscount(double basePrice) {
        return basePrice * 0.75;
    }
}