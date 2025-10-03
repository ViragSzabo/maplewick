package implementation.week1.KingsQuests.Implementation.Quest;

import implementation.week1.KingsQuests.Implementation.Item;
import implementation.week1.KingsQuests.Implementation.Player.Character;
import implementation.week1.KingsQuests.Implementation.Player.Player;

import java.util.ArrayList;
import java.util.List;

public class SpecialQuest extends Quest
{
    private final List<Item> rewards = new ArrayList<>();

    public SpecialQuest(String title, int difficulty, int rewardXp, Character opponent) {
        super(title, difficulty, rewardXp, opponent);
        this.rewards.addAll(rewards);
    }

    @Override
    public QuestResult run(Player player) {
        QuestResult base = super.run(player);
        if (base.isSuccess()) {
            return new QuestResult(true, base.getXpEarned(), rewards);
        }
        return base;
    }
}