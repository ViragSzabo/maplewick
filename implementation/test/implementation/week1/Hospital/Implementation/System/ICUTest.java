package implementation.week1.Hospital.Implementation.System;

import implementation.week1.Hospital.Implementation.Building.Bed;
import implementation.week1.Hospital.Implementation.Building.Device.BloodPressureMonitor;
import implementation.week1.Hospital.Implementation.Building.Device.HeartRateMonitor;
import implementation.week1.Hospital.Implementation.Building.Device.MedicalDevice;
import implementation.week1.Hospital.Implementation.Patient.Gender;
import implementation.week1.Hospital.Implementation.Patient.Patient;
import implementation.week1.Hospital.Implementation.Staff.Doctor;
import implementation.week1.Hospital.Implementation.Staff.Nurse;
import implementation.week1.Hospital.Implementation.Staff.StaffMember;
import implementation.week2.Implementation.Hospital_Part2.CodeBlackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ICUTest {
    ICU icu;
    Bed bed1;
    Bed bed2;
    MedicalDevice hrm1;
    MedicalDevice bpm1;
    Patient patient1;
    Patient patient2;
    Patient patient3;
    StaffMember nurse;
    StaffMember doctor;
    StaffMember nurse2;
    StaffMember doctor2;

    @BeforeEach
    void setUp() {
        this.icu = new ICU("Zwolle Centrum Hospital");

        this.bed1 = new Bed(1);
        this.bed2 = new Bed(2);

        this.hrm1 = new HeartRateMonitor("HRM-001", 50.0);
        this.bpm1 = new BloodPressureMonitor("BPM-001", 30.0);

        this.patient1 = new Patient("John", "Doe", LocalDate.of(1985, 5, 20), Gender.MALE, true);
        this.patient2 = new Patient("Jane", "Smith", LocalDate.of(1990, 8, 15), Gender.FEMALE, false);
        this.patient3 = new Patient("Jim", "Smith", LocalDate.of(2000, 3, 6), Gender.MALE, false);

        this.nurse = new Nurse("Nurse Joy", LocalDate.of(1975, 3, 25), LocalDate.of(2000, 6, 1), 2.0f);
        this.doctor = new Doctor("Dr. Strange", LocalDate.of(1970, 11, 2), LocalDate.of(1995, 4, 10), 3.0f);
        this.nurse2 = new Nurse("Nurse Joy", LocalDate.of(1968, 7, 17), LocalDate.of(1983, 2, 5), 2.0f);
        this.doctor2 = new Doctor("Dr. Strange", LocalDate.of(1980, 10, 7), LocalDate.of(2005, 6, 1), 3.0f);
    }

    @Test
    void addPatient() {
        icu.addStaffMember(nurse);
        icu.addStaffMember(doctor);
        icu.addStaffMember(nurse2);
        icu.addStaffMember(doctor2);
        icu.addBed(bed1);
        icu.addBed(bed2);
        icu.addDevice(hrm1);
        icu.addDevice(bpm1);

        bed1.addDevice(hrm1);
        bed2.addDevice(bpm1);
        bed1.assignPatient(patient1);
        bed2.assignPatient(patient2);

        try {
            icu.addPatient(patient1);
            icu.addPatient(patient2);
        } catch (CodeBlackException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testGetTotalStaffFTE() {
        icu.addStaffMember(nurse);
        icu.addStaffMember(doctor);
        icu.addStaffMember(nurse2);
        icu.addStaffMember(doctor2);
        assertEquals(10.0F, icu.getTotalStaffFTE());
    }

    @Test
    public void testCurrentFTE() throws CodeBlackException {
        icu.addStaffMember(nurse);
        icu.addStaffMember(doctor);
        icu.addStaffMember(nurse2);
        icu.addStaffMember(doctor2);
        icu.addBed(bed1);
        icu.addBed(bed2);
        icu.addDevice(hrm1);
        icu.addDevice(bpm1);
        icu.addPatient(patient1);
        icu.addPatient(patient2);
        icu.addPatient(patient3);
        bed1.assignPatient(patient1);

        assertEquals(5.4F, icu.currentFTE());
    }

    @Test
    public void testGetNoAvailableBeds() {
        icu.addStaffMember(nurse);
        icu.addStaffMember(doctor);
        icu.addStaffMember(nurse2);
        icu.addStaffMember(doctor2);
        icu.addBed(bed1);
        icu.addBed(bed2);
        icu.addDevice(hrm1);
        icu.addDevice(bpm1);
        try {
            icu.addPatient(patient1);
            icu.addPatient(patient2);
            icu.addPatient(patient3);
        } catch (CodeBlackException e) {
            throw new RuntimeException(e);
        }
        bed1.assignPatient(patient1);
        bed2.assignPatient(patient2);
        assertEquals(0, icu.getAvailableBeds().size());
    }

    @Test
    public void testGetAvailableBeds() {
        icu.addStaffMember(nurse);
        icu.addStaffMember(doctor);
        icu.addStaffMember(nurse2);
        icu.addStaffMember(doctor2);
        icu.addBed(bed1);
        icu.addBed(bed2);
        icu.addDevice(hrm1);
        icu.addDevice(bpm1);
        try {
            icu.addPatient(patient1);
            icu.addPatient(patient2);
            icu.addPatient(patient3);
        } catch (CodeBlackException e) {
            throw new RuntimeException(e);
        }
        bed1.assignPatient(patient1);
        assertEquals(1, icu.getAvailableBeds().size());
    }
}