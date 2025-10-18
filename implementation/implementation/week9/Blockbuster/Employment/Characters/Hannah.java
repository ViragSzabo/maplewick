package implementation.week9.Blockbuster.Employment.Characters;

import implementation.week9.Blockbuster.Employment.Employee;
import implementation.week9.Blockbuster.Employment.Role;

public class Hannah extends Employee {
    public Hannah() {
        super("Hannah", "Nguyen", "hannah@blockbuster.com", "555-7766", "Maplewick", 2000.0);
    }

    public void organizeShelf() {
        System.out.println("💬 Hannah: Alphabetical order, people! It’s not that hard.");
    }

    @Override
    public Role getRole() {
        return Role.CLERK;
    }
}