package implementation.week10.QuickMorningSprints.Friday;

import implementation.week10.QuickMorningSprints.Thursday.EcoSystemManager;
import implementation.week10.QuickMorningSprints.Thursday.FUELEXCEPTION;
import implementation.week10.QuickMorningSprints.Tuesday.WARNING;

public class Final {
    public static void main(String[] args) {
        EcoSystemManager manager = new EcoSystemManager();
        try {
            for(int day = 0; day < 7; day++) {
                System.out.println("=== 🌅 DAY " + (day + 1) + " SIMULATION START ===");
                manager.simulateDay();
                System.out.println();
            }
        } catch (WARNING | FUELEXCEPTION e) {
            System.err.println(e.getMessage());
        }
    }
}