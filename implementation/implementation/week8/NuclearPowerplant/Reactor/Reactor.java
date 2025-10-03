package implementation.week8.NuclearPowerplant.Reactor;

import implementation.week8.NuclearPowerplant.Control.Status;
import implementation.week8.NuclearPowerplant.Control.Statusable;
import implementation.week8.NuclearPowerplant.Fuel.MeltdownException;
import implementation.week8.NuclearPowerplant.Fuel.SplittingRod;

import java.util.HashSet;
import java.util.List;

public class Reactor implements Statusable {
    private final HashSet<SplitResult> splitResults;

    public Reactor()
    {
        this.splitResults = new HashSet<>();
    }

    public void addCore(SplitResult splitResult)
    {
        this.splitResults.add(splitResult);
    }

    public SplitResult run(int time, int temperature) throws MeltdownException
    {
        List<SplitResult> result = this.splitResults.stream()
                .map(splittingRod -> {
                    try {
                        return splittingRod.split(time, temperature);
                    } catch (MeltdownException e) {
                        throw new RuntimeException(e);
                    }
                })
                .toList();

        return new SplitResult(result.stream().mapToDouble(SplitResult::getSteamInCubicMeters).sum(),
                result.stream().mapToDouble(SplitResult::getResidualHeat).sum()) {
            @Override
            public SplitResult split(int time, int temperature) throws MeltdownException {
                return this.split(time, temperature);
            }
        };
    }

    public Status getStatus()
    {
        for (SplittingRod fuel : this.splitResults)
        {
            if (fuel.getPercentageLeft() <= 0.1)
            {
                return Status.NEEDS_ATTENTION;
            }
        }

        return Status.STABLE;
    }
}