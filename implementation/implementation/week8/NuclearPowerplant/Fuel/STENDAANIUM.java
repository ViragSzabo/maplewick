package implementation.week8.NuclearPowerplant.Fuel;

import implementation.week8.NuclearPowerplant.Reactor.SplitResult;

public class STENDAANIUM extends SplittingRod
{
    @Override
    public SplitResult split(int time, int temperature) throws MeltdownException
    {
        if (temperature > 150)
        {
            throw new MeltdownException();
        }

        if (temperature >= 50)
        {
            this.remainPercentage -= 0.00007 * temperature * time + 0.0004;
        }

        return new SplitResult(50.0 * temperature, (time / 0.5) * 20.0) {
            @Override
            public SplitResult split(int time, int temperature) throws MeltdownException {
                return this.split(time, temperature);
            }
        };
    }
}