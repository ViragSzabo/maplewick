package implementation.week9.Blockbuster.Employment.Characters;

import implementation.week9.Blockbuster.Employment.Employee;
import implementation.week9.Blockbuster.Employment.Role;

public class Connie extends Employee {
    public Connie() {
        super("Connie", "Kim", "connie@blockbuster.com", "555-6677", "Maplewick", 2100.0);
    }

    public void gossip() {
        System.out.println("💬 Connie: Did you hear? Someone forgot to rewind the tapes again!");
    }

    @Override
    public Role getRole() {
        return Role.CINEMA_WARDEN;
    }
}