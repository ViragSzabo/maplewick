package implementation.week9.Blockbuster;

import implementation.week9.Blockbuster.Employment.Employee;
import implementation.week9.Blockbuster.Members.Member;
import implementation.week9.Blockbuster.Members.Membership;
import implementation.week9.Blockbuster.Members.MembershipType;
import implementation.week9.Blockbuster.Rental.Management;
import implementation.week9.Blockbuster.Sales.Movie;

public class Blockbuster {
    public static void main(String[] args) {
        Management management = new Management();

        // 🎥 Add Movies
        Movie m1 = new Movie("The Maplewick Mystery", "A thrilling night in a small town.", "Mystery", 5.99);
        Movie m2 = new Movie("Dancing Leaves", "A cozy autumn romance.", "Romance", 4.49);
        management.addMovie(m1);
        management.addMovie(m2);

        // Create Employee
        Employee employee = new Employee("Alice", "Moon", "alice.m@gmail.com", "+3168674354", "Amsterdam", 250.0, "Manager");

        // 👤 Create Member
        Member alice = new Member("Alice", "Rose", "alice@maplewick.com", "123456789", "Maplewick 12B");
        Membership vip = new Membership(MembershipType.VIP, alice);
        management.addMember(alice);

        // 🏁 Welcome Message
        System.out.println("👋 Welcome to Maplewick Blockbuster!");
        System.out.println("Membership: " + vip.getType() + " - " + vip.getType().getPerks());

        System.out.println("\n🍿 Available Movies:");
        management.showAllMovies();

        // 💿 Rent and Return Flow
        management.rent(alice, m1);
        m1.playTrailer();
        management.bringBack(m1);
    }
}