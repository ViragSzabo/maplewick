package implementation.week9.EcoFriendlyTravelPlanner;

import implementation.week9.EcoFriendlyTravelPlanner.Planner.TravelPlanner;
import implementation.week9.EcoFriendlyTravelPlanner.Vehicles.TravelOption;

import java.util.Scanner;

public class EcoFriendlyTravelPlanner
{
    public static void main(String[] args)
    {
        System.out.println("🌍 Welcome to the Eco Friendly Travel Planner – Maplewick Edition 🍁");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance you want to travel (km): ");
        int distance = scanner.nextInt();
        TravelPlanner planner = new TravelPlanner(distance);

        System.out.println("\n🏆 Best Options:");
        TravelOption cheapest = planner.findCheapest();
        TravelOption fastest = planner.findFastest();
        TravelOption eco = planner.findMostEcoFriendly();

        System.out.printf("💰 Cheapest: %s (Cost: €%.2f)%n", cheapest.getName(), cheapest.calculateCost());
        System.out.printf("⚡ Fastest: %s (Time: %.2f h)%n", fastest.getName(), fastest.calculateTime());
        System.out.printf("🌿 Most Eco-Friendly: %s (Eco Score: %.1f)%n", eco.getName(), eco.getEcoScore());

        System.out.println("----------------------------------------------------");
        planner.showComparisons();
    }
}