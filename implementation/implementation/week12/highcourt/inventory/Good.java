package implementation.week12.highcourt.inventory;

import java.time.LocalDate;

public abstract class Good
{
    private String description;
    private LocalDate productionDate;

    public Good(String description, LocalDate productionDate)
    {
        this.setDescription(description);
        this.setProductionDate(productionDate);
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        if (description == null || description.isEmpty())
        {
            throw new IllegalArgumentException("Description cannot be null or empty");
        }

        this.description = description;
    }

    public LocalDate getProductionDate()
    {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate)
    {
        if (productionDate == null)
        {
            throw new IllegalArgumentException("Production date cannot be null");
        }

        this.productionDate = productionDate;
    }

    public abstract double getValue(LocalDate date);
}