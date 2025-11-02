package implementation.week11.Elements;

public class FireCompanion extends Companion implements Fusable {
    public FireCompanion(String name, Element type, int energy) {
        super(name, type, energy);
    }

    @Override
    public void train() {
        setEnergy(this.getEnergy() + this.getType().getBoost());
        System.out.println(this.getName() + " trains with fiery passion!");
    }

    @Override
    public void fuse(Companion other) throws FUSIONEXCEPTION {
        if(other.getType() == Element.WATER) {
            throw new FUSIONEXCEPTION("Fire and water cannot fuse safely!");
        }
        setEnergy(this.getEnergy() + other.getType().getBoost() / 2);
        other.setEnergy(other.getEnergy() + getType().getBoost() / 2);
        System.out.println(this.getName() + " fuses with " + other.getName() + "- shared energy!");
    }
}