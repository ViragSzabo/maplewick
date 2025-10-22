package implementation.week10.QuickMorningSprints.Wednesday;

public class Main {
    public static void main(String[] args) {
        NuclearPowerPlant nuclearPowerPlant = new NuclearPowerPlant();

        FissionReactor reactor1 = new FissionReactor();
        FusionReactor reactor2 = new FusionReactor();

        nuclearPowerPlant.addReactor(reactor1);
        nuclearPowerPlant.addReactor(reactor2);

        for (IReactor reactor : nuclearPowerPlant.getReactors()) {
            System.out.println(reactor.getStatus());
        }
    }
}