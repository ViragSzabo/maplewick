package implementation.week1.KingsQuests.Implementation.Player;

public class Archer extends Character
{
    private boolean specialActive = false;

    public Archer(String name, int attack, int defense) {
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
        return specialActive ? (this.getAttack() * 2) : this.getAttack();
    }
}