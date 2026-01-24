package implementation.week14.galactic.ships;

import implementation.week14.galactic.enums.Cargo;
import implementation.week14.galactic.enums.MissionType;
import implementation.week14.galactic.exceptions.IllegalCargoException;
import implementation.week14.galactic.exceptions.InsufficientFuelException;
import implementation.week14.galactic.interfaces.WarpCapable;

import java.util.ArrayList;
import java.util.List;

public class Freighter extends Starship implements WarpCapable
{
    private static final int MIN_FUEL = 30;
    private static final int YEARLY_FUEL_CONSUMES = 5;

    private List<Cargo> cargoBay;

    public Freighter(String callSign)
    {
        super(callSign);

        this.cargoBay = new ArrayList<>();
    }

    @Override
    public void performMission(MissionType mission) throws IllegalCargoException, InsufficientFuelException
    {
        if (mission == MissionType.TRANSPORT)
        {
            if (getFuelLevel() < MIN_FUEL)
            {
                throw new InsufficientFuelException("Not enough fuel!");
            }

            if (cargoBay.contains(Cargo.ALIEN_ARTIFACTS))
            {
                throw new IllegalCargoException("Contraband detected!");
            }

            this.cargoBay.clear();
            setFuelLevel(getFuelLevel() - MIN_FUEL);
        }
    }

    @Override
    public void warpJump(int lightYears) throws InsufficientFuelException
    {
        double cost = (double) (lightYears * YEARLY_FUEL_CONSUMES) / 100;

        if (getFuelLevel() < cost)
        {
            throw new InsufficientFuelException("Not enough fuel!");
        }

        setFuelLevel(getFuelLevel() - cost);
    }

    public void loadCargo(Cargo c)
    {
        this.cargoBay.add(c);
    }

    public List<Cargo> getCargoBay()
    {
        return this.cargoBay;
    }

    public void removeCargoBay(Cargo cargo)
    {
        this.cargoBay.remove(cargo);
    }
}