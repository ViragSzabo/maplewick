package implementation.week13.hydroelectricdam;

public class HydroElectricDam extends PowerGenerator
{
    private static final double MIN_LEVEL = 10.0;
    private static final double MAX_LEVEL = 100.0;
    private static final double FLOW_TO_LEVEL_RATIO = 0.5;
    private static final double EFFICIENCY_MULTIPLIER = 0.5;

    public HydroElectricDam(double reservoirLevel)
    {
        super(reservoirLevel);
    }

    @Override
    public double generateElectricity(double waterFlow) throws HydroElectricCriticalException
    {
        // 1. Calculate Future State
        double levelDrop = waterFlow * FLOW_TO_LEVEL_RATIO;
        double newLevel = getReservoirLevel() - levelDrop;

        // 2. Safety Check: Are we draining the dam too low?
        if (newLevel < MIN_LEVEL)
        {
            throw new HydroElectricCriticalException("WARNING: Operation would drain reservoir below " + MIN_LEVEL);
        }

        // 3. Safety Check: Is the flow physically possible? (Optional but good)
        if (waterFlow > MAX_LEVEL)
        {
            throw new HydroElectricCriticalException("Flow rate exceeds system capacity!");
        }

        // 4. Update State (Clean update, no side effects)
        setReservoirLevel(newLevel);

        return waterFlow * EFFICIENCY_MULTIPLIER;
    }

    public void emergencyFill(double amount) throws HydroElectricCriticalException
    {
        if (amount < 0)
        {
            throw new HydroElectricCriticalException("The emergency fill cannot be less than 0.");
        }

        double predictedLevel = getReservoirLevel() + amount;

        if (predictedLevel > MAX_LEVEL)
        {
            throw new HydroElectricCriticalException("The hydro electric dam overflows! Capacity exceeded.");
        }

        setReservoirLevel(predictedLevel);
    }
}