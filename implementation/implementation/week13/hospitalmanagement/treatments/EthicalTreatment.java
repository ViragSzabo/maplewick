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
    public void treat(Patient patient) throws MalpracticeException
    {
        patient.getImprove(20);
        new TreatmentResult(true, "Patient treated ethically");
    }
}