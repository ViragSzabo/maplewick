package implementation.week9.PetAdoption.Pets;

import implementation.week9.PetAdoption.Enums.ACTIVITYLEVEL;
import implementation.week9.PetAdoption.Enums.FRIENDLINESS;
import implementation.week9.PetAdoption.Interface.Trainable;
import implementation.week9.PetAdoption.Interface.Vaccinatable;

public class Cat extends Pet implements Vaccinatable, Trainable {
    public Cat(String name, int age, ACTIVITYLEVEL activityLevel, FRIENDLINESS friendliness) {
        super(name, age, activityLevel, friendliness);
    }

    @Override
    public double calculateCareCost() {
        return 70 + (activityLevel.getValue() * 5);
    }

    @Override
    public double calculateAdoptionFee() {
        return 100 - (age * 3);
    }

    @Override
    public double calculateAdoptabilityScore() {
        return (friendliness.getValue() * 6) - age + activityLevel.getValue();
    }

    @Override
    public boolean trainable() {
        return false;
    }

    @Override
    public boolean isVaccinated() {
        return true;
    }
}