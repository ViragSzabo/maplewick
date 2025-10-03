package test.implementation.week1.Hospital.Implementation.Patient;

import implementation.week1.Hospital.Implementation.Patient.Gender;
import implementation.week1.Hospital.Implementation.Patient.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {
    Patient patient1;
    Patient patient2;
    Patient patient3;

    @BeforeEach
    void setUp() {
        this.patient1 = new Patient("John", "Doe", LocalDate.of(1985, 5, 20), Gender.MALE, true);
        this.patient2 = new Patient("Jane", "Smith", LocalDate.of(1990, 8, 15), Gender.FEMALE, false);
        this.patient3 = new Patient("Jim", "Smith", LocalDate.of(2000, 3, 6), Gender.MALE, false);
    }

    @Test
    void calcRequiredFTE() {
        assertEquals(1.0f, patient1.calcRequiredFTE());
        assertEquals(2.0f, patient2.calcRequiredFTE());
        assertEquals(2.0f, patient3.calcRequiredFTE());
    }

    @Test
    void canWalk() {
        assertTrue(patient1.canWalk());
        assertFalse(patient2.canWalk());
        assertFalse(patient3.canWalk());
    }
}