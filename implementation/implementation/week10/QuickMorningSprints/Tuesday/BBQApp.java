package implementation.week10.QuickMorningSprints.Tuesday;

public class BBQApp {
    private Grill grill;

    public BBQApp(Grill grill) {
        this.grill = grill;
    }

    public Grill getGrill() {
        return grill;
    }

    public void setGrill(Grill grill) {
        this.grill = grill;
    }

    public void checkTemp() throws WARNING {
        if(grill.getTemperature() > 250) {
            throw new WARNING();
        } else {
            System.out.println("Grill's temp.: " + grill.getTemperature());
        }
    }
}