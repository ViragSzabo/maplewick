package implementation.week9.Blockbuster.Employment.Characters;

import implementation.week9.Blockbuster.Employment.Employee;
import implementation.week9.Blockbuster.Employment.Role;

public class Carlos extends Employee {
    public Carlos() {
        super("Carlos", "Rivera", "carlos@blockbuster.com", "555-9988", "Maplewick", 1800.0);
    }

    public void suggestIdeas() {
        System.out.println("💬 Carlos: What if we make a TikTok page for the store? #RetroVibes");
    }

    @Override
    public Role getRole() {
        return Role.MARKETING_SPECIALIST;
    }
}