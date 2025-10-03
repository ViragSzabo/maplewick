package implementation.week8.NuclearPowerplant;

import implementation.week8.NuclearPowerplant.Control.ControlRoom;
import implementation.week8.NuclearPowerplant.Reactor.Reactor;
import implementation.week8.NuclearPowerplant.Fuel.MeltdownException;
import implementation.week8.NuclearPowerplant.Reactor.SplitResult;

public class NuclearPowerPlant {
    private final Reactor reactor;
    private final Generator generator;
    private final CoolingSystem coolingSystem;
    private final ControlRoom controlRoom;

    public NuclearPowerPlant() {
        this.controlRoom = new ControlRoom();

        this.reactor = new Reactor();
        this.controlRoom.add(this.reactor);

        this.generator = new Generator();
        this.controlRoom.add(this.generator);

        this.coolingSystem = new CoolingSystem();
        this.controlRoom.add(this.coolingSystem);
    }

    public double run(int time, int temperature) throws MeltdownException {
        SplitResult result = this.reactor.run(time, temperature);
        double kwh = this.generator.generateEnergy(result.getSteamInCubicMeters());
        this.coolingSystem.abductResidualHeat(result.getResidualHeat());

        return kwh;
    }
}