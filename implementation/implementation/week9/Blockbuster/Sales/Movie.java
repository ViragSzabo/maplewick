package implementation.week9.Blockbuster.Sales;

import implementation.week9.Blockbuster.Rental.Rentable;

public class Movie implements Rentable {
    private String title;
    private String description;
    private String genre;
    private double price;

    /** Constructor */
    public Movie(String title, String description, String genre, double price) {
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.price = price;
    }

    /** Getters - Setters */
    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String getGenre() { return genre; }

    public void setGenre(String genre) { this.genre = genre; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price;}

    @Override
    public double calculateRentalPrice() {
        return price * 1.10;
    }

    @Override
    public void showDetails() {
        System.out.println("🎬 " + title + " | " + genre + " | " + price + "€");
        System.out.println("   → " + description);
    }
}