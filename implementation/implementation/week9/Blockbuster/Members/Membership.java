package implementation.week9.Blockbuster.Members;

public class Membership {
    private static int counter = 1;
    private int id;
    private MembershipType type;
    private Member member;

    /** Constructor */
    public Membership(MembershipType type, Member member) {
        this.id = counter++;
        this.type = type;
        this.member = member;
    }

    /** Getters - Setters */
    public int getId() { return id; }
    public MembershipType getType() { return type; }
    public Member getMember() { return member; }
    public void setId(int id) { this.id = id; }
    public void setType(MembershipType type) { this.type = type; }
    public void setMember(Member member) { this.member = member; }
    public void showMembershipInfo() {
        System.out.println("🪪 Membership ID: " + id + " | Type: " + type);
        System.out.println("Perks: " + type.getPerks());
    }
}