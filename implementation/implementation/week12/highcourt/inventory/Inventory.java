package implementation.week12.highcourt.inventory;

import java.time.LocalDate;

public class Inventory extends Good
{
    private static final int MAX_NUMBER_OF_PRODUCTION_YEARS = 1;
    private static final double DEFAULT_VALUE_FOR_ELECTRONICS = 20.0;
    private static final double LAST_YEAR_VALUE_FOR_ELECTRONICS = 200.0;
    private static final double LAST_YEAR_VALUE_FOR_KITCHEN_APPLIANCES = 100.0;

    private InventoryType type;

    public Inventory(String description, LocalDate productionDate, InventoryType type)
    {
        super(description, productionDate);
        this.setType(type);
    }

    public InventoryType getType()
    {
        return type;
    }

    public void setType(InventoryType type)
    {
        if (type == null)
        {
            throw new IllegalArgumentException("Inventory type cannot be null");
        }

        this.type = type;
    }

    @Override
    public double getValue(LocalDate date)
    {
        if (this.type == InventoryType.ELECTRONICS)
        {
            return getValueForElectronics(date);
        }
        else if (this.type == InventoryType.KITCHEN_APPLIANCES)
        {
            return getValueForKitchenAppliances(date);
        }

        return 0;
    }

    private double getValueForElectronics(LocalDate date)
    {
        int productionYear = getProductionDate().getYear();
        int currentYear = date.getYear();

        if (currentYear - productionYear == MAX_NUMBER_OF_PRODUCTION_YEARS)
        {
            return LAST_YEAR_VALUE_FOR_ELECTRONICS;
        }
        else
        {
            return DEFAULT_VALUE_FOR_ELECTRONICS;
        }
    }

    private double getValueForKitchenAppliances(LocalDate date)
    {
        int productionYear = getProductionDate().getYear();
        int currentYear = date.getYear();

        if (currentYear - productionYear == MAX_NUMBER_OF_PRODUCTION_YEARS)
        {
            return LAST_YEAR_VALUE_FOR_KITCHEN_APPLIANCES;
        }
        else
        {
            return 0.0;
        }
    }
}