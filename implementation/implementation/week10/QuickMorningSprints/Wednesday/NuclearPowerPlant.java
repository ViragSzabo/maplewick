package implementation.week10.QuickMorningSprints.Wednesday;

import java.util.LinkedList;
import java.util.List;

public class NuclearPowerPlant {

    /** Properties */
    private List<IReactor> reactors;

    /** Constructor */
    public NuclearPowerPlant() {
        this.reactors = new LinkedList<IReactor>();
    }

    /** Get method */
    public List<IReactor> getReactors() {
        return reactors;
    }

    /** Add method */
    public void addReactor(IReactor reactor) {
        this.reactors.add(reactor);
    }
}