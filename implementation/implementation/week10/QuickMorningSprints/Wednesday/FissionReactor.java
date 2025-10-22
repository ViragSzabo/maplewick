package implementation.week10.QuickMorningSprints.Wednesday;

public class FissionReactor implements IReactor {
    @Override
    public void start() {
        System.out.println("Fission Reactor started");
    }

    @Override
    public void shutDown() {
        System.out.println("Fission Reactor shutting down");
    }

    @Override
    public String getStatus() {
        return "Fission reactor humming steadily.";
    }
}
