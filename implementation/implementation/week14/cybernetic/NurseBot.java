package implementation.week14.cybernetic;

public class NurseBot extends Robot
{
    private int patientCount;

    public NurseBot(String serialNumber, int patientCount)
    {
        super(serialNumber);
        setPatientCount(patientCount);
    }

    @Override
    public void performTask()
    {
        doRounds();
    }

    private void doRounds()
    {

    }

    public int getPatientCount()
    {
        return patientCount;
    }

    public void setPatientCount(int patientCount)
    {
        if (patientCount < 0)
        {
            throw new IllegalArgumentException("Patient count cannot be negative");
        }

        this.patientCount = patientCount;
    }
}