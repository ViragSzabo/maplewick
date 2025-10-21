package implementation.week10.QuickMorningSprints.Tuesday;

public class Grill {

    /** Properties */
    private int temperature;

    /** Constructor */
    public Grill(int temperature) {
        this.temperature = temperature;
    }

    /** Getters & Setters */
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /** Increase temperature of the grill */
    public void increaseTemperature(int amount) {
        this.setTemperature(temperature += amount);
    }
}