package implementation.week1.Hospital.Implementation.Staff;

import java.time.LocalDate;

/** The abstract class of all staff members */
public abstract class StaffMember {
    protected String name;
    protected LocalDate dateOfBirth;
    protected LocalDate occupationStart;
    private float fte;

    /**
     * Constructor of the Staff member that every staff needs to have
     * @param name is a string of their full name
     * @param dateOfBirth is a local date of their date of birth
     * @param occupationStart is a local date when the staff started to work at the hospital
     * @param fte is full-time equivalent
     */
    public StaffMember(String name, LocalDate dateOfBirth, LocalDate occupationStart, float fte)
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.occupationStart = occupationStart;
        this.fte = fte;
    }

    /**
     * Get the full name of the staff member
     * @return a string
     */
    public String getName()
    {
        return name;
    }

    /**
     * Change the full name of the staff member
     * @param name is the new string
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Get the date of birth of the staff member
     * @return a local date
     */
    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    /**
     * Change the date of birth of the staff member
     * @param dateOfBirth is the new local date
     */
    public void setDateOfBirth(LocalDate dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Get the date when the staff member started to work there
     * @return a local date
     */
    public LocalDate getOccupationStart()
    {
        return occupationStart;
    }

    /**
     * Change the date when the staff member started to work there
     * @param occupationStart is the new local date
     */
    public void setOccupationStart(LocalDate occupationStart)
    {
        this.occupationStart = occupationStart;
    }

    /**
     * Get the unit of measurement of an employee's workload
     * @return a float
     */
    public float getFTE()
    {
        return fte;
    }

    /**
     * Change the unit of measurement of an employee's workload
     * @param fte is the new float
     */
    public void setFTE(float fte)
    {
        this.fte = fte;
    }

    /**
     * The abstract method that is different for each staff member
     * regarding of their status (nurse or doctor)
     * @return a double
     */
    public abstract double calculateSalary();
}