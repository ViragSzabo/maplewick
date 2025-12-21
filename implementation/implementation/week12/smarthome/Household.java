package implementation.week12.smarthome;

import implementation.week12.smarthome.sources.PowerSource;
import java.util.HashSet;

public class Household
{
    private double gridBudget;
    private double gridPricePerKwh;
    private HashSet<PowerSource> sources;

    public Household(double gridBudget, double gridPricePerKwh)
    {
        this.setGridBudget(gridBudget);
        this.setGridPricePerKwh(gridPricePerKwh);
        this.sources = new HashSet<>();
    }

    public double getGridBudget()
    {
        return gridBudget;
    }

    public void setGridBudget(double gridBudget)
    {
        if (gridBudget < 0)
        {
            throw new IllegalArgumentException("Grid budget cannot be negative");
        }

        this.gridBudget = gridBudget;
    }

    public double getGridPricePerKwh()
    {
        return gridPricePerKwh;
    }

    public void setGridPricePerKwh(double gridPricePerKwh)
    {
        if (gridPricePerKwh < 0)
        {
            throw new IllegalArgumentException("Grid budget cannot be negative");
        }

        this.gridPricePerKwh = gridPricePerKwh;
    }
}