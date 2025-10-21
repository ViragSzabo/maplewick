package implementation.week10.QuickMorningSprints.Tuesday;

public class Main {
    public static void main(String[] args) {
        BBQApp bbq = new BBQApp(new Grill(240));

        try {
            bbq.getGrill().increaseTemperature(2);
            bbq.checkTemp();
            bbq.getGrill().increaseTemperature(4);
            bbq.checkTemp();
            bbq.getGrill().increaseTemperature(5);
            bbq.checkTemp();
        } catch (WARNING e) {
            throw new RuntimeException(e);
        }
    }
}