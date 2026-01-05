package implementation.week13.companion;

public class DutyBasedStrategy implements DecisionStrategy
{
    @Override
    public String getName() {
        return "Duty-Based Approach (rules & right)";
    }

    @Override
    public String analyse(Scenario scenario) {
        return "Focus on the action itself: Are you violating any fundamental rights or professional codes?" +
                "regardless of the outcome, do not treat any stakeholder as merely a means to an end.";
    }
}