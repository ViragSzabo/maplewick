package implementation.week14.brewery;

import implementation.week14.brewery.vat.Vat;

import java.util.ArrayList;
import java.util.List;

public class Factory
{
    private List<Vat> vats;

    public Factory()
    {
        this.vats = new ArrayList<>();
    }

    public List<Vat> getVats()
    {
        return this.vats;
    }

    public void addVat(Vat vat)
    {
        this.vats.add(vat);
    }

    public void removeVat(Vat vat)
    {
        this.vats.remove(vat);
    }

    public void checkSafety()
    {
        for (Vat vat : this.vats)
        {
            if (vat.getDangerLevel() > 0.9) // 90%
            {
                System.out.println("WARNING: " + vat.getId() + " is critical!");
            }
        }
    }
}