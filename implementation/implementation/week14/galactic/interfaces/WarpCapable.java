package implementation.week14.galactic.interfaces;

import implementation.week14.galactic.exceptions.InsufficientFuelException;

public interface WarpCapable
{
    void warpJump(int lightYears) throws InsufficientFuelException; // consumes 5% fuel per year
}