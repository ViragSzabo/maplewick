package implementation.week9.PetAdoption.Pets;

import implementation.week9.PetAdoption.Enums.ACTIVITYLEVEL;
import implementation.week9.PetAdoption.Enums.FRIENDLINESS;
import implementation.week9.PetAdoption.Interface.Trainable;
import implementation.week9.PetAdoption.Interface.Vaccinatable;

public abstract class Pet implements Vaccinatable, Trainable {
    protected String name;
    protected int age;
    protected double careCost; // monthly cost
    protected ACTIVITYLEVEL activityLevel;
    protected FRIENDLINESS friendliness;

    public Pet(String name, int age, ACTIVITYLEVEL activityLevel, FRIENDLINESS friendliness) {
        this.name = name;
        this.age = age;
        this.activityLevel = activityLevel;
        this.friendliness = friendliness;
        this.careCost = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public ACTIVITYLEVEL getActivity() {
        return this.activityLevel;
    }

    public FRIENDLINESS getFriendliness() {
        return this.friendliness;
    }

    public abstract double calculateCareCost();
    public abstract double calculateAdoptionFee();
    public abstract double calculateAdoptabilityScore();
}