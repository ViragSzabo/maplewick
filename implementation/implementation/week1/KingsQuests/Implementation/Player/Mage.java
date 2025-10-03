package implementation.week1.KingsQuests.Implementation.Player;

public class Mage extends Character
{
    private boolean specialActive = false;
    private static final int DEFENSE_BOOST = 5;

    public Mage(String name, int attack, int defense) {
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
    public int defend()
    {
        return specialActive ? (this.getDefense() + DEFENSE_BOOST) : this.getDefense();
    }
}