package implementation.week1.KingsQuests.Implementation.Player;

public abstract class Character
{
    private String name;
    private int attack;
    private int defense;

    public Character(String name, int attack, int defense)
    {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName()
    {
        return name;
    }

    public int getAttack()
    {
        return attack;
    }

    public int getDefense()
    {
        return defense;
    }

    public int attack()
    {
        return attack;
    }

    public int defend()
    {
        return defense;
    }

    public abstract void useSpecial();
    public abstract void endOfTurn();
}