package implementation.week9.EcoFriendlyTravelPlanner.Planner;

import implementation.week9.EcoFriendlyTravelPlanner.Vehicles.*;

import java.util.Comparator;
import java.util.HashSet;

public class TravelPlanner
{
    private HashSet<TravelOption> options = new HashSet<>();

    public TravelPlanner(double distance)
    {
        options.add(new Walking(distance));
        options.add(new Bike(distance));
        options.add(new Bus(distance));
        options.add(new Train(distance));
        options.add(new ElectricCar(distance));
        options.add(new Car(distance));
    }

    public TravelOption findCheapest()
    {
        return options.stream().min(Comparator.comparing(TravelOption::calculateCost)).orElse(null);
    }

    public TravelOption findFastest()
    {
        return options.stream().min(Comparator.comparing(TravelOption::calculateTime)).orElse(null);
    }

    public TravelOption findMostEcoFriendly()
    {
        return options.stream().min(Comparator.comparing(TravelOption::calculateCO2)).orElse(null);
    }

    public void showComparisons() {
        System.out.println("🌍 EcoFriendly Travel Planner");
        System.out.printf("%-12s | %-8s | %-8s | %-8s | %-10s | %s%n",
                "Option", "Cost (€)", "CO₂ (g)", "Time (h)", "Eco Score", "Notes");
        System.out.println("----------------------------------------------------------------------");

        for (TravelOption option : options) {
            String emoji = switch (option.getName()) {
                case "Bike" -> "🚲 Pedal your way through the cobblestone streets!";
                case "Walking" -> "🚶‍♀️ Stroll under the autumn leaves!";
                case "Bus" -> "🚌 Share a ride with fellow Maplewick travelers!";
                case "Train" -> "🚆 Glide swiftly across town!";
                case "Car" -> "🚗 Drive your carriage carefully!";
                case "ElectricCar" -> "⚡️ Glide silently, sparing the leaves!";
                default -> "";
            };

            System.out.printf("%-12s | %-8.2f | %-8.1f | %-8.2f | %-10.1f | %s%n",
                    option.getName(),
                    option.calculateCost(),
                    option.calculateCO2(),
                    option.calculateTime(),
                    option.getEcoScore(),
                    emoji);
        }
    }
}