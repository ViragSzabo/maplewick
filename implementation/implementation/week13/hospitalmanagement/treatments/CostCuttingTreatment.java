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
        if (patient.getConditionSeverity() > 80)
        {
            throw new MalpracticeException("Treatment denied due to cost");
        }

        patient.getImprove(5);

        new TreatmentResult(false, "Minimal treatment applied");
    }
}
