package implementation.week13.hospitalmanagement.treatments;

import implementation.week13.hospitalmanagement.exceptions.MalpracticeException;
import implementation.week13.hospitalmanagement.hospital.Patient;

public class CostCuttingTreatment extends TreatmentStrategy
{
    public CostCuttingTreatment()
    {
        super("Cost Cutting Treatment");
    }

    @Override
    public void treat(Patient patient) throws MalpracticeException
    {
        if (patient.getConditionSeverity() <= 5)
        {
            throw new MalpracticeException("Treatment cannot happen");
        }

        patient.improve(5);

        new TreatmentResult(true, "Treatment applied");
    }
}