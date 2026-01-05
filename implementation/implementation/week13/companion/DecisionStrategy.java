package implementation.week13.companion;

public interface DecisionStrategy
{
    String getName();
    String analyse(Scenario scenario);
}