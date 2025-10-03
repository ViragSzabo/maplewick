package implementation.week1.KingsQuests.Implementation.Player;

import implementation.week1.KingsQuests.Implementation.Item;
import implementation.week1.KingsQuests.Implementation.Quest.Quest;
import implementation.week1.KingsQuests.Implementation.Quest.QuestResult;

import java.util.ArrayList;
import java.util.List;

public class Player
{
    public static final int LEVEL_UP_THRESHOLD = 200; // configurable
    private final String name;
    private int level = 1;
    private int xp = 0;
    private final Character character;
    private final List<Item> inventory = new ArrayList<>();

    public Player(String name, Character character) {
        this.name = name;
        this.character = character;
    }

    public String getName()
    {
        return name;
    }

    public int getLevel()
    {
        return level;
    }

    public int getXp()
    {
        return xp;
    }

    public Character getCharacter()
    {
        return character;
    }

    public List<Item> getInventory()
    {
        return inventory;
    }

    public boolean canAttempt(Quest quest) {
        return this.xp >= quest.requiredXp();
    }

    public QuestResult play(Quest quest) {
        if (!canAttempt(quest)) {
            return new QuestResult(false, 0, List.of());
        }
        QuestResult result = quest.run(this);
        if (result.isSuccess()) {
            gainXp(result.getXpEarned());
            inventory.addAll(result.getItemsEarned());
        }
        return result;
    }

    public void gainXp(int amount) {
        this.xp += amount;
        levelUpIfEligible();
    }

    public void levelUpIfEligible() {
        while (this.xp >= LEVEL_UP_THRESHOLD) {
            this.level += 1;
            this.xp -= LEVEL_UP_THRESHOLD;
        }
    }
}