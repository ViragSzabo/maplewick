package implementation.week9.PetAdoption.Enums;

public enum FRIENDLINESS {
    SHY(1),
    FRIENDLY(2),
    EXTROVERT(3);

    private final int value;

    FRIENDLINESS(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}