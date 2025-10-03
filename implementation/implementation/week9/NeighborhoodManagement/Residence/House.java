package implementation.week9.NeighborhoodManagement.Residence;

public class House extends Residence
{
    public House(String address)
    {
        super(address);
    }

    @Override
    public String getResidenceType()
    {
        return "House";
    }
}