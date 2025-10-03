package implementation.week7.SmartBBQ.Measures;

public class Thermometer
{
    public Result measure(Measurable measurable)
    {
        return new Result(measurable.getTemperature());
    }
}