package implementation.week9.Blockbuster.Rental;

import implementation.week9.Blockbuster.Employment.Employee;
import implementation.week9.Blockbuster.Members.Member;
import implementation.week9.Blockbuster.Sales.Movie;

import java.util.ArrayList;
import java.util.List;

public class Management {
    private final List<Member> members;
    private final List<Employee> employees;
    private final List<Movie> movies;
    private final List<Rental> rentals;

    public Management() {
        members = new ArrayList<>();
        employees = new ArrayList<>();
        movies = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public void addMember(Member member) { members.add(member); }
    public void addEmployee(Employee employee) { employees.add(employee); }
    public void addMovie(Movie movie) { movies.add(movie); }

    public void showAllMovies() {
        movies.forEach(Movie::showDetails);
    }

    public void rent(Member member, Movie movie) {
        if (rentals.stream().anyMatch(r -> r.getMovie().equals(movie) && !r.isReturned())) {
            System.out.println("❌ " + movie.getTitle() + " is already rented.");
            return;
        }
        Rental rental = new Rental(member, movie);
        rentals.add(rental);
        System.out.println("✅ " + member.getFullName() + " rented " + movie.getTitle() + ".");
    }

    public void bringBack(Movie movie) {
        Rental rental = rentals.stream()
                .filter(r -> r.getMovie().equals(movie) && !r.isReturned())
                .findFirst().orElse(null);

        if (rental != null) {
            rental.markReturned();
            System.out.println("📀 " + movie.getTitle() + " has been returned.");
        } else {
            System.out.println("⚠️ This movie was not rented.");
        }
    }

    public double getDiscountedPrice(Member member, Movie movie) {
        double price = movie.calculateRentalPrice();
        if(member.getMembership() != null) {
            price *= (1 - member.getMembership().getType().getDiscountRate());
        }
        return price;
    }
}