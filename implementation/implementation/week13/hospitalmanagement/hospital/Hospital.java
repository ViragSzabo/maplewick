package implementation.week13.hospitalmanagement.hospital;

import implementation.week13.hospitalmanagement.exceptions.MalpracticeException;
import implementation.week13.hospitalmanagement.treatments.TreatmentStrategy;

public class Hospital
{
    public void applyTreatment(Patient patient, TreatmentStrategy strategy)
    {
        try
        {
            strategy.treat(patient);
        }
        catch (MalpracticeException e)
        {
            patient.getWorse(10);
        }
    }
}