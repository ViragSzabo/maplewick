package implementation.week12.highcourt.inventory;

import java.time.LocalDate;

public class Car extends Good
{
    private static final int MAX_NUMBER_OF_PRODUCE_YEARS = 3;
    private static final double LAMBORGHINI_DEFAULT_VALUE = 5000.0;
    private static final double VEHICLE_DEFAULT_VALUE = 1000.0;
    private static final double VEHICLE_AT_LEAST_THREE_YEARS_OLD = 2000.0;
    private static final double DEDUCTED_AMOUNT = 10.0;

    private String brand;
    private int kmDriven;

    public Car(String description, LocalDate productionDate, String brand, int kmDriven)
    {
        super(description, productionDate);

        this.setBrand(brand);
        this.setKmDriven(kmDriven);
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        if (brand == null || brand.isEmpty())
        {
            throw new IllegalArgumentException("Brand cannot be null or empty");
        }

        this.brand = brand;
    }

    public int getKmDriven()
    {
        return kmDriven;
    }

    public void setKmDriven(int kmDriven)
    {
        if (kmDriven < 0)
        {
            throw new IllegalArgumentException("KmDriven cannot be negative");
        }

        this.kmDriven = kmDriven;
    }

    @Override
    public double getValue(LocalDate date)
    {
        if (this.getBrand().equalsIgnoreCase("Lamborghini"))
        {
            return LAMBORGHINI_DEFAULT_VALUE - getDeductedValueOfTheVehicle();
        }
        else
        {
            return getValueOfVehicleBasedOnProductionYear(date);
        }
    }

    private double getDeductedValueOfTheVehicle()
    {
        double kmDrivenPer1000 = (double) this.kmDriven / 1000;
        double value = 0.0;

        for (int i = 0; i < kmDrivenPer1000; i++)
        {
            value += DEDUCTED_AMOUNT;
        }

        return value;
    }

    private double getValueOfVehicleBasedOnProductionYear(LocalDate date)
    {
        int productionYear = getProductionDate().getYear();
        int currentYear = date.getYear();

        if (productionYear - currentYear <= MAX_NUMBER_OF_PRODUCE_YEARS)
        {
            return VEHICLE_AT_LEAST_THREE_YEARS_OLD - getDeductedValueOfTheVehicle();
        }
        else
        {
            return VEHICLE_DEFAULT_VALUE - getDeductedValueOfTheVehicle();
        }
    }
}