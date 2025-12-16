package implementation.week7.smartbbq.measures;

public class Result
{
    private final double temp;

    public Result(double temp)
    {
        this.temp = temp;
    }

    public String getTemp()
    {
        return "The temperature is " + temp + " degrees Celsius.";
    }

    public Classification getTempClass()
    {
        if(temp < 10.0) {
            return Classification.COLD;
        } else if (this.temp > 10 && this.temp < 70) {
            return Classification.MEDIUM;
        } else {
            return Classification.HOT;
        }
    }
}