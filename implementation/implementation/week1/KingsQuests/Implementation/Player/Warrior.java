package implementation.week1.KingsQuests.Implementation.Player;

public class Warrior extends Character
{
    private boolean specialActive = false;
    private static final int ATTACK_BOOST = 5;

    public Warrior(String name, int attack, int defense) {
        super(name, attack, defense);
    }

    @Override
    public void useSpecial() {
        specialActive = true;
    }

    @Override
    public void endOfTurn() {
        specialActive = false;
    }

    @Override
    public int attack()
    {
        return specialActive ? (this.getAttack() + ATTACK_BOOST) : this.getAttack();
    }
}