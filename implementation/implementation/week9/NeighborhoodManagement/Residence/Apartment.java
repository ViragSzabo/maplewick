package implementation.week9.NeighborhoodManagement.Residence;

public class Apartment extends Residence
{
    private final int apartmentNumber;

    public Apartment(String address, int apartmentNumber)
    {
        super(address);
        this.apartmentNumber = apartmentNumber;
    }

    public int getApartmentNumber()
    {
        return apartmentNumber;
    }

    @Override
    public String getResidenceType()
    {
        return "Apartment " + apartmentNumber;
    }
}