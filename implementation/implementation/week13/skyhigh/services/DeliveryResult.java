package implementation.week13.skyhigh.services;

public class DeliveryResult
{
    private double distanceKm;
    private double wearPercentage;

    public DeliveryResult(double distanceKm, double wearPercentage)
    {
        setDistanceKm(distanceKm);
        setWearPercentage(wearPercentage);
    }

    public double getDistanceKm()
    {
        return this.distanceKm;
    }

    public void setDistanceKm(double distanceKm)
    {
        if (distanceKm < 0)
        {
            throw new IllegalArgumentException("DistanceKm should be a positive number");
        }

        this.distanceKm = distanceKm;
    }

    public double getWearPercentage()
    {
        return wearPercentage;
    }

    public void setWearPercentage(double wearPercentage)
    {
        if (wearPercentage < 0)
        {
            throw new IllegalArgumentException("WearPercentage should be a positive number");
        }

        this.wearPercentage = wearPercentage;
    }
}