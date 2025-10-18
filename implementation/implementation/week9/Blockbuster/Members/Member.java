package implementation.week9.Blockbuster.Members;

public class Member {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private Membership membership;

    /** Constructor */
    public Member(String firstName, String lastName, String email, String phone, String address, Membership membership) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.membership = membership;
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
    public Membership getMembership() { return this.membership; }
    public void setMembership(Membership membership) { this.membership = membership; }
}