package implementation.week8.NuclearPowerplant.Reactors;


import implementation.week8.NuclearPowerplant.MeltdownException;
import implementation.week8.NuclearPowerplant.SlittingRods.SplittingRod;

import java.util.ArrayList;
import java.util.List;

public class Reactor {
    private final List<SplittingRod> splittingRods = new ArrayList<>();

    public void addSplittingRod(SplittingRod rod)
    {
        splittingRods.add(rod);
    }

    public double[] splitAll(double temperature, double time) throws MeltdownException
    {
        double totalHeat = 0;
        double totalSteam = 0;

        for (SplittingRod rod : splittingRods) {
            double[] results = rod.split(temperature, time);
            totalHeat += results[0];
            totalSteam += results[1];
        }

        return new double[]{totalHeat, totalSteam};
    }

    public List<SplittingRod> getSplittingRods()
    {
        return splittingRods;
    }
}