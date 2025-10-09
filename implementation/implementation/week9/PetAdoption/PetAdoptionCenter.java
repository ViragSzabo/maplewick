package implementation.week9.PetAdoption;

import implementation.week9.PetAdoption.Exception.FULLHOUSEEXCEPTION;
import implementation.week9.PetAdoption.Exception.NOTFOUND;
import implementation.week9.PetAdoption.Pets.Pet;

import java.util.*;

/**
 * Manages available pets and adoption records
 * Demonstrates OOP, exceptions, and collection handling
 */
public class PetAdoptionCenter {
    private final List<Pet> allPets;
    private final HashMap<Pet, Person> adoptedPets;

    public PetAdoptionCenter() {
        allPets = new ArrayList<>();
        adoptedPets = new HashMap<>();
    }

    public List<Pet> getAllPets() {
        return this.allPets;
    }

    public HashMap<Pet, Person> getAdoptedPets() {
        return this.adoptedPets;
    }

    public void addPet(Pet pet) throws FULLHOUSEEXCEPTION {
        if(allPets.size() > 25) {
            throw new FULLHOUSEEXCEPTION();
        } else {
            allPets.add(pet);
        }
    }

    public void adoptPet(Pet pet, Person owner) throws NOTFOUND {
        if(!allPets.contains(pet) || adoptedPets.containsKey(pet)){
            throw new NOTFOUND();
        } else {
            System.out.println("🎉 Congratulations! The adoption is successful!");
            adoptedPets.put(pet, owner);
            allPets.remove(pet);
        }
    }

    public void trainablePets() {
        for(Pet pet : allPets) {
            if(pet.trainable()) {
                System.out.println(pet.getName() + "\n");
            }
        }
    }

    public void vaccinatedPets() {
        for(Pet pet : allPets) {
            if(pet.isVaccinated()) {
                System.out.println(pet.getName() + "\n");
            }
        }
    }

    public Pet findMostAdoptable() {
        return allPets.stream().max(Comparator.comparing(Pet::calculateAdoptabilityScore)).orElse(null);
    }

    public Pet findCheapestToAdopt() {
        return allPets.stream().min(Comparator.comparing(Pet::calculateAdoptionFee)).orElse(null);
    }

    public Pet findMostExpensive() {
        return allPets.stream().max(Comparator.comparing(Pet::calculateAdoptionFee)).orElse(null);
    }

    public void showComparison() {
        for (Pet p : allPets) {
            System.out.println(p.getName() + " (" + p.getClass().getSimpleName() + ")");
            System.out.println("Adoption Fee: $" + p.calculateAdoptionFee());
            System.out.println("Care Cost: $" + p.calculateCareCost());
            System.out.println("Adoptability Score: " + p.calculateAdoptabilityScore());
            System.out.println("------------------------------------");
        }
    }

    public void sortByFee() {
        allPets.stream().sorted(Comparator.comparing(Pet::calculateAdoptionFee)).forEach(p -> System.out.println(p.getName() + " (" + p.getClass().getSimpleName() + ")"));
    }
}