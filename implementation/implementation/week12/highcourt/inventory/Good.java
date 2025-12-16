package implementation.week12.highcourt.inventory;

import java.time.LocalDate;
import java.util.HashSet;

public abstract class Good
{
    private String description;
    private LocalDate productionDate;
    private HashSet<Good> goodsToBeSeized;

    public Good(String description, LocalDate productionDate)
    {
        this.setDescription(description);
        this.setProductionDate(productionDate);
        this.goodsToBeSeized = new HashSet<>();
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

    public HashSet<Good> getGoodsToBeSeized()
    {
        return goodsToBeSeized;
    }

    public void addGoodsToBeSeized(Good good)
    {
        this.goodsToBeSeized.add(good);
    }

    public void removeGoodsToBeSeized(Good good)
    {
        this.goodsToBeSeized.remove(good);
    }

    public abstract double getValue(LocalDate date);
}