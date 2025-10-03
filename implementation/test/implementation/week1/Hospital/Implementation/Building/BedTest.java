package implementation.week1.Hospital.Implementation.Building;

import implementation.week1.Hospital.Implementation.Patient.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BedTest {
    Bed bed = new Bed(450);
    Patient patient = new Patient("Olivia", "Green",
                LocalDate.of(1987, 12, 25), Gender.FEMALE, true);

    @org.junit.jupiter.api.Test
    void assignPatient() {
        bed.assignPatient(patient);
        assertEquals(patient, bed.getPatient());
    }

    @org.junit.jupiter.api.Test
    void releaseBed() {
        bed.assignPatient(patient);
        bed.releaseBed();
        assertNull(bed.getPatient());
    }
}