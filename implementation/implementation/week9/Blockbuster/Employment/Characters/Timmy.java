package implementation.week9.Blockbuster.Employment.Characters;

import implementation.week9.Blockbuster.Employment.Manager;

public class Timmy extends Manager {
    private String crush = "Eliza";
    private String girlfriend = "Lena";
    private String bestFriend = "Percy";

    public Timmy() {
        super("Timmy", "Yoon", "timmy@blockbuster.com", "555-1234", "Maplewick", 2800.0);
    }

    public void showRelationships() {
        System.out.println("❤️ Crush: " + crush + " | 💞 Dating: " + girlfriend + " | 🤝 Best Friend: " + bestFriend);
    }

    @Override
    public void motivateTeam() {
        System.out.println("💬 Timmy: This store isn’t just movies — it’s memories. Let’s keep it running!");
    }
}