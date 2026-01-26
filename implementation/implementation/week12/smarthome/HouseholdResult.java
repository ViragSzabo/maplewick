package implementation.week12.smarthome;

public class HouseholdResult
{
    private double gridBudget;
    private double gridPricePerKwh;

    public HouseholdResult(double gridBudget, double gridPricePerKwh)
    {
        this.setGridBudget(gridBudget);
        this.setGridPricePerKwh(gridPricePerKwh);
    }

    public double getGridBudget()
    {
        return this.gridBudget;
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
        return this.gridPricePerKwh;
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