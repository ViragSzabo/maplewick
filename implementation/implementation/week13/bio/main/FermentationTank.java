package implementation.week13.bio.main;

import implementation.week13.bio.bacterias.BacteriaCulture;
import implementation.week13.bio.status.ContaminationException;
import implementation.week13.bio.status.Monitorable;
import implementation.week13.bio.status.Status;

import java.util.HashSet;
import java.util.Set;

public class FermentationTank implements Monitorable
{
    private Set<BacteriaCulture> bacteriaCultures;
    private static final double CHECK_VITALITY_PERCENTAGE = 15.0;

    public FermentationTank()
    {
        this.bacteriaCultures = new HashSet<>();
    }

    public Set<BacteriaCulture> getBacteriaCultures()
    {
        return bacteriaCultures;
    }

    public void addBacteriaCulture(BacteriaCulture bacteriaCulture)
    {
        this.bacteriaCultures.add(bacteriaCulture);

        if (bacteriaCulture == null || this.bacteriaCultures.contains(bacteriaCulture))
        {
            throw new IllegalArgumentException("BacteriaCulture already exists");
        }
    }

    public void removeBacteriaCulture(BacteriaCulture bacteriaCulture)
    {
        if (!this.bacteriaCultures.contains(bacteriaCulture) || bacteriaCulture == null)
        {
            throw new IllegalArgumentException("BacteriaCulture does not exist");
        }

        this.bacteriaCultures.remove(bacteriaCulture);
    }

    public FermentationResult run(double sugar, int time) throws ContaminationException
    {
        double totalWaste = 0.0;
        double totalEthanol = 0.0;

        for (BacteriaCulture culture : bacteriaCultures)
        {
            FermentationResult result = culture.ferment(sugar, time);
            totalWaste += result.toxicWasteMg();
            totalEthanol += result.rawEthanolMl();
        }

        return new FermentationResult(totalWaste, totalEthanol);
    }

    @Override
    public Status checkSystem()
    {
        for (BacteriaCulture bacteriaCulture : this.bacteriaCultures)
        {
            if (bacteriaCulture.getVitalityPercentage() <= CHECK_VITALITY_PERCENTAGE)
            {
                return Status.CHECK;
            }
        }
        return Status.OK;
    }
}