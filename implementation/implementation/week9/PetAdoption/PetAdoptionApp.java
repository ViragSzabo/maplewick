package implementation.week9.PetAdoption;

import implementation.week9.PetAdoption.Enums.ACTIVITYLEVEL;
import implementation.week9.PetAdoption.Enums.FRIENDLINESS;
import implementation.week9.PetAdoption.Exception.FULLHOUSEEXCEPTION;
import implementation.week9.PetAdoption.Exception.NOTFOUND;
import implementation.week9.PetAdoption.Pets.Bird;
import implementation.week9.PetAdoption.Pets.Cat;
import implementation.week9.PetAdoption.Pets.Dog;

public class PetAdoptionApp {
    public static void main(String[] args) throws FULLHOUSEEXCEPTION, NOTFOUND {
        PetAdoptionCenter centrum = new PetAdoptionCenter();
        Person visitor1 = new Person("Annabel");

        centrum.addPet(new Dog("Luna", 3, ACTIVITYLEVEL.HIGH, FRIENDLINESS.EXTROVERT));
        centrum.addPet(new Cat("Milo", 2, ACTIVITYLEVEL.MEDIUM, FRIENDLINESS.FRIENDLY));
        centrum.addPet(new Bird("Sunny", 1, ACTIVITYLEVEL.HIGH, FRIENDLINESS.SHY));

        centrum.showComparison();

        System.out.println("🐾 Most Adoptable: " + centrum.findMostAdoptable().getName());
        System.out.println("💰 Cheapest: " + centrum.findCheapestToAdopt().getName());
        System.out.println("👑 Most Expensive: " + centrum.findMostExpensive().getName());
        System.out.println("Vaccinated Pets:");
        centrum.vaccinatedPets();
        System.out.println("Trainable Pets:");
        centrum.trainablePets();

        System.out.println("Available Pets:");
        centrum.sortByFee();

        centrum.adoptPet(centrum.getAllPets().get(0), visitor1);
    }
}