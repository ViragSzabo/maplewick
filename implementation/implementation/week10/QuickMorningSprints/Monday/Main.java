package implementation.week10.QuickMorningSprints.Monday;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        Plant rose = new Plant("rose", 3, 0);
        Plant pumpkin = new Plant("pumpkin", 3, 0);
        Plant strawberry = new Plant("strawberry", 3, 0);

        garden.addPlant(rose);
        garden.addPlant(pumpkin);
        garden.addPlant(strawberry);

        System.out.println("All the plants in the garden: " + garden.getPlants());

        garden.waterAll();
        garden.waterAll();
        garden.waterAll();
        garden.waterAll();
        garden.waterAll();
        garden.waterAll();
        garden.waterAll();

        garden.harvest();

        System.out.println("All the plants in the garden: " + garden.getPlants());
    }
}