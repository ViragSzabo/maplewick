package implementation.week11.Clockmaker;

import implementation.week11.Clockmaker.Clock.Clock;
import implementation.week11.Clockmaker.Interface.SyncException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClockManager {
    private List<Clock> clocks;
    private Random random = new Random();

    public ClockManager() {
        this.clocks = new ArrayList<>();
    }

    public List<Clock> getClocks() {
        return clocks;
    }

    public void setClocks(List<Clock> clocks) {
        this.clocks = clocks;
    }

    public void add(Clock clock) {
        this.clocks.add(clock);
    }

    public void remove(Clock clock) {
        this.clocks.remove(clock);
    }

    public void simulateDay() throws SyncException {
        System.out.println("🕰️ Simulating a new day...");

        // Step 1: All clocks tick
        for (Clock clock : clocks) {
            clock.tick();
        }

        // Step 2: Randomly synchronize some pairs
        for (int i = 0; i < clocks.size() - 1; i++) {
            Clock c1 = clocks.get(i);
            Clock c2 = clocks.get(random.nextInt(clocks.size()));

            c1.synchronize(c2);
            System.out.println("✨ " + c1.getName() + " synchronized with " + c2.getName());
        }
    }
}