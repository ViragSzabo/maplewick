package implementation.week9.Blockbuster.Rental;

import implementation.week9.Blockbuster.Employment.Employee;
import implementation.week9.Blockbuster.Members.Member;
import implementation.week9.Blockbuster.Sales.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Management {
    private final List<Member> members;
    private final List<Employee> employees;
    private final List<Movie> movies;
    private final HashMap<Movie, Member> rents;

    /** Constructor */
    public Management() {
        this.members = new ArrayList<Member>();
        this.employees = new ArrayList<>();
        this.movies = new ArrayList<>();
        this.rents = new HashMap<>();
    }

    /** Getters - Setters */
    public List<Member> getMembers() { return members; }
    public List<Employee> getEmployees() { return employees; }
    public List<Movie> getMovies() { return movies; }
    public HashMap<Movie, Member> getRents() { return rents; }

    /** Add, remove methods */
    public void addMember(Member member) { members.add(member); }
    public void addEmployee(Employee employee) { employees.add(employee); }
    public void addMovie(Movie movie) { movies.add(movie); }
    public void addRent(Movie movie, Member member) { rents.put(movie, member); }

    public void showAllMovies() {
        for(Movie movie : movies) {
            System.out.println(movie.getTitle());
        }
    }

    public void rent(Member member, Movie movie) {
        if(rents.containsKey(member)) {
            System.out.println("❌ " + movie.getTitle() + " is already rented!");
        } else {
            rents.put(movie, member);
            System.out.println("✅ " + member.getFirstName() + " rented " + movie.getTitle());
            System.out.println("💸 Price: " + movie.calculateRentalPrice() + "€");
        }
    }

    public void bringBack(Movie movie) {
        if(rents.containsKey(movie)) {
            rents.remove(movie);
            System.out.println("🎞️ " + movie.getTitle() + " has been returned.");
        } else {
            System.out.println("⚠️ Movie not currently rented!");
        }
    }
}