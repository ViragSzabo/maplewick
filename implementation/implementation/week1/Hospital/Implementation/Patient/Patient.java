package implementation.week1.Hospital.Implementation.Patient;

import java.time.LocalDate;

public class Patient {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Gender gender;
    private boolean canWalk;

    /**
     * Constructor of the Patient
     * @param firstName of the patient
     * @param lastName of the patient
     * @param dateOfBirth of the patient
     * @param gender of the patient
     * @param canWalk - the ability of the patient (yes/no)
     */
    public Patient(String firstName, String lastName, LocalDate dateOfBirth, Gender gender, boolean canWalk) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.canWalk = canWalk;
    }

    /**
     * Calculating the required FTE
     * @return 1.0f or 2.0f depending on the ability of walking
     */
    public float calcRequiredFTE()
    {
        return canWalk ? 1.0f : 2.0f;
    }

    /**
     * Change the ability of walking
     * @param canWalk is false
     */
    public void isCannotWalk(boolean canWalk)
    {
        this.canWalk = false;
    }

    /**
     * Get the ability of walking
     * @return a true statement
     */
    public boolean canWalk()
    {
        return canWalk;
    }

    /**
     * Get the gender of the patient
     * @return Female or Male
     */
    public Gender getGender()
    {
        return gender;
    }

    /**
     * Change the gender of the patient
     * @param gender the new gender
     */
    public void setGender(Gender gender)
    {
        this.gender = gender;
    }

    /**
     * Get the date of birth of the patient
     * @return a local date
     */
    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    /**
     * Change the date of birth of the patient
     * @param dateOfBirth is the new local date
     */
    public void setDateOfBirth(LocalDate dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Get the last name of the patient
     * @return a string
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Change the last name of the patient
     * @param lastName is the string
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * Get the first name of the patient
     * @return a string
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Change the first name of the patient
     * @param firstName is the string
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
}