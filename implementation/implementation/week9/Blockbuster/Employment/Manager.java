package implementation.week9.Blockbuster.Employment;

public class Manager extends Employee {

    public Manager(String firstName, String lastName, String email, String phone, String address, double salary) {
        super(firstName, lastName, email, phone, address, salary);
    }

    @Override
    public Role getRole() { return Role.MANAGER; }

    public void motivateTeam() {
        System.out.println("💬 '" + getFullName() + "': Let's keep this store alive — Blockbuster forever!");
    }
}