package implementation.week9.Blockbuster;

import implementation.week9.Blockbuster.Employment.Characters.*;
import implementation.week9.Blockbuster.Employment.Manager;
import implementation.week9.Blockbuster.Members.*;
import implementation.week9.Blockbuster.Rental.Management;
import implementation.week9.Blockbuster.Rental.Rental;
import implementation.week9.Blockbuster.Sales.Movie;

public class Blockbuster {
    public static void main(String[] args) {

        System.out.println("🎬 Scene 1: Setting up Maplewick Blockbuster...\n");

        // 🏪 Create Management System
        Management management = new Management();

        Timmy timmy = new Timmy();
        Eliza eliza = new Eliza();
        Connie connie = new Connie();
        Carlos carlos = new Carlos();
        Hannah hannah = new Hannah();

        management.addEmployee(timmy);
        management.addEmployee(eliza);
        management.addEmployee(connie);
        management.addEmployee(carlos);
        management.addEmployee(hannah);

        System.out.println("\n🎭 Interactions:");
        timmy.motivateTeam();
        eliza.talkToTimmy();
        connie.gossip();
        carlos.suggestIdeas();
        hannah.organizeShelf();
        timmy.showRelationships();

        // 🎥 Add Movies
        Movie m1 = new Movie("The Maplewick Mystery", "A thrilling night in a small town.", "Mystery", 5.99);
        Movie m2 = new Movie("Dancing Leaves", "A cozy autumn romance.", "Romance", 4.49);
        management.addMovie(m1);
        management.addMovie(m2);

        // 👩‍💼 Add Employee (Manager)
        Manager aliceM = new Manager("Alice", "Moon", "alice.m@gmail.com", "+3168674354", "Amsterdam", 250.0);
        management.addEmployee(aliceM);

        // 👤 Create Member and Membership
        Member aliceR = new Member("Alice", "Rose", "alice@maplewick.com", "123456789", "Maplewick 12B",
                new Membership(MembershipType.BASIC, null));
        Membership vip = new Membership(MembershipType.VIP, aliceR);
        aliceR.setMembership(vip);
        management.addMember(aliceR);

        // 🏁 Welcome
        System.out.println("👋 Welcome to Maplewick Blockbuster!");
        vip.showMembershipInfo();

        // 🎞️ Display Available Movies
        System.out.println("\n🍿 Available Movies:");
        management.showAllMovies();

        // 💿 Rental Flow
        System.out.println("\n🎬 Scene 2: Alice rents a movie...");
        management.rent(aliceR, m1);

        Rental rental = new Rental(aliceR, m1);
        rental.showDetails();
        m1.playTrailer();

        System.out.println("\n📀 Returning the movie...");
        management.bringBack(m1);
        rental.markReturned();
        rental.showDetails();

        System.out.println("\n✨ End of Day at Maplewick Blockbuster ✨");
    }
}