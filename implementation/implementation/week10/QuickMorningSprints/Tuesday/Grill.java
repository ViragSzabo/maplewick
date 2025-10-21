package implementation.week10.QuickMorningSprints.Tuesday;

public class Grill {

    /** Properties */
    private int temperature;
    private TemperatureMonitor listener;

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

    public void setListener(TemperatureMonitor listener) {
        this.listener = listener;
    }

    /** Increase temperature of the grill */
    public void increaseTemperature(int amount) throws WARNING {
        this.setTemperature(temperature += amount);
        System.out.println("Temperature increased to " + temperature + "°C");
        if (temperature > 250 && listener != null) {
            listener.onOverheat();
        }
    }
}