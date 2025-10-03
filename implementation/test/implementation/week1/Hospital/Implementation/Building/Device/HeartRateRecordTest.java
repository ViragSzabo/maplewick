package implementation.week1.Hospital.Implementation.Building.Device;

import implementation.week1.Hospital.Implementation.Patient.Gender;
import implementation.week1.Hospital.Implementation.Patient.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateRecordTest {
    HeartRateRecord record1;
    HeartRateRecord record2;
    HeartRateRecord record3;
    Patient patient1;
    Patient patient2;
    Patient patient3;
    HeartRateMonitor hrm1;

    @BeforeEach
    void setUp() {
        this.hrm1 = new HeartRateMonitor("HRM-001", 50.0);

        this.patient1 = new Patient("John", "Doe",
                LocalDate.of(1985, 5, 20), Gender.MALE, true);
        this.patient2 = new Patient("Jane", "Smith",
                LocalDate.of(1990, 8, 15), Gender.FEMALE, false);
        this.patient3 = new Patient("Jim", "Smith",
                LocalDate.of(2000, 3, 6), Gender.MALE, false);

        this.record1 = new HeartRateRecord(patient1, hrm1, 93);
        this.record2 = new HeartRateRecord(patient2, hrm1, 68);
        this.record3 = new HeartRateRecord(patient3, hrm1, 72);
    }

    @Test
    void calculateStatus() {
        assertEquals("WARNING", record1.calculateStatus(record1.getHeartRate(), patient1.getGender()));
        assertEquals("CRITICAL", record2.calculateStatus(record2.getHeartRate(), patient2.getGender()));
        assertEquals("NORMAL", record3.calculateStatus(record3.getHeartRate(), patient3.getGender()));
    }
}