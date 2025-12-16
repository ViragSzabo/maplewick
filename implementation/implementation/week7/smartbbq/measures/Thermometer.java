package implementation.week7.smartbbq.measures;

public class Thermometer
{
    public Result measure(Measurable measurable)
    {
        return new Result(measurable.getTemperature());
    }
}