package implementation.week14.airport;

public class PassengerPlane extends Aircraft implements Maintenance
{
    private static final double REQUIRED_FUEL_PERCENTAGE = 0.5;

    private int maxPassengers;
    private int bookedSeats;
    private double ticketPrice;

    public PassengerPlane(String callSign, int fuelCapacity, double currentFuel, int maxPassengers, double ticketPrice)
    {
        super(callSign, fuelCapacity, currentFuel);
        setMaxPassengers(maxPassengers);
        setTicketPrice(ticketPrice);
    }

    @Override
    public void fly(int distance) throws InsufficientFuelException
    {
        // 1. Calculate Required Fuel
        double requiredFuel = REQUIRED_FUEL_PERCENTAGE * distance * bookedSeats;

        // 2. Check If Enough
        if (getCurrentFuel() < requiredFuel)
        {
            throw new InsufficientFuelException("Too low. Not enough fuel.");
        }
        else
        {
            setCurrentFuel(getCurrentFuel() - requiredFuel);
            System.out.println("Flight successful. Consumed: " + requiredFuel);
        }
    }

    @Override
    public boolean performCheck()
    {
        return this.bookedSeats <= this.maxPassengers;
    }

    public int getMaxPassengers()
    {
        return this.maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers)
    {
        if (maxPassengers < 0)
        {
            throw new IllegalArgumentException("maxPassengers cannot be less than 0");
        }

        this.maxPassengers = maxPassengers;
    }

    public int getBookedSeats()
    {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats)
    {
        if (bookedSeats < 0 || bookedSeats > maxPassengers)
        {
            throw new IllegalArgumentException("Invalid seat count");
        }

        this.bookedSeats = bookedSeats;
    }

    public double getTicketPrice()
    {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice)
    {
        if (ticketPrice < 0)
        {
            throw new IllegalArgumentException("ticketPrice cannot be less than 0");
        }

        this.ticketPrice = ticketPrice;
    }
}