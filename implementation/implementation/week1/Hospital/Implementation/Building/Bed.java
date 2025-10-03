package implementation.week1.Hospital.Implementation.Building;

import implementation.week1.Hospital.Implementation.Building.Device.MedicalDevice;
import implementation.week1.Hospital.Implementation.Patient.*;

import java.util.ArrayList;
import java.util.List;

public class Bed {
    private int bedNumber;
    private boolean isOccupied;
    private final List<MedicalDevice> devices;
    private implementation.week1.Hospital.Implementation.Patient.Patient patient;

    /**
     * Constructor for the bed
     * @param bedNumber as an id
     */
    public Bed(int bedNumber)
    {
        this.bedNumber = bedNumber;
        this.isOccupied = false;
        this.devices = new ArrayList<>();
    }

    /**
     * Get the number of the bed
     * @return the id of the bed
     */
    public int getBedNumber()
    {
        return bedNumber;
    }

    /**
     * Change the number of the bed
     * @param bedNumber the new id of the bed
     */
    public void setBedNumber(int bedNumber)
    {
        this.bedNumber = bedNumber;
    }

    /**
     * Get if the bed is occupied or not
     * @return a true or false
     */
    public boolean getIsOccupied()
    {
        return this.isOccupied;
    }

    /**
     * Get the list of devices that belongs to the bed
     * @return a list of devices
     */
    public List<MedicalDevice> getDevices()
    {
        return this.devices;
    }

    /**
     * Add new devices to the bed
     * @param device is the new addition to the bed
     */
    public void addDevice(MedicalDevice device)
    {
        this.devices.add(device);
    }

    /**
     * Remove a device from the bed
     * @param device is the removable from the bed
     */
    public void removeDevice(MedicalDevice device)
    {
        this.devices.remove(device);
    }

    /**
     * Get the patient who is occupied the bed
     * @return the patient
     */
    public Patient getPatient()
    {
        return patient;
    }

    /**
     * Assign a new patient to a free bed
     * @param patient who is gonna occupied the bed
     */
    public void assignPatient(Patient patient)
    {
        this.patient = patient;
        this.isOccupied = true;
    }

    /**
     * Release the bed when there is no patient who occupied the bed
     * It is free for the next patient
     */
    public void releaseBed() {
        this.patient = null;
        this.isOccupied = false;
    }
}