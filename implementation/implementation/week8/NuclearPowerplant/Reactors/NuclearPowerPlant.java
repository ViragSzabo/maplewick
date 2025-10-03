package implementation.week8.NuclearPowerplant.Reactors;

import implementation.week8.NuclearPowerplant.MeltdownException;

public class NuclearPowerPlant
{
    private final Reactor reactor;
    private final Generator generator;
    private final CoolingSystem coolingSystem;
    private final ControlRoom controlRoom;

    public NuclearPowerPlant()
    {
        reactor = new Reactor();
        generator = new Generator();
        coolingSystem = new CoolingSystem();
        controlRoom = new ControlRoom(reactor, generator, coolingSystem);
    }

    public double run(double temperature, double time) throws MeltdownException
    {
        double[] results = reactor.splitAll(temperature, time);
        double residualHeat = results[0];
        double steam = results[1];

        double energyGenerated = generator.generateEnergy(steam);
        coolingSystem.abductResidualHeat(residualHeat);

        return energyGenerated;
    }

    public ControlRoom getControlRoom()
    {
        return controlRoom;
    }
}