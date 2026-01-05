package implementation.week13.companion;

public class UtilitarianStrategy implements DecisionStrategy
{
    @Override
    public String getName() {
        return "Utilitarian Approach (maximize good)";
    }

    @Override
    public String analyse(Scenario scenario) {
        return "Focus on the outcome: Which option saves the most lives?" +
                "Identify the choice that benefits the majority of the stakeholders:" +
                scenario.getStakeholders();
    }
}