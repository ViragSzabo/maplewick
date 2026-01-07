package implementation.week8.NuclearPowerplant;

import implementation.week8.NuclearPowerplant.Control.Status;
import implementation.week8.NuclearPowerplant.Control.Statusable;

public class CoolingSystem implements Statusable
{
    private static final double HEAT_TRANSFER_COEFFICIENT = 0.4;
    private static final double WARING_TEMP_THRESHOLD = 355.0;
    private static final double CRITICAL_TEMP_THRESHOLD = 361.0;
    private static final double INITIAL_WATER_TEMP = 0.0;

    private double waterTemperature;

    public CoolingSystem()
    {
        this.waterTemperature = INITIAL_WATER_TEMP;
    }

    public void abductResidualHeat(double heat)
    {
        this.waterTemperature += heat * HEAT_TRANSFER_COEFFICIENT;
    }

    @Override
    public Status getStatus()
    {
        if (this.waterTemperature >= CRITICAL_TEMP_THRESHOLD)
        {
            return Status.UNSTABLE;
        }

        if (this.waterTemperature > WARING_TEMP_THRESHOLD)
        {
            return Status.NEEDS_ATTENTION;
        }

        return Status.STABLE;
    }
}