package implementation.week9.PetAdoption.Pets;

import implementation.week9.PetAdoption.Enums.ACTIVITYLEVEL;
import implementation.week9.PetAdoption.Enums.FRIENDLINESS;
import implementation.week9.PetAdoption.Interface.Trainable;
import implementation.week9.PetAdoption.Interface.Vaccinatable;

public class Dog extends Pet implements Vaccinatable, Trainable {
    public Dog(String name, int age, ACTIVITYLEVEL activityLevel, FRIENDLINESS friendliness) {
        super(name, age, activityLevel, friendliness);
    }

    @Override
    public double calculateCareCost() {
        return 100 + (activityLevel.getValue() * 10);
    }

    @Override
    public double calculateAdoptionFee() {
        return 150 - (age * 5);
    }

    @Override
    public double calculateAdoptabilityScore() {
        return (friendliness.getValue() * 10) - (age * 1.5) + (activityLevel.getValue() * 2);
    }

    @Override
    public boolean trainable() {
        return true;
    }

    @Override
    public boolean isVaccinated() {
        return true;
    }
}