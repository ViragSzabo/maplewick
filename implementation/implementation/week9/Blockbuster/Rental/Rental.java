package implementation.week9.Blockbuster.Rental;

import implementation.week9.Blockbuster.Members.Member;
import implementation.week9.Blockbuster.Sales.Movie;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Rental implements Rentable {
    private final Member member;
    private final Movie movie;
    private LocalDate date;
    private boolean returned;

    public Rental(Member member, Movie movie) {
        this.member = member;
        this.movie = movie;
        this.date = LocalDate.now();
        this.returned = false;
    }

    public Movie getMovie() { return movie; }
    public boolean isReturned() { return returned; }
    public void markReturned() { this.returned = true; }
    public void setDate(LocalDate date) { this.date = date; }

    @Override
    public double calculateRentalPrice() {
        long days = ChronoUnit.DAYS.between(date, LocalDate.now());
        double basePrice = movie.calculateRentalPrice();
        if(days <= 3) { return basePrice; } // no extra charge
        return basePrice * (days - 3) * 1.50; // late fee
    }

    @Override
    public void showDetails() {
        System.out.println("🎞️ Movie: " + movie.getTitle());
        System.out.println("👤 Member: " + member.getFullName());
        System.out.println("📅 Rented on: " + date);
        System.out.println("💰 Current Price: €" + String.format("%.2f", calculateRentalPrice()));
        System.out.println("📀 Returned: " + (returned ? "✅" : "❌"));
        System.out.println("---------------------------------");
    }
}