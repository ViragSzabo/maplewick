package implementation.week10.QuickMorningSprints.Thursday;

import implementation.week10.QuickMorningSprints.Monday.Garden;
import implementation.week10.QuickMorningSprints.Monday.Plant;
import implementation.week10.QuickMorningSprints.Tuesday.Grill;
import implementation.week10.QuickMorningSprints.Tuesday.WARNING;
import implementation.week10.QuickMorningSprints.Wednesday.FissionReactor;
import implementation.week10.QuickMorningSprints.Wednesday.FusionReactor;
import implementation.week10.QuickMorningSprints.Wednesday.IReactor;
import implementation.week10.QuickMorningSprints.Wednesday.NuclearPowerPlant;

import java.util.Random;

public class EcoSystemManager {
    Garden garden;
    Grill bbq;
    FissionReactor fissionReactor1;
    FissionReactor fissionReactor2;
    FusionReactor fusionReactor1;
    FusionReactor fusionReactor2;
    NuclearPowerPlant plant;
    Random random = new Random();

    public EcoSystemManager() {
        this.garden = new Garden();
        this.bbq = new Grill(200);
        this.fissionReactor1 = new FissionReactor();
        this.fusionReactor1 = new FusionReactor();
        this.fissionReactor2 = new FissionReactor();
        this.fusionReactor2 = new FusionReactor();
        this.plant = new NuclearPowerPlant();
    }

    public void simulateDay() throws WARNING, FUELEXCEPTION {
        bbq.increaseTemperature(50);
        plant.addReactor(fissionReactor1);
        plant.addReactor(fusionReactor1);
        plant.addReactor(fissionReactor2);
        plant.addReactor(fusionReactor2);
        String[] plantNames = {"Pumpkin", "Rose", "Tomato", "Lettuce", "Sunflower", "Basil", "Lavender"};
        garden.addPlant(new Plant(plantNames[random.nextInt(plantNames.length)], random.nextInt(4) + 1, random.nextInt(3)));

        // BBQ: fluctuate temp
        int change = random.nextInt(100) - 30; // random between -30 and +70
        if (change > 0)
            bbq.increaseTemperature(change);
        else
            System.out.println("Temperature cooled by " + Math.abs(change) + "°C");

        // Check systems — all must be active
        if(garden.getPlants().isEmpty() | bbq.getTemperature() <= 0 | plant.getReactors().isEmpty()) {
            throw new FUELEXCEPTION();
        }

        // Grow all plants in 3 days
        for (int i = 0; i < 3; i++) garden.waterAll();

        // Harvest time & Power check
        garden.harvest();
        for (IReactor reactor : plant.getReactors()) reactor.getStatus();

        System.out.println("🌿 Garden plant count: " + garden.getPlants().size());
        System.out.println("🔥 Grill temperature: " + bbq.getTemperature() + "°C");
        System.out.println("⚛️ Reactors online: " + plant.getReactors().size());
    }
}