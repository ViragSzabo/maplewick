package implementation.week14.galactic.ships;

import implementation.week14.galactic.enums.Cargo;
import implementation.week14.galactic.enums.MissionType;
import implementation.week14.galactic.interfaces.WarpCapable;

import java.util.ArrayList;
import java.util.List;

public class Freighter extends Starship implements WarpCapable
{
    private List<Cargo> cargoBay;

    public Freighter(String callSign)
    {
        super(callSign);

        this.cargoBay = new ArrayList<>();
    }

    @Override
    public MissionType performMission(MissionType mission)
    {
        return null;
    }

    @Override
    public void warpJump(int lightYears)
    {

    }

    public List<Cargo> getCargoBay()
    {
        return this.cargoBay;
    }

    public void addCargoBay(Cargo cargo)
    {
        this.cargoBay.add(cargo);
    }

    public void removeCargoBay(Cargo cargo)
    {
        this.cargoBay.remove(cargo);
    }
}