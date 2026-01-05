package implementation.week8.NuclearPowerplant;

import implementation.week8.NuclearPowerplant.Control.Status;
import implementation.week8.NuclearPowerplant.Control.Statusable;

public class CoolingSystem implements Statusable
{
    private double waterTemperature;

    public CoolingSystem()
    {
        this.waterTemperature = 0.0;
    }

    public void abductResidualHeat(double heat)
    {
        final double HELP_NUMBER_ABDUCTION_OF_RESIDUAL_HEAR = 0.4;

        this.waterTemperature = heat * HELP_NUMBER_ABDUCTION_OF_RESIDUAL_HEAR;
    }

    @Override
    public Status getStatus()
    {
        final double CHECK_WATER_TEMP_LOW = 355.0;
        final double CHECK_WATER_TEMP_HIGH = 361.0;

        if (this.waterTemperature > CHECK_WATER_TEMP_LOW && this.waterTemperature < CHECK_WATER_TEMP_HIGH)
        {
            return Status.NEEDS_ATTENTION;
        }
        else if (this.waterTemperature > CHECK_WATER_TEMP_HIGH)
        {
            return Status.UNSTABLE;
        }

        return Status.STABLE;
    }
}