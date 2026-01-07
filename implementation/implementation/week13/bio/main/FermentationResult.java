package implementation.week13.bio.main;

public record FermentationResult(double toxicWasteMg, double rawEthanolMl)
{
    @Override
    public String toString()
    {
        return "Toxic Waste: " + toxicWasteMg + "mg; Raw Ethanol: " + rawEthanolMl + "ml";
    }
}