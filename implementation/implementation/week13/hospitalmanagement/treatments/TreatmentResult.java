package implementation.week13.hospitalmanagement.treatments;

public class TreatmentResult
{
    private boolean successful;
    private String message;

    public TreatmentResult(boolean successful, String message)
    {
        setSuccessful(successful);
        setMessage(message);
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message) throws IllegalArgumentException
    {
        if (message.isEmpty() || message.isBlank())
        {
            throw new IllegalArgumentException("Null or blank message");

        }

        this.message = message;
    }

    public boolean isSuccessful()
    {
        return successful;
    }

    public void setSuccessful(boolean successful) throws IllegalArgumentException {
        if (!successful)
        {
            throw new IllegalArgumentException("Failed treatment");
        }

        this.successful = true;
    }
}