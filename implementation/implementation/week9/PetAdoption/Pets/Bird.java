package implementation.week9.PetAdoption.Pets;

import implementation.week9.PetAdoption.Enums.ACTIVITYLEVEL;
import implementation.week9.PetAdoption.Enums.FRIENDLINESS;
import implementation.week9.PetAdoption.Interface.Trainable;
import implementation.week9.PetAdoption.Interface.Vaccinatable;

public class Bird extends Pet implements Vaccinatable, Trainable {
    public Bird(String name, int age, ACTIVITYLEVEL activityLevel, FRIENDLINESS friendliness) {
        super(name, age, activityLevel, friendliness);
    }

    @Override
    public double calculateCareCost() {
        return 40 + (activityLevel.getValue()) * 2;
    }

    @Override
    public double calculateAdoptionFee() {
        return 60 - (age * 2);
    }

    @Override
    public double calculateAdoptabilityScore() {
        return friendliness.getValue() * 6 - age + activityLevel.getValue();
    }

    @Override
    public boolean trainable() {
        return true;
    }

    @Override
    public boolean isVaccinated() {
        return false;
    }
}