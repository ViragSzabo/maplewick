package implementation.week1.Hospital.Implementation.Staff;

import java.time.LocalDate;

public class Doctor extends StaffMember
{
    /**
     * Constructor of the doctor
     * @param name is a string
     * @param dateOfBirth is a local date
     * @param occupationStart is a local date
     * @param fte is full-time equivalent
     */
    public Doctor(String name, LocalDate dateOfBirth, LocalDate occupationStart, float fte)
    {
        super(name, dateOfBirth, occupationStart, fte);
    }

    /**
     * Calculating the doctor salary
     * @return a double
     */
    @Override
    public double calculateSalary()
    {
        return 5000.0;
    }
}