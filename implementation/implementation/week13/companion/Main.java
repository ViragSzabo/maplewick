package implementation.week13.companion;

import java.util.Arrays;
import java.util.HashSet;

public class Main
{
    public static void main(String[] args)
{
    System.out.println("🌿 Ethical Decision Companion Starting...\n");

    // 1. Define the Scenario (Input)
    Scenario icuScenario = new Scenario(
            "The ICU Dilemma",
            "A hospital has one ICU bed left. Two patients need it. " +
                    "Patient A has better survival odds. Patient B has 3 young children.",
            new HashSet<>(Arrays.asList("Patient A", "Patient B", "Medical Staff", "Patient B's Children"))
    );

    System.out.println(icuScenario);
    System.out.println("--------------------------------------------------");

    // 2. Run Strategy 1 (Utilitarian)
    DecisionStrategy strat1 = new UtilitarianStrategy();
    printAnalysis(strat1, icuScenario);

    // 3. Run Strategy 2 (Duty-Based)
    DecisionStrategy strat2 = new DutyBasedStrategy();
    printAnalysis(strat2, icuScenario);

    // 4. Run AI Reflection (The "Human" Element)
    AIReflectionService aiService = new AIReflectionService();
    System.out.println("🤖 AI COMPANION:");

    // FIX: Call 'analyseScenario' instead of 'getReflection'
    System.out.println(aiService.analyseScenario(icuScenario));

    System.out.println("\n--------------------------------------------------");
    System.out.println("End of Session. Remember: Tools inform, Humans decide.");
}

    // Helper method to keep main clean
    private static void printAnalysis(DecisionStrategy strategy, Scenario scenario)
    {
        System.out.println("Analyzing via: " + strategy.getName());
        System.out.println(">> " + strategy.analyse(scenario));
        System.out.println();
    }
}