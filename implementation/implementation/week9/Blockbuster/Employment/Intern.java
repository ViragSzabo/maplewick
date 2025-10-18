package implementation.week9.Blockbuster.Employment;

public class Intern extends Employee {
    private final boolean isPaid;

    public Intern(String firstName, String lastName, String email, String phone, String address, double salary, boolean isPaid) {
        super(firstName, lastName, email, phone, address, salary);
        this.isPaid = isPaid;
    }

    @Override
    public Role getRole() { return isPaid ? Role.INTERN : Role.VOLUNTEER; }
}