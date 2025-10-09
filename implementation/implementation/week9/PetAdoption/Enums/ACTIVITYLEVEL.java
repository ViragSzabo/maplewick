package implementation.week9.PetAdoption.Enums;

public enum ACTIVITYLEVEL {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    public final int value;

    ACTIVITYLEVEL(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}