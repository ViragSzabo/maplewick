package implementation.week13.hospitalmanagement.hospital;

import implementation.week13.hospitalmanagement.exceptions.NotInsuredException;

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

    public void setConditionSeverity(int conditionSeverity)
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

    public void setInsured(boolean insured)
    {
        if (!insured)
        {
            throw new IllegalArgumentException("This patient is not insured!");
        }

        this.insured = true;
    }

    public void getWorse(int amount)
    {
        this.conditionSeverity -= amount;
    }

    public void getImprove(int amount)
    {
        this.conditionSeverity += amount;
    }
}