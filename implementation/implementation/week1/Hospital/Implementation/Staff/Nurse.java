package implementation.week1.Hospital.Implementation.Staff;

import java.time.LocalDate;

public class Nurse  extends StaffMember
{
    /**
     * Constructor of the nurse
     * @param name is a string
     * @param dateOfBirth is a local date
     * @param occupationStart is a local date
     * @param fte is full-time equivalent
     */
    public Nurse(String name, LocalDate dateOfBirth, LocalDate occupationStart, float fte)
    {
        super(name, dateOfBirth, occupationStart, fte);
    }

    /**
     * Calculating the nurse salary
     * @return a double
     */
    @Override
    public double calculateSalary()
    {
        return 3000.0;
    }
}