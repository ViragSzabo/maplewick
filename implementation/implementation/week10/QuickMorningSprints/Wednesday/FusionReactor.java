package implementation.week10.QuickMorningSprints.Wednesday;

public class FusionReactor implements IReactor {
    @Override
    public void start() {
        System.out.println("Fusion Reactor started");
    }

    @Override
    public void shutDown() {
        System.out.println("Fusion Reactor shut down");
    }

    @Override
    public String getStatus() {
        return "Fusion reactor stable under control rods.";
    }
}
