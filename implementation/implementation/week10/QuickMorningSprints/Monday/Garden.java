package implementation.week10.QuickMorningSprints.Monday;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    /** Properties of the Plant */
    private List<Plant> plants;

    /** Constructor */
    public Garden() {
        this.plants = new ArrayList<Plant>();
    }

    /** Getters, Setters, Removes and Adds */
    public List<Plant> getPlants() {
        return this.plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }

    public void addPlant(Plant plant) {
        this.plants.add(plant);
    }

    public void removePlant(Plant plant) {
        this.plants.remove(plant);
    }

    /** Water the plants */
    public void waterAll() {
        int increase = 0;

        for (Plant plant : plants) {
            increase = plant.getDaysSincePlanted() + 1;
            plant.setDaysSincePlanted(increase);
        }
    }

    /** Harvest time */
    public void harvest() {
        // boolean harvested = false;
        // String name = "";
        List<Plant> harvestedPlants = new ArrayList<>();

        for (Plant plant : plants) {
            if (plant.getDaysSincePlanted() >= 7) {
                // harvested = true;
                // name = plant.getName();
                plant.setHarvestable(true);
                harvestedPlants.add(plant);
            }
        }

        if (harvestedPlants.isEmpty()) {
            System.out.println("No harvest ready");
        }

        System.out.println("Harvesting ready");
        System.out.println("Number of plants that are ready for harvest: " + harvestedPlants.size());
    }
}