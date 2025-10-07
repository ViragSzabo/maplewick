package implementation.week9.EcoAdventurePlanner;

import implementation.week9.EcoAdventurePlanner.Adventures.Adventure;
import implementation.week9.EcoAdventurePlanner.Adventures.AdventureType;
import implementation.week9.EcoAdventurePlanner.Adventures.DIFFICULTYLEVEL;
import implementation.week9.EcoAdventurePlanner.Adventures.TrainTrip;
import implementation.week9.EcoAdventurePlanner.Planning.Planner;

public class EcoAdventurePlanner {
    public static void main(String[] args) {
        Planner planner = new Planner(100, DIFFICULTYLEVEL.HARD, AdventureType.INTERNATIONAL);

        planner.showComparisons();
        planner.findCheapest();
        planner.findLongestDuration();
        planner.findMostEcoFriendly();
    }
}