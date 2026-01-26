package implementation.week13.hospitalmanagement.hospital;

public class Patient
{
    private String name;
    private int conditionSeverity; // 0 - 100
    private boolean insured;

    public Patient(String name, int conditionSeverity, boolean insured)
    {
        setName(name);
        setConditionSeverity(conditionSeverity);
        setInsured(insured);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if (name == null || name.isEmpty())
        {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        this.name = name;
    }

    public int getConditionSeverity()
    {
        return conditionSeverity;
    }

    public void setConditionSeverity(int conditionSeverity) throws IllegalArgumentException
    {
        if (conditionSeverity < 0 || conditionSeverity > 100)
        {
            throw new IllegalArgumentException();
        }

        this.conditionSeverity = conditionSeverity;
    }

    public boolean isInsured()
    {
        return insured;
    }

    public void setInsured(boolean insured) throws IllegalArgumentException
    {
        if (!insured)
        {
            throw new IllegalArgumentException("This patient is not insured!");
        }

        this.insured = true;
    }

    public void worsen(int amount) throws IllegalArgumentException
    {
        int condition = this.conditionSeverity + amount;
        setConditionSeverity(condition);
    }

    public void improve(int amount) throws IllegalArgumentException
    {
        int condition = this.conditionSeverity - amount;
        setConditionSeverity(condition);
    }
}