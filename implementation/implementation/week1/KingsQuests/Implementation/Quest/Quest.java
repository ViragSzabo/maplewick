package implementation.week1.KingsQuests.Implementation.Quest;

import implementation.week1.KingsQuests.Implementation.Player.Player;
import implementation.week1.KingsQuests.Implementation.Player.Character;

import java.util.Collections;

public class Quest
{
    private String title;
    private int difficulty;
    private int rewardXp;
    private Character opponent;

    public Quest(String title, int difficulty, int rewardXp, Character opponent)
    {
        this.title = title;
        this.difficulty = difficulty;
        this.rewardXp = rewardXp;
        this.opponent = opponent;
    }

    public String getTitle()
    {
        return title;
    }

    public int getDifficulty()
    {
        return difficulty;
    }

    public int getRewardXp()
    {
        return rewardXp;
    }

    public Character getOpponent()
    {
        return opponent;
    }

    public int requiredXp()
    {
        return difficulty * 10;
    }

    public QuestResult run(Player player)
    {
        Character pc = player.getCharacter();
        pc.useSpecial();
        opponent.useSpecial();


        int playerHit = Math.max(0, pc.attack() - opponent.defend());
        int opponentHit = Math.max(0, opponent.attack() - pc.defend());

        pc.endOfTurn();
        opponent.endOfTurn();

        boolean success = playerHit >= opponentHit; // tie goes to player
        int xp = success ? rewardXp : 0;
        return new QuestResult(success, xp, Collections.emptyList());

    }
}