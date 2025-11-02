package implementation.week11.Elements;

public class EarthCompanion  extends Companion implements Fusable {
    public EarthCompanion(String name, Element type, int energy) {
        super(name, type, energy);
    }

    @Override
    public void train() {
        setEnergy(this.getEnergy() + this.getType().getBoost());
        System.out.println(this.getName() + " trains with earthy passion!");
    }

    @Override
    public void fuse(Companion other) throws FUSIONEXCEPTION {
        if(other.getType() == Element.AIR) {
            throw new FUSIONEXCEPTION("Earth and air cannot fuse safely!");
        }
        setEnergy(this.getEnergy() + other.getType().getBoost() / 2);
        other.setEnergy(other.getEnergy() + getType().getBoost() / 2);
        System.out.println(this.getName() + " fuses with " + other.getName() + "- shared energy!");
    }
}