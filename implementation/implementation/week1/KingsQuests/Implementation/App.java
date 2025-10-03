package implementation.week1.KingsQuests.Implementation;

import implementation.week1.KingsQuests.Implementation.Player.Character;
import implementation.week1.KingsQuests.Implementation.Player.Player;
import implementation.week1.KingsQuests.Implementation.Player.Warrior;
import implementation.week1.KingsQuests.Implementation.Player.Archer;
import implementation.week1.KingsQuests.Implementation.Player.Mage;
import implementation.week1.KingsQuests.Implementation.Quest.Quest;
import implementation.week1.KingsQuests.Implementation.Quest.SpecialQuest;

public class App
{
    public static void main(String[] args) {

        // Create player and character
        Character hero = new Warrior("Rhea", 15, 8);
        Player player = new Player("Virag", hero);

        // Create quests
        Quest goblinCamp = new Quest(
                "Goblin Camp", 5, 120,
                new Archer("Goblin Sharpshooter", 10, 4));

        SpecialQuest dragonTrial = new SpecialQuest(
                "Trial of the Ember Wyrm", 12, 250,
                new Mage("Ember Acolyte", 18, 10));


        System.out.printf("Player %s (Lv.%d, XP=%d)\n", player.getName(), player.getLevel(), player.getXp());
        System.out.printf("Can attempt '%s'? %s (requires %d XP)\n",
                goblinCamp.getTitle(), player.canAttempt(goblinCamp), goblinCamp.requiredXp());

        // Gain some XP to unlock first quest (simulate tutorial)
        player.gainXp(60);
        System.out.printf("After tutorial XP: Lv.%d, XP=%d\n", player.getLevel(), player.getXp());

        var r1 = player.play(goblinCamp);
        System.out.printf("Quest '%s' success=%s, xp+%d\n", goblinCamp.getTitle(), r1.isSuccess(), r1.getXpEarned());
        System.out.printf("Now: Lv.%d, XP=%d\n", player.getLevel(), player.getXp());

        // Try special quest
        System.out.printf("Can attempt '%s'? %s (requires %d XP)\n", dragonTrial.getTitle(), player.canAttempt(dragonTrial), dragonTrial.requiredXp());
        player.gainXp(400); // power-up to show level ups and special quest
        System.out.printf("Boosted: Lv.%d, XP=%d\n", player.getLevel(), player.getXp());

        var r2 = player.play(dragonTrial);
        System.out.printf("Quest '%s' success=%s, xp+%d, items=%s\n",
                dragonTrial.getTitle(), r2.isSuccess(), r2.getXpEarned(), r2.getItemsEarned());
        System.out.printf("End state: Lv.%d, XP=%d, Inventory=%s\n",
                player.getLevel(), player.getXp(), player.getInventory());
    }
}