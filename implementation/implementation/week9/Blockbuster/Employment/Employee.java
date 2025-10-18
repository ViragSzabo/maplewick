package implementation.week9.Blockbuster.Employment;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private double salary;
    private final List<String> favourites;

    /** Constructor */
    public Employee(String firstName, String lastName, String email,
                    String phone, String address, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
        this.favourites = new ArrayList<>();
    }

    /** Getters - Setters */
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getFullName() { return firstName + " " + lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    public List<String> getFavourites() { return favourites; }

    /** Abstract role method */
    public abstract Role getRole();
}