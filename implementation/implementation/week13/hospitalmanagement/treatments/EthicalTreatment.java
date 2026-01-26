package implementation.week13.hospitalmanagement.treatments;

import implementation.week13.hospitalmanagement.exceptions.MalpracticeException;
import implementation.week13.hospitalmanagement.hospital.Patient;

public class EthicalTreatment extends TreatmentStrategy
{
    public EthicalTreatment()
    {
        super("Ethical Treatment");
    }

    @Override
    public TreatmentResult treat(Patient patient) throws MalpracticeException
    {
        if (patient.getConditionSeverity() == 0)
        {
            throw new MalpracticeException("Treatment cannot happen");
        }

        patient.improve(20);
        return new TreatmentResult(true, "Patient treated ethically");
    }
}