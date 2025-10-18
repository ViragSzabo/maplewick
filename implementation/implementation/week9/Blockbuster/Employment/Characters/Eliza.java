package implementation.week9.Blockbuster.Employment.Characters;

import implementation.week9.Blockbuster.Employment.Employee;
import implementation.week9.Blockbuster.Employment.Role;

public class Eliza extends Employee {
    private boolean havingMarriageIssues = true;

    public Eliza() {
        super("Eliza", "Hart", "eliza@blockbuster.com", "555-9876", "Maplewick", 2200.0);
    }

    public void talkToTimmy() {
        System.out.println("💬 Eliza: You always believed in this place, Timmy. Don’t give up now.");
    }

    public boolean isHavingMarriageIssues() { return havingMarriageIssues; }

    @Override
    public Role getRole() {
        return Role.ASSISTANT_MANAGER;
    }
}