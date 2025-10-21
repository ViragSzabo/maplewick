package implementation.week10.QuickMorningSprints.Tuesday;

public class Main {
    public static void main(String[] args) {
        BBQApp bbq = new BBQApp(new Grill(240));

        bbq.getGrill().setListener(() -> {
            throw new WARNING();
        });

        try {
            bbq.getGrill().increaseTemperature(2);
            bbq.getGrill().increaseTemperature(4);
            bbq.getGrill().increaseTemperature(5);
        } catch (WARNING e) {
            System.out.println("EVENT TRIGGERED: " + e.getMessage());
        }
    }
}