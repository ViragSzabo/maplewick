package implementation.week13.bio.main;

import implementation.week13.bio.status.Monitorable;
import implementation.week13.bio.status.Status;

public class WasteFilter implements Monitorable
{
    private static final double INCREASE_CLOGGING_LEVEL = 0.02;
    private static final double MAX_CLOGGING_LEVEL = 100;
    private static final double DANGEROUS_MIN_CLOGGING_LEVEL = 80.0;
    private static final double CHECK_MIN_CLOGGING_LEVEL = 60.0;

    private double cloggingLevel;

    public WasteFilter()
    {
        super();
    }

    public void absorbWaste(double toxicWasteMg)
    {
        this.cloggingLevel = toxicWasteMg * INCREASE_CLOGGING_LEVEL;

        if (this.cloggingLevel > MAX_CLOGGING_LEVEL)
        {
            this.cloggingLevel = MAX_CLOGGING_LEVEL;
        }
    }

    @Override
    public Status checkSystem()
    {
        if (this.cloggingLevel > DANGEROUS_MIN_CLOGGING_LEVEL)
        {
            return Status.DANGER;
        }

        if (this.cloggingLevel >= CHECK_MIN_CLOGGING_LEVEL)
        {
            return Status.CHECK;
        }

        return Status.OK;
    }
}