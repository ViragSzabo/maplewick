package implementation.week7.smartbbq.measures;

import implementation.week7.smartbbq.fridge.Fridge;

public class Thermometer
{
    // CHECK AGAIN!!
    public Result measure(Fridge fridge)
    {
        return new Result(fridge.getTemperature());
    }
}