package implementation.week13.hospitalmanagement.treatments;

import implementation.week13.hospitalmanagement.exceptions.MalpracticeException;
import implementation.week13.hospitalmanagement.exceptions.NotInsuredException;
import implementation.week13.hospitalmanagement.hospital.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CostCuttingTreatmentTest
{
    Patient patient;
    TreatmentStrategy strategy;

    @BeforeEach
    void setUp()
    {
        this.patient = new Patient("Nic", 90, true);
        this.strategy = new CostCuttingTreatment();
    }

    @Test
    void costCuttingTreatment_throwsException_whenPatientIsCritical()
    {
        assertThrows(
                MalpracticeException.class,
                () -> strategy.treat(patient)
        );
    }

    // treatment improves (condition goes down)
    // no patient provided
    // strategy is null
}