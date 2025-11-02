package implementation.week11.Elements;

public abstract class Companion {
    private String name;
    private Element type;
    private int energy;

    public Companion(String name, Element type, int energy) {
        this.name = name;
        this.type = type;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Element getType() {
        return type;
    }

    public void setType(Element type) {
        this.type = type;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public abstract void train();

    public boolean isExhausted() {
        return energy > 10;
    }

    public void rest() {
        System.out.println(this.name + " rests and restores.");
        this.energy += 5;
    }
}