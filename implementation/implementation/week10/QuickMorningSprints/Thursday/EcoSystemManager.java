package implementation.week10.QuickMorningSprints.Thursday;

import implementation.week10.QuickMorningSprints.Monday.Garden;
import implementation.week10.QuickMorningSprints.Monday.Plant;
import implementation.week10.QuickMorningSprints.Tuesday.Grill;
import implementation.week10.QuickMorningSprints.Tuesday.WARNING;
import implementation.week10.QuickMorningSprints.Wednesday.FissionReactor;
import implementation.week10.QuickMorningSprints.Wednesday.FusionReactor;
import implementation.week10.QuickMorningSprints.Wednesday.NuclearPowerPlant;

public class EcoSystemManager {
    Garden garden;
    Grill bbq;
    FissionReactor fissionReactor;
    FusionReactor fusionReactor;
    NuclearPowerPlant plant;

    public EcoSystemManager() {
        this.garden = new Garden();
        this.bbq = new Grill(200);
        this.fissionReactor = new FissionReactor();
        this.fusionReactor = new FusionReactor();
        this.plant = new NuclearPowerPlant();
    }

    public void simulateDay() throws WARNING, FUELEXCEPTION {
        if(garden.getPlants().isEmpty() | bbq.getTemperature() <= 0 | plant.getReactors().isEmpty()) {
            throw new FUELEXCEPTION();
        }

        garden.addPlant(new Plant("Pumpkin", 4, 5));
        garden.addPlant(new Plant("Rose", 2, 5));
        garden.waterAll();
        garden.waterAll();
        garden.waterAll();
        garden.harvest();

        bbq.increaseTemperature(50);

        plant.addReactor(fissionReactor);
        plant.addReactor(fusionReactor);
        System.out.println("Number of reactors out there: " + plant.getReactors().size());
    }

    public static void main(String[] args) throws WARNING, FUELEXCEPTION {
        EcoSystemManager manager = new EcoSystemManager();
        manager.simulateDay();
    }
}