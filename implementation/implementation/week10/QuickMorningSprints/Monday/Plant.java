package implementation.week10.QuickMorningSprints.Monday;

public class Plant {

    /** Properties of the Plant */
    private String name;
    private int growthRate;
    private int daysSincePlanted;
    private boolean harvestable;

    /** Constructor */
    public Plant(String name, int growthRate, int daysSincePlanted) {
        this.name = name;
        this.growthRate = growthRate;
        this.daysSincePlanted = daysSincePlanted;
        this.harvestable = false;
    }

    /** Getters and Setters */
    public boolean isHarvestable() {
        return harvestable;
    }

    public void setHarvestable(boolean harvestable) {
        this.harvestable = harvestable;
    }

    public int getDaysSincePlanted() {
        return this.daysSincePlanted;
    }

    public void setDaysSincePlanted(int daysSincePlanted) {
        this.daysSincePlanted = daysSincePlanted;
    }

    public int getGrowthRate() {
        return this.growthRate;
    }

    public void setGrowthRate(int growthRate) {
        this.growthRate = growthRate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " (" + daysSincePlanted + " days)";
    }
}