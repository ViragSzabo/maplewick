package implementation.week1.Hospital.Implementation.System;

import implementation.week1.Hospital.Implementation.Building.Bed;
import implementation.week1.Hospital.Implementation.Building.Device.MedicalDevice;
import implementation.week1.Hospital.Implementation.Patient.Patient;
import implementation.week1.Hospital.Implementation.Staff.StaffMember;
import implementation.week2.Implementation.Hospital_Part2.CodeBlackException;

import java.util.ArrayList;
import java.util.List;

public class ICU {
    private String location;
    private final List<Bed> beds;
    private final List<StaffMember> staffMembers;
    private final List<Patient> patients;
    private final List<MedicalDevice> allDevices;

    private static final float OVERHEAD_FTE_PER_UNIT = 0.2F;

    public ICU(String location)
    {
        this.location = location;
        this.beds = new ArrayList<>();
        this.staffMembers = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.allDevices = new ArrayList<>();
    }

    public List<Bed> getBeds()
    {
        return beds;
    }

    public void addBed(Bed bed)
    {
        beds.add(bed);
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public List<MedicalDevice> getAllDevices()
    {
        return this.allDevices;
    }

    public void addDevice(MedicalDevice device)
    {
        this.allDevices.add(device);
    }

    public void removeDevice(MedicalDevice device)
    {
        this.allDevices.remove(device);
    }

    public List<StaffMember> getStaffMembers()
    {
        return this.staffMembers;
    }

    public void addStaffMember(StaffMember staffMember)
    {
        staffMembers.add(staffMember);
    }

    public List<Patient> getPatients()
    {
        return patients;
    }

    /**
     * Add a new patient
     * @param patient is the new patient
     * @throws CodeBlackException an exception if there is no more space
     */
    public void addPatient(Patient patient) throws CodeBlackException
    {
        if(currentFTE() + patient.calcRequiredFTE() > getTotalStaffFTE())
        {
            throw new CodeBlackException("ICU capacity exceeded");
        }
        else
        {
            patients.add(patient);
        }
    }

    /**
     * Get all available beds
     * @return a list of unoccupied beds
     */
    public List<Bed> getAvailableBeds()
    {
        List<Bed> availableBeds = new ArrayList<>();
        for (Bed bed : beds)
        {
            if (!bed.getIsOccupied())
            {
                availableBeds.add(bed);
            }
        }
        return availableBeds;
    }

    /**
     * Get the current full-time equivalent
     * @return a float
     */
    public float currentFTE()
    {
        float fte = 0.0F;
        int dependencyCount = 0;

        for (MedicalDevice device : allDevices)
        {
            fte += device.calcRequiredFTE();
            dependencyCount++;
        }

        for (Patient patient : patients)
        {
            fte += patient.calcRequiredFTE();
            dependencyCount++;
        }

        if (dependencyCount > 5)
        {
            fte *= OVERHEAD_FTE_PER_UNIT;
        }

        return fte;
    }

    /**
     * Get the total member's full-time equivalent
     * @return a float
     */
    public float getTotalStaffFTE()
    {
        float total = 0.0F;
        for (StaffMember staffMember : staffMembers)
        {
            total += staffMember.getFTE();
        }
        return total;
    }
}