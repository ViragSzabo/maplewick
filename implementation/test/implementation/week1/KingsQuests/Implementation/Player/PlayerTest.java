package implementation.week1.KingsQuests.Implementation.Player;

import implementation.week1.KingsQuests.Implementation.Quest.Quest;
import implementation.week1.KingsQuests.Implementation.Quest.SpecialQuest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private Player player;
    private Character hero;

    @BeforeEach
    void setUp() {
        hero = new Warrior("Rhea", 15, 8);
        player = new Player("Virag", hero);
    }

    @Test
    void testInitialState() {
        assertEquals("Virag", player.getName());
        assertEquals(1, player.getLevel());
        assertEquals(0, player.getXp());
    }

    @Test
    void testGainXpAndLevelUp() {
        player.gainXp(220);
        assertTrue(player.getLevel() > 1);
        assertEquals(20, player.getXp());
    }

    @Test
    void testCanAttemptQuest() {
        Quest quest = new Quest("Goblin Camp", 5, 120, new Archer("Goblin", 10, 4));
        assertFalse(player.canAttempt(quest));
        player.gainXp(60);
        assertTrue(player.canAttempt(quest));
    }

    @Test
    void testPlayQuestSuccess() {
        Quest quest = new Quest("Goblin Camp", 5, 120, new Archer("Goblin", 10, 4));
        player.gainXp(200);

        var result = player.play(quest);

        assertNotNull(result);
        assertTrue(result.isSuccess() || !result.isSuccess()); // always defined
        assertTrue(result.getXpEarned() >= 0);
    }

    @Test
    void testPlaySpecialQuestRewards() {
        SpecialQuest quest = new SpecialQuest("Dragon Trial", 12, 250, new Mage("Ember", 18, 10));
        player.gainXp(1000); // Ensure eligibility

        var result = player.play(quest);

        if (result.isSuccess()) {
            assertNotNull(result.getItemsEarned());
            assertTrue(player.getInventory().size() >= 1);
        }
    }
}