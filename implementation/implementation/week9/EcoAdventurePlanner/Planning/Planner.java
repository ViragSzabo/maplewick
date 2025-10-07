package implementation.week9.EcoAdventurePlanner.Planning;

import implementation.week9.EcoAdventurePlanner.Adventures.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Planner {
    private final List<Adventure> adventures;

    public Planner(double distance, DIFFICULTYLEVEL level, AdventureType type) {
        adventures = new ArrayList<>();
        adventures.add(new Hiking(distance, level, type));
        adventures.add(new Cycling(distance, level, type));
        adventures.add(new Kayaking(distance, level, type));
        adventures.add(new TrainTrip(distance, level, type));
    }

    public List<Adventure> getAdventures() {
        return this.adventures;
    }

    public void addAdventure(Adventure adventure) {
        this.adventures.add(adventure);
    }

    public void removeAdventure(Adventure adventure) {
        this.adventures.remove(adventure);
    }

    public void findCheapest() {
        System.out.println("\n🌿 Cheapest Adventure");
        System.out.println("-------------------------------------");
        System.out.println(adventures.stream().min(Comparator.comparing(Adventure::calculateCost)));
    }

    public void findMostEcoFriendly() {
        System.out.println("\n🌿 Most EcoFriendly Adventure");
        System.out.println("-------------------------------------");
        System.out.println(adventures.stream().max(Comparator.comparingDouble(Adventure::calculateEcoScore)));
    }

    public void findShortestDuration() {
        System.out.println("\n🌿 Shortest Duration");
        System.out.println("-------------------------------------");
        System.out.println(adventures.stream().min(Comparator.comparingDouble(Adventure::calculateDuration)));
    }

    public void findLongestDuration() {
        System.out.println("\n🌿 Longest Duration");
        System.out.println("-------------------------------------");

        Adventure longest = null;
        double min = Double.MAX_VALUE;
        for (Adventure adventure : adventures) {
            if (adventure.calculateDuration() > adventure.calculateEcoScore()) {
                min = adventure.calculateDuration();
                longest = adventure;
            }
        }
        System.out.println(longest + " with " + min + "km");
    }

    public void showComparisons() {
        System.out.println("\n🌿 EcoAdventure Planner Comparisons");
        System.out.println("-------------------------------------");
        for (Adventure a : adventures) {
            System.out.printf("%-10s | Cost: €%.2f | CO₂: %.1f g | Time: %.2f h | Eco Score: %.1f%n",
                    a.getClass().getSimpleName(),
                    a.calculateCost(),
                    a.calculateCO2(),
                    a.calculateDuration(),
                    a.calculateEcoScore());
        }
    }
}