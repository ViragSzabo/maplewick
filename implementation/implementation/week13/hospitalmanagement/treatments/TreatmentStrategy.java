package implementation.week13.hospitalmanagement.treatments;

import implementation.week13.hospitalmanagement.exceptions.MalpracticeException;
import implementation.week13.hospitalmanagement.hospital.Patient;

public abstract class TreatmentStrategy
{
    protected String name;

    public TreatmentStrategy(String name)
    {
        setName(name);
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

    public abstract TreatmentResult treat(Patient patient) throws MalpracticeException;
}