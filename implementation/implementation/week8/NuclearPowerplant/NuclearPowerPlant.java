package implementation.week8.NuclearPowerplant;

import implementation.week8.NuclearPowerplant.Control.ControlRoom;
import implementation.week8.NuclearPowerplant.Reactor.Reactor;
import implementation.week8.NuclearPowerplant.Fuel.MeltdownException;
import implementation.week8.NuclearPowerplant.Reactor.SplitResult;

public class NuclearPowerPlant
{
    private final Reactor reactor;
    private final Generator generator;
    private final CoolingSystem coolingSystem;
    private final ControlRoom controlRoom;

    public NuclearPowerPlant()
    {
        this.controlRoom = new ControlRoom();

        this.reactor = new Reactor();
        this.controlRoom.add(this.reactor);

        this.generator = new Generator();
        controlRoom.add(this.generator);

        this.coolingSystem = new CoolingSystem();
        controlRoom.add(this.coolingSystem);
    }

    public double run(int time, int temperature) throws MeltdownException
    {
        // 1. Handle Reaction
        SplitResult result = this.reactor.run(time, temperature);

        // 2. Energy Consumption
        double currentKwh = this.generator.generateEnergy(result.steamInCubicMeters());

        // 3. Cool Down
        this.coolingSystem.abductResidualHeat(result.residualHeat());

        // 4. Check Point
        if (!this.controlRoom.isStable())
        {
            throw new MeltdownException("WARNING! Power plant is unstable!");
        }

        return currentKwh;
    }
}