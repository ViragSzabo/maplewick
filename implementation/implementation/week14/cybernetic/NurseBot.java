package implementation.week14.cybernetic;

public class NurseBot extends Robot implements Diagnostic
{
    private static final int AVG_COST_PER_ROUNDS = 10;

    private int patientCount;

    public NurseBot(String serialNumber, int patientCount)
    {
        super(serialNumber);
        setPatientCount(patientCount);
    }

    @Override
    public void performTask() throws LowBatteryException
    {
        doRounds();
        System.out.println("NurseBot performed task");
    }

    private void doRounds() throws LowBatteryException
    {
        // 1. Check
        if (getBatteryLevel() < AVG_COST_PER_ROUNDS)
        {
            throw new LowBatteryException("Low battery");
        }

        // 3. Update
        setBatteryLevel(getBatteryLevel() - AVG_COST_PER_ROUNDS);
        System.out.println("Task Complete");
    }

    @Override
    public boolean selfCheck()
    {
        return patientCount < 5;
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