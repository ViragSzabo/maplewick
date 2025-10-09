package implementation.week9.PetAdoption;

import implementation.week9.PetAdoption.Pets.Pet;

import java.util.List;

public class Person {
    private String name;
    private List<Pet> adoptedPets;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public List<Pet> getAdoptedPets() {
        return this.adoptedPets;
    }
}