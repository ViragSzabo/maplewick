package implementation.week13.bio.main;

import implementation.week13.bio.CentralMonitor;
import implementation.week13.bio.bacterias.SuperBacteria;
import implementation.week13.bio.bacterias.TurboYeast;
import implementation.week13.bio.status.ContaminationException;

public class BioRefinery
{
    private FermentationTank tank;
    private Distiller distiller;
    private WasteFilter wasteFilter;
    private CentralMonitor monitor;

    public BioRefinery()
    {
        this.tank = new FermentationTank();
        this.tank.addBacteriaCulture(new TurboYeast());
        this.tank.addBacteriaCulture(new SuperBacteria());

        this.distiller = new Distiller();
        this.wasteFilter = new WasteFilter();

        this.monitor = new CentralMonitor();
        this.monitor.addComponent(this.tank);
        this.monitor.addComponent(this.distiller);
        this.monitor.addComponent(this.wasteFilter);
    }

    public double processing(double sugar, int time) throws ContaminationException
    {
        // 1. Ferment
        FermentationResult result = this.tank.run(sugar, time);

        // 2. Process Waste
        this.wasteFilter.absorbWaste(result.toxicWasteMg());

        // 3. Process Fuel
        return this.distiller.getPureFuel(result.rawEthanolMl());
    }

    public boolean checkSystemStatus()
    {
        return this.monitor.isRefineryStable();
    }
}