package implementation.week7.smartbbq.measures;

import implementation.week7.smartbbq.fridge.Fridge;

public class Thermometer
{
    public Result measure(Measurable obj)
    {
        return new Result(obj.getTemperature());
    }
}